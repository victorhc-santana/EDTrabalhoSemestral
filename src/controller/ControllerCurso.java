package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		Curso curso = new Curso();
		curso.setCod_curso(Integer.parseInt(tfCodigoCurso.getText()));
		curso.setNome_curso(tfNomeCurso.getText());
		curso.setArea_de_conhecimento(tfAreaCurso.getText());
		curso.setProcesso_aberto(false);
		
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