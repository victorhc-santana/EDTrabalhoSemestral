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

import model.Professor;

public class ControllerProfessor implements ActionListener{
	private JTextField tfNomeProfessor;
	private JTextField tfCpfProfessor;
	private JTextField tfAreaProfessor;
	private JTextField tfPontuacaoProfessor;
	private JTextArea taProfessor; //adicionado
	
	public ControllerProfessor(JTextField tfNomeProfessor, JTextField tfCpfProfessor, JTextField tfAreaProfessor,
			JTextField tfPontuacaoProfessor, JTextArea taProfessor) {
		super();
		this.tfNomeProfessor = tfNomeProfessor;
		this.tfCpfProfessor = tfCpfProfessor;
		this.tfAreaProfessor = tfAreaProfessor;
		this.tfPontuacaoProfessor = tfPontuacaoProfessor;
		this.taProfessor = taProfessor;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Cadastrar professor")) {
			try {
				cadastroprofessor();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (cmd.equals("Atualizar dados do professor")) {
			atualizaprofessor();
		}
		if(cmd.equals("Remover professor")) {
			removeprofessor();
		}
		if(cmd.equals("Buscar")) {
			try {
				consultaprofessor();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	private void cadastroprofessor() throws IOException {
		Professor prof = new Professor();
		prof.setNome_professor(tfNomeProfessor.getText());
		prof.setArea_a_inscrever(tfAreaProfessor.getText());
		prof.setCpf(tfCpfProfessor.getText()); //mudado
		prof.setPontuacao(Double.parseDouble(tfPontuacaoProfessor.getText()));
		System.out.println(prof);
		arquivaprofessor(prof.toString());
		tfNomeProfessor.setText(""); //adicionado
		tfCpfProfessor.setText(""); //adicionado
		tfPontuacaoProfessor.setText(""); //adicionado
		tfAreaProfessor.setText(""); //adicionado
		
	}
	
	private void arquivaprofessor(String csvProfessores) throws IOException {
		String path = System.getProperty("user.home") + File.separator + "SistemaProcessos";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdir();
		}
		File arq = new File(path, "professores.csv");
		boolean existe = false;
		if (arq.exists()) {
			existe = true;
		}
		FileWriter fw = new FileWriter(arq, existe);
		PrintWriter pw = new PrintWriter(fw);
		pw.write(csvProfessores+"\r\n");
		pw.flush();
		pw.close();
		fw.close();	
		
	}

	private void atualizaprofessor() {
		// TODO Auto-generated method stub
				
	}
	
	private void consultaprofessor() throws IOException{
		Professor prof = new Professor();
		//prof.setCpf(Integer.parseInt(tfCpfProfessor.getText()));
		prof.cpf = tfCpfProfessor.getText(); //voltar
		//System.out.println(prof);
		prof  = consultaProf(prof);
		if (prof.nome_professor != null) {
			taProfessor.setText("");
		}else {
			taProfessor.setText("Professor não encontrado");
		}
	}
	
	private Professor consultaProf(Professor prof) throws IOException{
		String path = System.getProperty("user.home") + File.separator + "SistemaProcessos";
		File arq = new File(path, "professores.csv");
		if(arq.exists() && arq.isFile()) {
			FileInputStream fis = new FileInputStream(arq);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader buffer = new BufferedReader(isr);
			String linha = buffer.readLine();
			while (linha != null) {
				String[] vetLinha = linha.split(";");
				if(vetLinha[0].equals(prof.cpf)) { //voltar pq não está pegando o cpf??
					prof.nome_professor = vetLinha[1];
					break;
				}
				linha = buffer.readLine();
			}
			buffer.close();
			isr.close();
			fis.close();	
		}
		return prof;
	}

	private void removeprofessor() {
		// TODO Auto-generated method stub
		
	}
	
} //teste
