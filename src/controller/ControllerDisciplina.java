package controller;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ControllerDisciplina implements ActionListener{
	private JTextField NomeDisciplina;
	private JTextField CodigoDisciplina;
	private JTextField AreaDisciplina;
	private JTextField DiaSemanaDisciplina;
	private JTextField HoraInicialDisciplina;
	private JTextField HorasDiariasDisciplinas;
	
	public ControllerDisciplina(JTextField nomeDisciplina, JTextField codigoDisciplina, JTextField areaDisciplina,
			JTextField diaSemanaDisciplina, JTextField horaInicialDisciplina, JTextField horasDiariasDisciplinas) {
		super();
		NomeDisciplina = nomeDisciplina;
		CodigoDisciplina = codigoDisciplina;
		AreaDisciplina = areaDisciplina;
		DiaSemanaDisciplina = diaSemanaDisciplina;
		HoraInicialDisciplina = horaInicialDisciplina;
		HorasDiariasDisciplinas = horasDiariasDisciplinas;
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
		// TODO Auto-generated method stub
		
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