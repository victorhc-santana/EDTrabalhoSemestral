package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			cadastroprofessor();
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
	private void cadastroprofessor() {
		Professor prof = new Professor();
		prof.setNome_professor(tfNomeProfessor.getText());
		prof.setArea_a_inscrever(tfAreaProfessor.getText());
		prof.setCpf(Integer.parseInt(tfCpfProfessor.getText()));
		prof.setPontuacao(Double.parseDouble(tfPontuacaoProfessor.getText()));
		System.out.println(prof);
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
