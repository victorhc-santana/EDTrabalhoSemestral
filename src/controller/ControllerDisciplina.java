package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
		if (cmd.equals("Cadastrar Disciplina")) {
			try {
				cadastrodisciplina();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (cmd.equals("Atualizar disciplina")) {
			atualizadisciplina();
		}
		if(cmd.equals("Remover Disciplina")) {
			removedisciplina();
		}
		if(cmd.equals("Buscar")) {
			consultadisciplina();
		}
	
	}

	private void cadastrodisciplina() throws IOException {
		Disciplina disc = new Disciplina();
		disc.setCod_curso(Integer.parseInt(tfCodigoCursoDisciplina.getText()));
		disc.setCod_disciplina(Integer.parseInt(tfCodigoDisciplina.getText()));
		disc.setDia_semana(tfDiaSemanaDisciplina.getText());
		disc.setHora_duracao(tfHorasDiariasDisciplinas.getText());
		disc.setHora_inicial(tfHoraInicialDisciplina.getText());
		disc.setNome_disciplina(tfNomeDisciplina.getText());
		arquivadisciplina(disc.toString());
	}

	private void arquivadisciplina(String csvDisciplina) throws IOException {
		String path = System.getProperty("user.home") + File.separator + "SistemaProcessos";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdir();
		}
		File arq = new File(path, "disciplinas.csv");
		boolean existe = false;
		if (arq.exists()) {
			existe = true;
		}
		FileWriter fw = new FileWriter(arq, existe);
		PrintWriter pw = new PrintWriter(fw);
		pw.write(csvDisciplina+"\r\n");
		pw.flush();
		pw.close();
		fw.close();		
	}
	private void atualizadisciplina() {
		// TODO Auto-generated method stub
		
	}

	private void removedisciplina() {
		// TODO Auto-generated method stub
		
	}

	private void consultadisciplina() {
		Disciplina disc = new Disciplina();
		disc.setCod_disciplina(Integer.parseInt(tfCodigoDisciplina.getText()));
		
		
	}
}