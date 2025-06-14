package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import model.Inscricao;

public class ControllerInscricao implements ActionListener{
	private JTextField tfCodigoProfessorIns;
	private JTextField tfCodigoProcessoIns;
	private JTextField tfCodigoDisciplinaIns;
	
	public ControllerInscricao(JTextField tfCodigoProfessorIns, JTextField tfCodigoProcessoIns,
			JTextField tfCodigoDisciplinaIns) {
		super();
		this.tfCodigoProfessorIns = tfCodigoProfessorIns;
		this.tfCodigoProcessoIns = tfCodigoProcessoIns;
		this.tfCodigoDisciplinaIns = tfCodigoDisciplinaIns;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Cadastrar Professor")) {
			cadastroinscricao();
		}
		if (cmd.equals("Atualizar dados do professor")) {
			atualizainscricao();
		}
		if(cmd.equals("Remover professor")) {
			removeinscricao();
		}
		if(cmd.equals("Buscar")) {
			consultainscricao();
		}
	
	}

	private void cadastroinscricao() {
		Inscricao ins = new Inscricao();
		ins.setCod_disciplina(Integer.parseInt(tfCodigoDisciplinaIns.getText()));
		ins.setCpf_prof(Integer.parseInt(tfCodigoProfessorIns.getText()));
		ins.setCod_processo(Integer.parseInt(tfCodigoProcessoIns.getText()));		
	}

	private void atualizainscricao() {
		// TODO Auto-generated method stub
		
	}

	private void removeinscricao() {
		// TODO Auto-generated method stub
		
	}

	private void consultainscricao() {
		// TODO Auto-generated method stub
		
	}
	
}
