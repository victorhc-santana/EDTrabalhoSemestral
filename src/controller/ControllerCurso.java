package controller;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

public class ControllerCurso {
	private JTextField tfNomeCurso;
	private JTextField tfCodigoCurso;
	private JTextField tfAreaCurso;
	
	public ControllerCurso(JTextField tfNomeCurso, JTextField tfCodigoCurso, JTextField tfAreaCurso) {
		super();
		this.tfNomeCurso = tfNomeCurso;
		this.tfCodigoCurso = tfCodigoCurso;
		this.tfAreaCurso = tfAreaCurso;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Cadastrar Professor")) {
			cadastrocurso();
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

	private void cadastrocurso() {
		// TODO Auto-generated method stub
		
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