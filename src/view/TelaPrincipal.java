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
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNomeProfessor;
	private JTextField tfCpfProfessor;
	private JTextField tfAreaProfessor;
	private JTextField tfPontuacaoProfessor;
	private JTextField tfCpfProfessorAt;
	private JTextField tfNomeProfAt;
	private JTextField tfAreaProfAt;
	private JTextField tfPontuacaoProfAt;
	private JTextField tfCpfProfessorCr;
	private JTextField tfNomeDisciplina;
	private JTextField tfCodigoDisciplina;
	private JTextField tfDiaSemanaDisciplina;
	private JTextField tfHorasDiariasDisciplina;
	private JTextField tfCodigoCursoDisciplina;
	private JTextField tfHoraInicialDisciplina;
	private JTextField tfCodigoCurso;
	private JTextField tfNomeCurso;
	private JTextField tfAreaConhecimento;
	private JTextField taCodCurso;
	private JTextField taCodDisciplina;
	private JTextField taCodProfessor;
	private JTextField taCodProcesso;

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
		
		JPanel panel = new JPanel();
		tabbedClasse.addTab("New tab", null, panel, null);
		
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
		
		JPanel panelDisciplinas = new JPanel();
		tabbedClasse.addTab("Disciplinas", null, panelDisciplinas, null);
		panelDisciplinas.setLayout(null);
		
		JLabel lblCodDisciplina = new JLabel("Código da disciplina");
		lblCodDisciplina.setBounds(28, 92, 121, 34);
		lblCodDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelDisciplinas.add(lblCodDisciplina);
		
		JLabel lblNomeDisciplina = new JLabel("Nome da disciplina");
		lblNomeDisciplina.setBounds(28, 65, 113, 16);
		lblNomeDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelDisciplinas.add(lblNomeDisciplina);
		
		JLabel lblDiaSemanaDisciplina = new JLabel("Dia da semana");
		lblDiaSemanaDisciplina.setBounds(28, 140, 86, 16);
		lblDiaSemanaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelDisciplinas.add(lblDiaSemanaDisciplina);
		
		JLabel lblHorasDiaDisciplina = new JLabel("Horas diárias");
		lblHorasDiaDisciplina.setBounds(374, 67, 86, 16);
		lblHorasDiaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelDisciplinas.add(lblHorasDiaDisciplina);
		
		JLabel lblCodCursoDisciplina = new JLabel("Código do curso");
		lblCodCursoDisciplina.setBounds(374, 103, 92, 16);
		lblCodCursoDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelDisciplinas.add(lblCodCursoDisciplina);
		
		JLabel lblHoraInicialDisciplina = new JLabel("Hora inicial");
		lblHoraInicialDisciplina.setBounds(374, 142, 69, 16);
		lblHoraInicialDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelDisciplinas.add(lblHoraInicialDisciplina);
		
		JButton btnAtualizaDisciplina = new JButton("Atualizar disciplina");
		btnAtualizaDisciplina.setBounds(316, 357, 144, 23);
		btnAtualizaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelDisciplinas.add(btnAtualizaDisciplina);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 167, 599, 160);
		panelDisciplinas.add(scrollPane_1);
		
		JTextArea taDisciplina = new JTextArea();
		scrollPane_1.setViewportView(taDisciplina);
		
		JButton btnCadastroDisciplina = new JButton("Cadastrar Disciplina");
		btnCadastroDisciplina.setBounds(470, 357, 139, 23);
		panelDisciplinas.add(btnCadastroDisciplina);
		
		JButton btnBuscaDisciplina = new JButton("Buscar");
		btnBuscaDisciplina.setBounds(253, 99, 89, 23);
		panelDisciplinas.add(btnBuscaDisciplina);
		
		tfNomeDisciplina = new JTextField();
		tfNomeDisciplina.setBounds(151, 64, 86, 20);
		panelDisciplinas.add(tfNomeDisciplina);
		tfNomeDisciplina.setColumns(10);
		
		tfCodigoDisciplina = new JTextField();
		tfCodigoDisciplina.setBounds(151, 100, 86, 20);
		panelDisciplinas.add(tfCodigoDisciplina);
		tfCodigoDisciplina.setColumns(10);
		
		tfDiaSemanaDisciplina = new JTextField();
		tfDiaSemanaDisciplina.setBounds(151, 139, 86, 20);
		panelDisciplinas.add(tfDiaSemanaDisciplina);
		tfDiaSemanaDisciplina.setColumns(10);
		
		tfHorasDiariasDisciplina = new JTextField();
		tfHorasDiariasDisciplina.setBounds(473, 64, 86, 20);
		panelDisciplinas.add(tfHorasDiariasDisciplina);
		tfHorasDiariasDisciplina.setColumns(10);
		
		tfCodigoCursoDisciplina = new JTextField();
		tfCodigoCursoDisciplina.setBounds(473, 100, 86, 20);
		panelDisciplinas.add(tfCodigoCursoDisciplina);
		tfCodigoCursoDisciplina.setColumns(10);
		
		tfHoraInicialDisciplina = new JTextField();
		tfHoraInicialDisciplina.setBounds(473, 139, 86, 20);
		panelDisciplinas.add(tfHoraInicialDisciplina);
		tfHoraInicialDisciplina.setColumns(10);
		
		JButton btnRemoveDisciplina = new JButton("Remover Disciplina");
		btnRemoveDisciplina.setBackground(new Color(250, 128, 114));
		btnRemoveDisciplina.setBounds(28, 359, 121, 23);
		panelDisciplinas.add(btnRemoveDisciplina);
		
		ControllerProfessor pCont = new ControllerProfessor(tfNomeProfessor, tfCpfProfessor, tfAreaProfessor, tfPontuacaoProfessor);
		
		JPanel tabCurso = new JPanel();
		tabbedClasse.addTab("Curso", null, tabCurso, null);
		tabCurso.setLayout(null);
		
		JLabel lblCodigoCurso = new JLabel("Código do Curso");
		lblCodigoCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigoCurso.setBounds(49, 42, 130, 28);
		tabCurso.add(lblCodigoCurso);
		
		tfCodigoCurso = new JTextField();
		tfCodigoCurso.setBounds(222, 49, 96, 19);
		tabCurso.add(tfCodigoCurso);
		tfCodigoCurso.setColumns(10);
		
		JLabel lblNomeCurso = new JLabel("Nome do Curso");
		lblNomeCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeCurso.setBounds(49, 89, 112, 19);
		tabCurso.add(lblNomeCurso);
		
		tfNomeCurso = new JTextField();
		tfNomeCurso.setBounds(222, 90, 96, 21);
		tabCurso.add(tfNomeCurso);
		tfNomeCurso.setColumns(10);
		
		JLabel lblAreaConhecimento = new JLabel("Area de Conhecimento");
		lblAreaConhecimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAreaConhecimento.setBounds(49, 125, 155, 28);
		tabCurso.add(lblAreaConhecimento);
		
		tfAreaConhecimento = new JTextField();
		tfAreaConhecimento.setBounds(222, 132, 182, 19);
		tabCurso.add(tfAreaConhecimento);
		tfAreaConhecimento.setColumns(10);
		
		JTextArea taCurso = new JTextArea();
		taCurso.setBounds(10, 182, 599, 174);
		tabCurso.add(taCurso);
		
		JButton btnRemoveCurso = new JButton("Remover Curso");
		btnRemoveCurso.setForeground(new Color(0, 0, 0));
		btnRemoveCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemoveCurso.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRemoveCurso.setBounds(34, 383, 112, 21);
		tabCurso.add(btnRemoveCurso);
		
		JButton btnCadastraCurso = new JButton("Cadastrar Curso");
		btnCadastraCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastraCurso.setBounds(477, 383, 119, 21);
		tabCurso.add(btnCadastraCurso);
		
		JButton btnAtualizaCurso = new JButton("Atualizar Curso");
		btnAtualizaCurso.setBounds(355, 383, 112, 21);
		tabCurso.add(btnAtualizaCurso);
		
		JButton btnBuscaCurso = new JButton("Buscar");
		btnBuscaCurso.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnBuscaCurso.setBounds(382, 90, 85, 21);
		tabCurso.add(btnBuscaCurso);
		
		JPanel tabInscricao = new JPanel();
		tabbedClasse.addTab("Inscrição", null, tabInscricao, null);
		tabInscricao.setLayout(null);
		
		JLabel lblCurso = new JLabel("Código Curso");
		lblCurso.setBounds(48, 51, 103, 13);
		lblCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tabInscricao.add(lblCurso);
		
		JLabel lblCodigoDisciplina = new JLabel("Código da Disciplina");
		lblCodigoDisciplina.setBounds(48, 88, 127, 22);
		lblCodigoDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tabInscricao.add(lblCodigoDisciplina);
		
		JLabel lblCodProfessor = new JLabel("Código do Professor");
		lblCodProfessor.setBounds(48, 138, 154, 13);
		lblCodProfessor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tabInscricao.add(lblCodProfessor);
		
		JLabel lblCodProcesso = new JLabel("Código do Processo");
		lblCodProcesso.setBounds(48, 181, 127, 13);
		lblCodProcesso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tabInscricao.add(lblCodProcesso);
		
		taCodCurso = new JTextField();
		taCodCurso.setBounds(240, 50, 96, 19);
		tabInscricao.add(taCodCurso);
		taCodCurso.setColumns(10);
		
		taCodDisciplina = new JTextField();
		taCodDisciplina.setBounds(240, 92, 96, 19);
		tabInscricao.add(taCodDisciplina);
		taCodDisciplina.setColumns(10);
		
		taCodProfessor = new JTextField();
		taCodProfessor.setBounds(240, 137, 96, 19);
		tabInscricao.add(taCodProfessor);
		taCodProfessor.setColumns(10);
		
		taCodProcesso = new JTextField();
		taCodProcesso.setBounds(240, 180, 96, 19);
		tabInscricao.add(taCodProcesso);
		taCodProcesso.setColumns(10);
		
		JTextArea taInscricao = new JTextArea();
		taInscricao.setBounds(10, 221, 599, 161);
		tabInscricao.add(taInscricao);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBuscar.setBounds(419, 179, 85, 21);
		tabInscricao.add(btnBuscar);
		
		JButton btnRemoveInscricao = new JButton("Remover Inscrição");
		btnRemoveInscricao.setBounds(20, 393, 117, 21);
		tabInscricao.add(btnRemoveInscricao);
		
		JButton btnInscreverProfessor = new JButton("Inscrever Professor");
		btnInscreverProfessor.setBounds(463, 392, 146, 21);
		tabInscricao.add(btnInscreverProfessor);
		
		JButton btnAtualizaInscricao = new JButton("Atualizar Inscrição");
		btnAtualizaInscricao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtualizaInscricao.setBounds(327, 392, 126, 21);
		tabInscricao.add(btnAtualizaInscricao);
		btnCadastroProfessor.addActionListener(pCont);
	}
}
