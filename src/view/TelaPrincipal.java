package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
<<<<<<< HEAD
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
=======
import javax.swing.JButton;
import javax.swing.JTextField;
>>>>>>> branch 'master' of https://github.com/victorhc-santana/EDTrabalhoSemestral.git

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
<<<<<<< HEAD
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
=======
>>>>>>> branch 'master' of https://github.com/victorhc-santana/EDTrabalhoSemestral.git

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Usa absolute layout
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Inicia aba para a tela de CRUD das classes
		JTabbedPane tabbedClasse = new JTabbedPane(JTabbedPane.TOP);
		tabbedClasse.setBounds(0, 0, 624, 441);
		contentPane.add(tabbedClasse);
		
		//Inicia aba para o CRUD de Disciplinas
		JTabbedPane tabbedDisciplinas = new JTabbedPane(JTabbedPane.LEFT);
		tabbedClasse.addTab("Disciplinas", null, tabbedDisciplinas, null);
		
		//Painel referente ao cadastro de disciplina
		JPanel panelCadastroDisciplina = new JPanel();
		tabbedDisciplinas.addTab("Inserir", null, panelCadastroDisciplina, null);
		
		//Painel referente a atualizacao de disciplinas
		JPanel panelAtualizaDisciplina = new JPanel();
		tabbedDisciplinas.addTab("Atualizar", null, panelAtualizaDisciplina, null);
		
		JLabel lblNewLabel = new JLabel("Digite o código da disciplina");
		lblNewLabel.setBounds(20, 27, 205, 34);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("Código da disciplina");
		lblNewLabel_1.setBounds(20, 72, 121, 34);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setBounds(139, 80, 86, 20);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.setBounds(235, 79, 89, 23);
		panelAtualizaDisciplina.setLayout(null);
		panelAtualizaDisciplina.add(lblNewLabel);
		panelAtualizaDisciplina.add(lblNewLabel_1);
		panelAtualizaDisciplina.add(textField);
		panelAtualizaDisciplina.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Editar dados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(20, 117, 497, 273);
		panelAtualizaDisciplina.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 24, 477, 238);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nome da disciplina");
		lblNewLabel_1_2.setBounds(10, 21, 113, 16);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblNewLabel_1_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 20, 86, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Dia da semana");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_1.setBounds(22, 70, 86, 16);
		panel.add(lblNewLabel_1_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(125, 69, 86, 20);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Horas diárias");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_2.setBounds(258, 21, 86, 16);
		panel.add(lblNewLabel_1_2_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(354, 20, 86, 20);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Código do curso");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_2_1.setBounds(252, 70, 92, 16);
		panel.add(lblNewLabel_1_2_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(354, 69, 86, 20);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Hora inicial");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_1_1.setBounds(142, 138, 69, 16);
		panel.add(lblNewLabel_1_2_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(214, 137, 86, 20);
		panel.add(textField_5);
		
		JButton btnNewButton_1 = new JButton("Atualizar disciplina");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(296, 194, 144, 23);
		panel.add(btnNewButton_1);
		
		//Painel referente a remoção e consulta de disciplinas
		JPanel panelConsultaDisciplina = new JPanel();
		tabbedDisciplinas.addTab("Consultar", null, panelConsultaDisciplina, null);
		
		//Inicia aba para o CRUD de Curso
		JTabbedPane tabbedCurso = new JTabbedPane(JTabbedPane.LEFT);
		tabbedClasse.addTab("Cursos", null, tabbedCurso, null);
		
		//Painel referente ao cadastro de cursos
		JPanel panelCadastroCurso = new JPanel();
		tabbedCurso.addTab("Inserir", null, panelCadastroCurso, null);
		
		//Painel referente a atualizacao de cursos
		JPanel panelAtualizaCurso = new JPanel();
		tabbedCurso.addTab("Atualizar", null, panelAtualizaCurso, null);
						
		//Painel referente a remoção e consulta de cursos
		JPanel panelConsultaCurso = new JPanel();
		tabbedCurso.addTab("Consultar", null, panelConsultaCurso, null);	
		
		//Inicia aba para o CRUD de Professor
		JTabbedPane tabbedProfessor = new JTabbedPane(JTabbedPane.LEFT);
		tabbedClasse.addTab("Professores", null, tabbedProfessor, null);
		
		//Painel referente ao cadastro de Professor
		JPanel panelCadastroProfessor = new JPanel();
		tabbedProfessor.addTab("Inserir", null, panelCadastroProfessor, null);
		panelCadastroProfessor.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(209, 299, 89, 23);
		panelCadastroProfessor.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setBounds(119, 113, 86, 20);
		panelCadastroProfessor.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 172, 86, 20);
		panelCadastroProfessor.add(textField_1);
		textField_1.setColumns(10);
				
		//Painel referente a atualizacao de Professor
		JPanel panelAtualizaProfessor = new JPanel();
		tabbedProfessor.addTab("Atualizar", null, panelAtualizaProfessor, null);
				
		//Painel referente a remoção e consulta de Professor
		JPanel panelConsultaProfessor = new JPanel();
		tabbedProfessor.addTab("Consultar", null, panelConsultaProfessor, null);		
		
		//Inicia aba para o CRUD de Inscricao
		JTabbedPane tabbedInscricao = new JTabbedPane(JTabbedPane.LEFT);
		tabbedClasse.addTab("Inscricoes", null, tabbedInscricao, null);
		
		//Painel referente ao cadastro de Inscricao
		JPanel panelCadastroInscricao = new JPanel();
		tabbedInscricao.addTab("Inserir", null, panelCadastroInscricao, null);
		
		JButton button = new JButton("New button");
		panelCadastroInscricao.add(button);
						
		//Painel referente a atualizacao de Inscricao
		JPanel panelAtualizaInscricao = new JPanel();
		tabbedInscricao.addTab("Atualizar", null, panelAtualizaInscricao, null);
						
		//Painel referente a remoção e consulta de Inscricao
		JPanel panelConsultaInscricao = new JPanel();
		tabbedInscricao.addTab("Consultar", null, panelConsultaInscricao, null);
		
		//Inicia painel para consulta de nota de professor por disciplina
		JPanel panelNotas = new JPanel();
		tabbedClasse.addTab("Notas", null, panelNotas, null);
		
		//Inicia painel de consulta de processos 
		JPanel panelProcessos = new JPanel();
		tabbedClasse.addTab("Processos", null, panelProcessos, null);
		
	}
}
