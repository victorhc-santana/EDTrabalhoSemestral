package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControllerProfessor;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNomeProfessor;
	private JTextField tfCpfProfessor;
	private JTextField tfAreaProfessor;
	private JTextField tfPontuacaoProfessor;

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
		
		JButton btnCadastroProfessor = new JButton("Cadastrar Professor");
		btnCadastroProfessor.setBounds(207, 301, 129, 23);
		panelCadastroProfessor.add(btnCadastroProfessor);
		
		tfNomeProfessor = new JTextField();
		tfNomeProfessor.setBounds(119, 113, 86, 20);
		panelCadastroProfessor.add(tfNomeProfessor);
		tfNomeProfessor.setColumns(10);
		
		tfCpfProfessor = new JTextField();
		tfCpfProfessor.setBounds(119, 172, 86, 20);
		panelCadastroProfessor.add(tfCpfProfessor);
		tfCpfProfessor.setColumns(10);
		
		tfAreaProfessor = new JTextField();
		tfAreaProfessor.setBounds(386, 113, 86, 20);
		panelCadastroProfessor.add(tfAreaProfessor);
		tfAreaProfessor.setColumns(10);
		
		tfPontuacaoProfessor = new JTextField();
		tfPontuacaoProfessor.setBounds(386, 172, 86, 20);
		panelCadastroProfessor.add(tfPontuacaoProfessor);
		tfPontuacaoProfessor.setColumns(10);
		
		JLabel lblNomeProfessor = new JLabel("Nome do Professor");
		lblNomeProfessor.setBounds(10, 116, 99, 14);
		panelCadastroProfessor.add(lblNomeProfessor);
		
		JLabel lblCpfProfessor = new JLabel("CPF do Professor");
		lblCpfProfessor.setBounds(10, 175, 99, 14);
		panelCadastroProfessor.add(lblCpfProfessor);
		
		JLabel lblArea = new JLabel("Area de conhecimento");
		lblArea.setBounds(260, 116, 116, 14);
		panelCadastroProfessor.add(lblArea);
		
		JLabel lblPontuacao = new JLabel("Pontuacao do professor");
		lblPontuacao.setBounds(260, 175, 116, 14);
		panelCadastroProfessor.add(lblPontuacao);
		
		JLabel lblCadastroProfessor = new JLabel("Cadastro de Professor");
		lblCadastroProfessor.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroProfessor.setBounds(10, 41, 532, 14);
		panelCadastroProfessor.add(lblCadastroProfessor);
				
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
		
		ControllerProfessor pCont = new ControllerProfessor(tfAreaProfessor, tfAreaProfessor, tfAreaProfessor, tfAreaProfessor);
		btnCadastroProfessor.addActionListener(pCont);
	}
}
