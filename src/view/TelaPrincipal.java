package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.ControllerProfessor;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JScrollPane;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNomeProfessor;
	private JTextField tfCpfProfessor;
	private JTextField tfAreaProfessor;
	private JTextField tfPontuacaoProfessor;
	private JTextField tfCodigoDisciplinaAt;
	private JTextField tfNomeDiscAt;
	private JTextField tfDiaSemanaDiscAt;
	private JTextField tfHorasDiaDiscAt;
	private JTextField tfCodCursoDiscAt;
	private JTextField tfHoraInicialDiscAt;
	private JTextField tfCpfProfessorAt;
	private JTextField tfNomeProfAt;
	private JTextField tfAreaProfAt;
	private JTextField tfPontuacaoProfAt;
	private JTextField tfCpfProfessorCr;

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
		
		JLabel lblGuiaCodDisc = new JLabel("Digite o código da disciplina");
		lblGuiaCodDisc.setBounds(20, 27, 205, 34);
		lblGuiaCodDisc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblCodDisciplinaA = new JLabel("Código da disciplina");
		lblCodDisciplinaA.setBounds(20, 72, 121, 34);
		lblCodDisciplinaA.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		tfCodigoDisciplinaAt = new JTextField();
		tfCodigoDisciplinaAt.setBounds(139, 80, 86, 20);
		tfCodigoDisciplinaAt.setColumns(10);
		
		JButton btnBuscarAt = new JButton("Buscar");
		btnBuscarAt.setBounds(235, 79, 89, 23);
		panelAtualizaDisciplina.setLayout(null);
		panelAtualizaDisciplina.add(lblGuiaCodDisc);
		panelAtualizaDisciplina.add(lblCodDisciplinaA);
		panelAtualizaDisciplina.add(tfCodigoDisciplinaAt);
		panelAtualizaDisciplina.add(btnBuscarAt);
		
		JPanel panelEditDadosDisc = new JPanel();
		panelEditDadosDisc.setBorder(new TitledBorder(null, "Editar dados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelEditDadosDisc.setBounds(20, 117, 497, 273);
		panelAtualizaDisciplina.add(panelEditDadosDisc);
		panelEditDadosDisc.setLayout(null);
		
		JPanel panelDadosDisciplinas = new JPanel();
		panelDadosDisciplinas.setBounds(10, 24, 477, 238);
		panelEditDadosDisc.add(panelDadosDisciplinas);
		panelDadosDisciplinas.setLayout(null);
		
		JLabel lblNomeDiscAt = new JLabel("Nome da disciplina");
		lblNomeDiscAt.setBounds(10, 21, 113, 16);
		lblNomeDiscAt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelDadosDisciplinas.add(lblNomeDiscAt);
		
		tfNomeDiscAt = new JTextField();
		tfNomeDiscAt.setColumns(10);
		tfNomeDiscAt.setBounds(125, 20, 86, 20);
		panelDadosDisciplinas.add(tfNomeDiscAt);
		
		JLabel lblDiaSemanaDiscAt = new JLabel("Dia da semana");
		lblDiaSemanaDiscAt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDiaSemanaDiscAt.setBounds(22, 70, 86, 16);
		panelDadosDisciplinas.add(lblDiaSemanaDiscAt);
		
		tfDiaSemanaDiscAt = new JTextField();
		tfDiaSemanaDiscAt.setColumns(10);
		tfDiaSemanaDiscAt.setBounds(125, 69, 86, 20);
		panelDadosDisciplinas.add(tfDiaSemanaDiscAt);
		
		JLabel lblHorasDiaDiscAt = new JLabel("Horas diárias");
		lblHorasDiaDiscAt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHorasDiaDiscAt.setBounds(258, 21, 86, 16);
		panelDadosDisciplinas.add(lblHorasDiaDiscAt);
		
		tfHorasDiaDiscAt = new JTextField();
		tfHorasDiaDiscAt.setColumns(10);
		tfHorasDiaDiscAt.setBounds(354, 20, 86, 20);
		panelDadosDisciplinas.add(tfHorasDiaDiscAt);
		
		JLabel lblCodCursoDiscAt = new JLabel("Código do curso");
		lblCodCursoDiscAt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCodCursoDiscAt.setBounds(252, 70, 92, 16);
		panelDadosDisciplinas.add(lblCodCursoDiscAt);
		
		tfCodCursoDiscAt = new JTextField();
		tfCodCursoDiscAt.setColumns(10);
		tfCodCursoDiscAt.setBounds(354, 69, 86, 20);
		panelDadosDisciplinas.add(tfCodCursoDiscAt);
		
		JLabel lblHoraInicialDiscAt = new JLabel("Hora inicial");
		lblHoraInicialDiscAt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHoraInicialDiscAt.setBounds(142, 138, 69, 16);
		panelDadosDisciplinas.add(lblHoraInicialDiscAt);
		
		tfHoraInicialDiscAt = new JTextField();
		tfHoraInicialDiscAt.setColumns(10);
		tfHoraInicialDiscAt.setBounds(214, 137, 86, 20);
		panelDadosDisciplinas.add(tfHoraInicialDiscAt);
		
		JButton btnAtualizaDisciplina = new JButton("Atualizar disciplina");
		btnAtualizaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAtualizaDisciplina.setBounds(296, 194, 144, 23);
		panelDadosDisciplinas.add(btnAtualizaDisciplina);
		
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
		panelAtualizaProfessor.setLayout(null);
		
		JLabel lblGuiaCpfProfAt = new JLabel("Digite o cpf do professor");
		lblGuiaCpfProfAt.setBounds(59, 5, 199, 20);
		lblGuiaCpfProfAt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelAtualizaProfessor.add(lblGuiaCpfProfAt);
		
		JLabel lblCpfProfessorAt = new JLabel("Cpf do Professor");
		lblCpfProfessorAt.setBounds(10, 91, 113, 16);
		lblCpfProfessorAt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAtualizaProfessor.add(lblCpfProfessorAt);
		
		tfCpfProfessorAt = new JTextField();
		tfCpfProfessorAt.setBounds(121, 90, 86, 20);
		tfCpfProfessorAt.setColumns(10);
		panelAtualizaProfessor.add(tfCpfProfessorAt);
		
		JPanel panelEditaDadoProfAt = new JPanel();
		panelEditaDadoProfAt.setBounds(23, 142, 519, 255);
		panelAtualizaProfessor.add(panelEditaDadoProfAt);
		panelEditaDadoProfAt.setLayout(null);
		
		JPanel panelDadosProfAt = new JPanel();
		panelDadosProfAt.setBounds(10, 5, 499, 239);
		panelEditaDadoProfAt.add(panelDadosProfAt);
		panelDadosProfAt.setLayout(null);
		
		JLabel lblNomeProfAt = new JLabel("New label");
		lblNomeProfAt.setBounds(43, 79, 46, 14);
		panelDadosProfAt.add(lblNomeProfAt);
		
		JLabel lblAreaProfAt = new JLabel("New label");
		lblAreaProfAt.setBounds(305, 79, 46, 14);
		panelDadosProfAt.add(lblAreaProfAt);
		
		JLabel lblPontuacaoProfAt = new JLabel("New label");
		lblPontuacaoProfAt.setBounds(145, 165, 46, 14);
		panelDadosProfAt.add(lblPontuacaoProfAt);
		
		tfNomeProfAt = new JTextField();
		tfNomeProfAt.setBounds(105, 76, 86, 20);
		panelDadosProfAt.add(tfNomeProfAt);
		tfNomeProfAt.setColumns(10);
		
		tfAreaProfAt = new JTextField();
		tfAreaProfAt.setBounds(361, 76, 86, 20);
		panelDadosProfAt.add(tfAreaProfAt);
		tfAreaProfAt.setColumns(10);
		
		tfPontuacaoProfAt = new JTextField();
		tfPontuacaoProfAt.setBounds(228, 162, 86, 20);
		panelDadosProfAt.add(tfPontuacaoProfAt);
		tfPontuacaoProfAt.setColumns(10);
		
		JButton btnAtualizaProf = new JButton("Atualizar Professor");
		btnAtualizaProf.setBounds(361, 205, 89, 23);
		panelDadosProfAt.add(btnAtualizaProf);
		
		JButton btnBuscaProfessor = new JButton("Buscar");
		btnBuscaProfessor.setBounds(217, 89, 89, 23);
		panelAtualizaProfessor.add(btnBuscaProfessor);
				
		//Painel referente a remoção e consulta de Professor
		JPanel panelConsultaProfessor = new JPanel();
		tabbedProfessor.addTab("Consultar", null, panelConsultaProfessor, null);		
		panelConsultaProfessor.setLayout(null);
		
		JLabel lblGuiaCpfProfCr = new JLabel("Digite o cpf do professor");
		lblGuiaCpfProfCr.setBounds(188, 5, 175, 20);
		lblGuiaCpfProfCr.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelConsultaProfessor.add(lblGuiaCpfProfCr);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 149, 486, 185);
		panelConsultaProfessor.add(scrollPane);
		
		JTextArea taDadosProfCr = new JTextArea();
		scrollPane.setViewportView(taDadosProfCr);
		
		JLabel lblCpfProfessorCr = new JLabel("Cpf do Professor");
		lblCpfProfessorCr.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCpfProfessorCr.setBounds(36, 102, 113, 16);
		panelConsultaProfessor.add(lblCpfProfessorCr);
		
		tfCpfProfessorCr = new JTextField();
		tfCpfProfessorCr.setColumns(10);
		tfCpfProfessorCr.setBounds(139, 101, 86, 20);
		panelConsultaProfessor.add(tfCpfProfessorCr);
		
		JButton btnConsultaProf = new JButton("Consultar");
		btnConsultaProf.setBounds(245, 100, 89, 23);
		panelConsultaProfessor.add(btnConsultaProf);
		
		JButton btnRemoveProfessor = new JButton("Remover Professor");
		btnRemoveProfessor.setBackground(new Color(250, 128, 114));
		btnRemoveProfessor.setBounds(398, 345, 89, 23);
		panelConsultaProfessor.add(btnRemoveProfessor);
		
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
		
		ControllerProfessor pCont = new ControllerProfessor(tfNomeProfessor, tfCpfProfessor, tfAreaProfessor, tfPontuacaoProfessor);
		btnCadastroProfessor.addActionListener(pCont);
	}
}
