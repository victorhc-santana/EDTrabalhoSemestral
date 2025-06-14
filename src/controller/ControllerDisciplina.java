package controller;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import model.Disciplina;

public class ControllerDisciplina implements ActionListener{
	private JTextField tfNomeDisciplina;
	private JTextField tfCodigoDisciplina;
	private JTextField tfCodigoCursoDisciplina;
	private JTextField tfDiaSemanaDisciplina;
	private JTextField tfHoraInicialDisciplina;
	private JTextField tfHorasDiariasDisciplinas;
	
	public ControllerDisciplina(JTextField nomeDisciplina, JTextField codigoDisciplina, JTextField areaDisciplina,
			JTextField diaSemanaDisciplina, JTextField horaInicialDisciplina, JTextField horasDiariasDisciplinas) {
		super();
		tfNomeDisciplina = nomeDisciplina;
		tfCodigoDisciplina = codigoDisciplina;
		tfCodigoCursoDisciplina = areaDisciplina;
		tfDiaSemanaDisciplina = diaSemanaDisciplina;
		tfHoraInicialDisciplina = horaInicialDisciplina;
		tfHorasDiariasDisciplinas = horasDiariasDisciplinas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Cadastrar Professor")) {
			cadastrodisciplina();
		}
		if (cmd.equals("Atualizar dados do professor")) {
			atualizadisciplina();
		}
		if(cmd.equals("Remover professor")) {
			removedisciplina();
		}
		if(cmd.equals("Buscar")) {
			consultadisciplina();
		}
	
	}

	private void cadastrodisciplina() {
		Disciplina disc = new Disciplina();
		disc.setCod_curso(Integer.parseInt(tfCodigoCursoDisciplina.getText()));
		
	}

	private void atualizadisciplina() {
		// TODO Auto-generated method stub
		
	}

	private void removedisciplina() {
		// TODO Auto-generated method stub
		
	}

	private void consultadisciplina() {
		// TODO Auto-generated method stub
		
	}
}