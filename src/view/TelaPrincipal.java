package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
