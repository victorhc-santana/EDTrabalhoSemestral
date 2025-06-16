package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.edu.fateczl.Lista;
import model.Curso;

public class ControllerCurso implements ActionListener{
	private JTextField tfNomeCurso;
	private JTextField tfCodigoCurso;
	private JTextField tfAreaCurso;
	private JTextArea taCurso;
	private Lista<Curso> LCurso;
	
	public ControllerCurso(JTextField tfNomeCurso, JTextField tfCodigoCurso, JTextField tfAreaCurso, JTextArea taCurso) {
		super();
		this.tfNomeCurso = tfNomeCurso;
		this.tfCodigoCurso = tfCodigoCurso;
		this.tfAreaCurso = tfAreaCurso;
		this.taCurso= taCurso;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Cadastrar Curso")) {
			try {
				cadastrocurso();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (cmd.equals("Atualizar dados do professor")) {
			atualizacurso();
		}
		if(cmd.equals("Remover professor")) {
			removecurso();
		}
		if(cmd.equals("Buscar")) {
			try {
				consultacurso();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	
	//teste
}

	private void cadastrocurso() throws Exception {
		Curso curso = new Curso();
		curso.setCod_curso(tfCodigoCurso.getText());
		curso.setNome_curso(tfNomeCurso.getText());
		curso.setArea_de_conhecimento(tfAreaCurso.getText());
		curso.setProcesso_aberto(false);
		
		pegalista(curso, LCurso);
		adicionalistacurso(curso, LCurso);
		
		curso.setCod_curso("");
		curso.setNome_curso("");
		curso.setArea_de_conhecimento("");			
	}
	//Atualiza a lista com o arquivo, para caso o arquivo não esteja vazio
	private void pegalista(Curso curso, Lista<Curso> lCurso2) {
		
	}

	//verifica se um curso com mesmo codigo ja existe, se nao, adiciona o curso a lista
	private Lista<Curso> adicionalistacurso(Curso curso, Lista<Curso> LCurso) throws Exception {
		if (cursoexiste(curso, LCurso) == true){
			taCurso.setText("Curso ja cadastrado!");
			return LCurso;
		}else {
			if(LCurso.isEmpty()) {
				LCurso.addFirst(curso);
			} else {
				LCurso.addLast(curso);
			}
		arquivacurso(curso.toString());
		taCurso.setText("O curso foi cadastrado!");
		return LCurso;	
		}
	}
	
	private boolean cursoexiste(Curso curso, Lista<Curso> LCurso) throws Exception {
		for (int i = 0; i < LCurso.size();i++) {
			if(LCurso.isEmpty()) {
				return false;
			} else if(LCurso.get(i).getCod_curso() == curso.getCod_curso()) {
				return true;
			}
		}
		return false;
		
	}

	//registra o curso no aquivo
	private void arquivacurso(String csvCursos) throws IOException {
		String path = System.getProperty("user.home") + File.separator + "SistemaProcessos";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdir();
		}
		File arq = new File(path, "cursos.csv");
		boolean existe = false;
		if (arq.exists()) {
			existe = true;
		}
		FileWriter fw = new FileWriter(arq, existe);
		PrintWriter pw = new PrintWriter(fw);
		pw.write(csvCursos+"\r\n");
		pw.flush();
		pw.close();
		fw.close();	
		
	}
	

	private void atualizacurso() {
		// TODO Auto-generated method stub
		
	}

	private void removecurso() {
		// TODO Auto-generated method stub
		
	}

	private void consultacurso() throws IOException {
		Curso curso = new Curso();
		curso.setCod_curso(tfCodigoCurso.getText());
		
		curso = buscacurso(curso);
		if (curso != null) {
			taCurso.setText("Codigo do curso: "+curso.getCod_curso()+" - Nome do curso: "+curso.getNome_curso()+
					" - area de conhecimento do curso: "+curso.getArea_de_conhecimento());
		} else {
			taCurso.setText("Curso não encontrado");
		}
	}

	private Curso buscacurso(Curso curso) throws IOException {
		String path = System.getProperty("user.home") + File.separator + "SistemaProcessos";
		File arq = new File(path, "cursos.csv");
		if(arq.exists() && arq.isFile()) {
			FileInputStream fis = new FileInputStream(arq);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader buffer = new BufferedReader(isr);
			String linha = buffer.readLine();
			while(linha != null) {
				String[] vetlinha = linha.split(";");
				if(vetlinha[0].equals(curso.getCod_curso())) {
					curso.setNome_curso(vetlinha[1]);
					curso.setArea_de_conhecimento(vetlinha[2]);
					break;
				}
				linha.split(linha);
			}
			buffer.close();
			isr.close();
			fis.close();
		}
		return curso;
	}
}