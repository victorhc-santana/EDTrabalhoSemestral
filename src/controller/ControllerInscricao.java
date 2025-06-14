package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
			try {
				cadastroinscricao();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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

	private void cadastroinscricao() throws IOException {
		Inscricao ins = new Inscricao();
		ins.setCod_disciplina(Integer.parseInt(tfCodigoDisciplinaIns.getText()));
		ins.setCpf_prof(Integer.parseInt(tfCodigoProfessorIns.getText()));
		ins.setCod_processo(Integer.parseInt(tfCodigoProcessoIns.getText()));
		arquivainscricao(ins.toString());
	}

	private void arquivainscricao(String csvInscricoes) throws IOException {
		String path = System.getProperty("user.home") + File.separator + "SistemaProcessos";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdir();
		}
		File arq = new File(path, "inscricoes.csv");
		boolean existe = false;
		if (arq.exists()) {
			existe = true;
		}
		FileWriter fw = new FileWriter(arq, existe);
		PrintWriter pw = new PrintWriter(fw);
		pw.write(csvInscricoes+"\r\n");
		pw.flush();
		pw.close();
		fw.close();	
		
		
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
