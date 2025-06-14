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
		// 1. Validação dos campos obrigatórios
	    if (
	        tfCodigoCursoDisciplina.getText().isEmpty() ||
	        tfCodigoDisciplina.getText().isEmpty() ||
	        tfNomeDisciplina.getText().isEmpty() ||
	        tfDiaSemanaDisciplina.getText().isEmpty() ||
	        tfHoraInicialDisciplina.getText().isEmpty() ||
	        tfHorasDiariasDisciplinas.getText().isEmpty()
	    ) {
	        javax.swing.JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
	        return;
	    }

	    try {
	        // 2. Conversões com segurança
	        int codCurso = Integer.parseInt(tfCodigoCursoDisciplina.getText());
	        int codDisc = Integer.parseInt(tfCodigoDisciplina.getText());

	        Disciplina disc = new Disciplina();
	        disc.setCod_curso(codCurso);
	        disc.setCod_disciplina(codDisc);
	        disc.setDia_semana(tfDiaSemanaDisciplina.getText());
	        disc.setHora_duracao(tfHorasDiariasDisciplinas.getText());
	        disc.setHora_inicial(tfHoraInicialDisciplina.getText());
	        disc.setNome_disciplina(tfNomeDisciplina.getText());

	        arquivadisciplina(disc.toString());

	        javax.swing.JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso!");

	    } catch (NumberFormatException e) {
	        javax.swing.JOptionPane.showMessageDialog(null, "Código da disciplina e curso devem ser números!");
	    }
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