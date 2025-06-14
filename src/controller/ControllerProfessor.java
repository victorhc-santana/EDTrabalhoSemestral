package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextField;

import model.Professor;

public class ControllerProfessor implements ActionListener{
	private JTextField tfNomeProfessor;
	private JTextField tfCpfProfessor;
	private JTextField tfAreaProfessor;
	private JTextField tfPontuacaoProfessor;
	
	public ControllerProfessor(JTextField tfNomeProfessor, JTextField tfCpfProfessor, JTextField tfAreaProfessor,
			JTextField tfPontuacaoProfessor) {
		super();
		this.tfNomeProfessor = tfNomeProfessor;
		this.tfCpfProfessor = tfCpfProfessor;
		this.tfAreaProfessor = tfAreaProfessor;
		this.tfPontuacaoProfessor = tfPontuacaoProfessor;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Cadastrar Professor")) {
			try {
				cadastroprofessor();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
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
			consultaprofessor();
		}
		
	}
	private void cadastroprofessor() throws IOException {
		Professor prof = new Professor();
		prof.setNome_professor(tfNomeProfessor.getText());
		prof.setArea_a_inscrever(tfAreaProfessor.getText());
		prof.setCpf(Integer.parseInt(tfCpfProfessor.getText()));
		prof.setPontuacao(Double.parseDouble(tfPontuacaoProfessor.getText()));
		System.out.println(prof);
		arquivaprofessor(prof.toString());
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
	
	private void consultaprofessor() {
		Professor prof = new Professor();
		prof.setCpf(Integer.parseInt(tfCpfProfessor.getText()));
		
		System.out.println(prof);
		
	}
	
	private void removeprofessor() {
		// TODO Auto-generated method stub
		
	}
	
}
