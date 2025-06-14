package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextField;

import model.Curso;

public class ControllerCurso implements ActionListener{
	private JTextField tfNomeCurso;
	private JTextField tfCodigoCurso;
	private JTextField tfAreaCurso;
	
	public ControllerCurso(JTextField tfNomeCurso, JTextField tfCodigoCurso, JTextField tfAreaCurso) {
		super();
		this.tfNomeCurso = tfNomeCurso;
		this.tfCodigoCurso = tfCodigoCurso;
		this.tfAreaCurso = tfAreaCurso;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Cadastrar Professor")) {
			try {
				cadastrocurso();
			} catch (IOException e1) {
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
			consultacurso();
		}
	
	
}

	private void cadastrocurso() throws IOException {
		Curso curso = new Curso();
		curso.setCod_curso(Integer.parseInt(tfCodigoCurso.getText()));
		curso.setNome_curso(tfNomeCurso.getText());
		curso.setArea_de_conhecimento(tfAreaCurso.getText());
		curso.setProcesso_aberto(false);
		arquivacurso(curso.toString());
		
	}

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

	private void consultacurso() {
		// TODO Auto-generated method stub
		

	}
}