package controller;

import br.edu.fateczl.Lista;
import br.edu.fateczl.fila.Fila;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

import model.Disciplina;

public class ControllerDisciplina implements ActionListener {

    private Lista<Disciplina> listaDisciplinas = new Lista<>();
    private JTextField tfNomeDisciplina;
    private JTextField tfCodigoDisciplina;
    private JTextField tfCodigoCursoDisciplina;
    private JTextField tfDiaSemanaDisciplina;
    private JTextField tfHoraInicialDisciplina;
    private JTextField tfHorasDiariasDisciplinas;

    public ControllerDisciplina(JTextField nomeDisciplina, JTextField codigoDisciplina, JTextField areaDisciplina,
                                 JTextField diaSemanaDisciplina, JTextField horaInicialDisciplina, JTextField horasDiariasDisciplinas) {
        tfNomeDisciplina = nomeDisciplina;
        tfCodigoDisciplina = codigoDisciplina;
        tfCodigoCursoDisciplina = areaDisciplina;
        tfDiaSemanaDisciplina = diaSemanaDisciplina;
        tfHoraInicialDisciplina = horaInicialDisciplina;
        tfHorasDiariasDisciplinas = horasDiariasDisciplinas;

        carregarDisciplinas(); // <- carrega o CSV na memória ao iniciar
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        try {
            if (cmd.equals("Cadastrar Disciplina")) {
                cadastrodisciplina();
            } else if (cmd.equals("Atualizar Disciplina")) {
                atualizadisciplina();
            } else if (cmd.equals("Remover Disciplina")) {
                removedisciplina();
            } else if (cmd.equals("Buscar")) {
                consultadisciplina();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        }
    }

    private void cadastrodisciplina() throws IOException {
        if (
            tfCodigoCursoDisciplina.getText().isEmpty() ||
            tfCodigoDisciplina.getText().isEmpty() ||
            tfNomeDisciplina.getText().isEmpty() ||
            tfDiaSemanaDisciplina.getText().isEmpty() ||
            tfHoraInicialDisciplina.getText().isEmpty() ||
            tfHorasDiariasDisciplinas.getText().isEmpty()
        ) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            return;
        }

        try {
            int codCurso = Integer.parseInt(tfCodigoCursoDisciplina.getText());
            int codDisc = Integer.parseInt(tfCodigoDisciplina.getText());

            Disciplina disc = new Disciplina();
            disc.setCod_curso(codCurso);
            disc.setCod_disciplina(codDisc);
            disc.setDia_semana(tfDiaSemanaDisciplina.getText());
            disc.setHora_duracao(tfHorasDiariasDisciplinas.getText());
            disc.setHora_inicial(tfHoraInicialDisciplina.getText());
            disc.setNome_disciplina(tfNomeDisciplina.getText());

            try {
                listaDisciplinas.add(disc, listaDisciplinas.size());
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao adicionar na lista.");
                return;
            };

            arquivadisciplina(disc.toString());

            JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Código da disciplina e curso devem ser números!");
        }
    }

    private void arquivadisciplina(String csvDisciplina) throws IOException {
        String path = System.getProperty("user.home") + File.separator + "SistemaProcessos";
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }

        File arq = new File(path, "disciplinas.csv");
        FileWriter fw = new FileWriter(arq, true); // append = true
        PrintWriter pw = new PrintWriter(fw);
        pw.println(csvDisciplina);
        pw.flush();
        pw.close();
        fw.close();
    }

    	private void atualizadisciplina() {
    	    String cod = tfCodigoDisciplina.getText();

    	    for (int i = 0; i < listaDisciplinas.size(); i++) {
    	        try {
    	            Disciplina d = listaDisciplinas.get(i);
    	            if (String.valueOf(d.getCod_disciplina()).equals(cod)) {
    	                d.setNome_disciplina(tfNomeDisciplina.getText());
    	                d.setDia_semana(tfDiaSemanaDisciplina.getText());
    	                d.setHora_duracao(tfHorasDiariasDisciplinas.getText());
    	                d.setHora_inicial(tfHoraInicialDisciplina.getText());
    	                d.setCod_curso(Integer.parseInt(tfCodigoCursoDisciplina.getText()));

    	                salvarListaNoArquivo(); // <-- salva após atualizar
    	                JOptionPane.showMessageDialog(null, "Disciplina atualizada na lista.");
    	                return;
    	            }
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        }
    	    }

    	    JOptionPane.showMessageDialog(null, "Disciplina não encontrada.");
    	
    	}

    	private void removedisciplina() {
    	    String cod = tfCodigoDisciplina.getText();

    	    for (int i = 0; i < listaDisciplinas.size(); i++) {
    	        try {
    	            Disciplina d = listaDisciplinas.get(i);
    	            if (String.valueOf(d.getCod_disciplina()).equals(cod)) {
    	                listaDisciplinas.remove(i);
    	                salvarListaNoArquivo(); // <-- salva após remover
    	                JOptionPane.showMessageDialog(null, "Disciplina removida da lista.");
    	                return;
    	            }
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        }
    	    }

    	    JOptionPane.showMessageDialog(null, "Disciplina não encontrada.");
   

    }

    private void salvarListaNoArquivo() throws IOException {
        String path = System.getProperty("user.home") + File.separator + "SistemaProcessos";
        File arq = new File(path, "disciplinas.csv");

        FileWriter fw = new FileWriter(arq, false); // false = sobrescreve o arquivo
        PrintWriter pw = new PrintWriter(fw);

        for (int i = 0; i < listaDisciplinas.size(); i++) {
            try {
                Disciplina d = listaDisciplinas.get(i);
                pw.println(d.toString());
            } catch (Exception e) {
                e.printStackTrace(); // opcional
            }
        }

        pw.flush();
        pw.close();
        fw.close();
    }



    private void consultadisciplina() {
        String cod = tfCodigoDisciplina.getText();
        Fila<Disciplina> fila = new Fila<>();

        try {
            for (int i = 0; i < listaDisciplinas.size(); i++) {
                fila.insert(listaDisciplinas.get(i));
            }

            while (!fila.isEmpty()) {
                Disciplina d = fila.remove();

                if (String.valueOf(d.getCod_disciplina()).equals(cod)) {
                    tfNomeDisciplina.setText(d.getNome_disciplina());
                    tfDiaSemanaDisciplina.setText(d.getDia_semana());
                    tfHoraInicialDisciplina.setText(d.getHora_inicial());
                    tfHorasDiariasDisciplinas.setText(d.getHora_duracao());
                    tfCodigoCursoDisciplina.setText(String.valueOf(d.getCod_curso()));
                    JOptionPane.showMessageDialog(null, "Disciplina encontrada via Fila!");
                    return;
                }
            }

            JOptionPane.showMessageDialog(null, "Disciplina não encontrada na fila.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void carregarDisciplinas() {
        String path = System.getProperty("user.home") + File.separator + "SistemaProcessos";
        File arq = new File(path, "disciplinas.csv");

        if (arq.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    try {
                        String[] dados = linha.split(";");

                        // Validação: deve conter exatamente 6 elementos
                        if (dados.length != 6) {
                            continue; // ignora linhas malformadas
                        }

                        // Validação: verifica se os dois primeiros são números
                        int codCurso = Integer.parseInt(dados[0].trim());
                        int codDisc = Integer.parseInt(dados[1].trim());

                        Disciplina d = new Disciplina();
                        d.setCod_curso(codCurso);
                        d.setCod_disciplina(codDisc);
                        d.setNome_disciplina(dados[2]);
                        d.setDia_semana(dados[3]);
                        d.setHora_inicial(dados[4]);
                        d.setHora_duracao(dados[5]);

                        listaDisciplinas.add(d, listaDisciplinas.size());
                    } catch (Exception linhaErrada) {
                        // Apenas ignora a linha mal formatada e continua lendo
                        System.out.println("Linha ignorada: " + linha);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao carregar disciplinas do arquivo.");
            }
        }
    }

}
