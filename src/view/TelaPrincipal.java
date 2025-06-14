package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControllerCurso;
import controller.ControllerDisciplina;
import controller.ControllerInscricao;
import controller.ControllerProfessor;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNomeDisciplina;
	private JTextField tfCodigoDisciplina;
	private JTextField tfDiaSemanaDisciplina;
	private JTextField tfHorasDiariasDisciplina;
	private JTextField tfCodigoCursoDisciplina;
	private JTextField tfHoraInicialDisciplina;
	private JTextField tfCodigoCurso;
	private JTextField tfNomeCurso;
	private JTextField tfAreaCurso;
	private JTextField tfAreaConhecimento;
	private JTextField tfCodigoDisciplinaIns;
	private JTextField tfCpfProfessorIns;
	private JTextField tfCodigoProcessoIns;
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
		
		//Inicio-aba referente Disiciplinas
		JPanel tabDisciplinas = new JPanel();
		tabbedClasse.addTab("Disciplinas", null, tabDisciplinas, null);
		tabDisciplinas.setLayout(null);
		
		JPanel tabProfessor = new JPanel();
		tabbedClasse.addTab("Professor", null, tabProfessor, null);
		tabProfessor.setLayout(null);
		
		JPanel tabCurso = new JPanel();
		tabbedClasse.addTab("Curso", null, tabCurso, null);
		tabCurso.setLayout(null);
		
		JPanel tabInscricao = new JPanel();
		tabbedClasse.addTab("Inscrição", null, tabInscricao, null);
		tabInscricao.setLayout(null);
		
		JLabel lblCodDisciplina = new JLabel("Código da disciplina");
		lblCodDisciplina.setBounds(28, 92, 121, 34);
		lblCodDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tabDisciplinas.add(lblCodDisciplina);
		
		JLabel lblNomeDisciplina = new JLabel("Nome da disciplina");
		lblNomeDisciplina.setBounds(28, 65, 113, 16);
		lblNomeDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tabDisciplinas.add(lblNomeDisciplina);
		
		JLabel lblDiaSemanaDisciplina = new JLabel("Dia da semana");
		lblDiaSemanaDisciplina.setBounds(28, 140, 86, 16);
		lblDiaSemanaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tabDisciplinas.add(lblDiaSemanaDisciplina);
		
		JLabel lblHorasDiaDisciplina = new JLabel("Horas diárias");
		lblHorasDiaDisciplina.setBounds(374, 67, 86, 16);
		lblHorasDiaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tabDisciplinas.add(lblHorasDiaDisciplina);
		
		JLabel lblCodCursoDisciplina = new JLabel("Código do curso");
		lblCodCursoDisciplina.setBounds(374, 103, 92, 16);
		lblCodCursoDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tabDisciplinas.add(lblCodCursoDisciplina);
		
		JLabel lblHoraInicialDisciplina = new JLabel("Hora inicial");
		lblHoraInicialDisciplina.setBounds(374, 142, 69, 16);
		lblHoraInicialDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tabDisciplinas.add(lblHoraInicialDisciplina);
		
		JButton btnAtualizaDisciplina = new JButton("Atualizar disciplina");
		btnAtualizaDisciplina.setBounds(316, 357, 144, 23);
		btnAtualizaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tabDisciplinas.add(btnAtualizaDisciplina);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 167, 599, 160);
		tabDisciplinas.add(scrollPane_1);
		
		JTextArea taDisciplina = new JTextArea();
		scrollPane_1.setViewportView(taDisciplina);
		
		JButton btnCadastroDisciplina = new JButton("Cadastrar Disciplina");
		btnCadastroDisciplina.setBounds(470, 357, 139, 23);
		tabDisciplinas.add(btnCadastroDisciplina);
		
		JButton btnBuscaDisciplina = new JButton("Buscar");
		btnBuscaDisciplina.setBounds(253, 99, 89, 23);
		tabDisciplinas.add(btnBuscaDisciplina);
		
		tfNomeDisciplina = new JTextField();
		tfNomeDisciplina.setBounds(151, 64, 86, 20);
		tabDisciplinas.add(tfNomeDisciplina);
		tfNomeDisciplina.setColumns(10);
		
		tfCodigoDisciplina = new JTextField();
		tfCodigoDisciplina.setBounds(151, 100, 86, 20);
		tabDisciplinas.add(tfCodigoDisciplina);
		tfCodigoDisciplina.setColumns(10);
		
		tfDiaSemanaDisciplina = new JTextField();
		tfDiaSemanaDisciplina.setBounds(151, 139, 86, 20);
		tabDisciplinas.add(tfDiaSemanaDisciplina);
		tfDiaSemanaDisciplina.setColumns(10);
		
		tfHorasDiariasDisciplina = new JTextField();
		tfHorasDiariasDisciplina.setBounds(473, 64, 86, 20);
		tabDisciplinas.add(tfHorasDiariasDisciplina);
		tfHorasDiariasDisciplina.setColumns(10);
		
		tfCodigoCursoDisciplina = new JTextField();
		tfCodigoCursoDisciplina.setBounds(473, 100, 86, 20);
		tabDisciplinas.add(tfCodigoCursoDisciplina);
		tfCodigoCursoDisciplina.setColumns(10);
		
		tfHoraInicialDisciplina = new JTextField();
		tfHoraInicialDisciplina.setBounds(473, 139, 86, 20);
		tabDisciplinas.add(tfHoraInicialDisciplina);
		tfHoraInicialDisciplina.setColumns(10);
		
		JButton btnRemoveDisciplina = new JButton("Remover Disciplina");
		btnRemoveDisciplina.setBackground(new Color(250, 128, 114));
		btnRemoveDisciplina.setBounds(28, 359, 121, 23);
		tabDisciplinas.add(btnRemoveDisciplina);
		
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
		
		tfAreaCurso = new JTextField();
		tfAreaCurso.setBounds(222, 132, 182, 19);
		tabCurso.add(tfAreaCurso);
		tfAreaCurso.setColumns(10);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 182, 599, 174);
		tabCurso.add(scrollPane_3);
		
		JTextArea taCurso = new JTextArea();
		scrollPane_3.setViewportView(taCurso);
		
		JButton btnRemoveCurso = new JButton("Remover Curso");
		btnRemoveCurso.setForeground(new Color(0, 0, 0));
		btnRemoveCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemoveCurso.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRemoveCurso.setBounds(34, 383, 112, 21);
		tabCurso.add(btnRemoveCurso);
		
		JButton btnCadastroCurso = new JButton("Cadastrar Curso");
		btnCadastroCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastroCurso.setBounds(477, 383, 119, 21);
		tabCurso.add(btnCadastroCurso);
		
		JButton btnAtualizaCurso = new JButton("Atualizar Curso");
		btnAtualizaCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtualizaCurso.setBounds(355, 383, 112, 21);
		tabCurso.add(btnAtualizaCurso);
		
		JButton btnBuscaCurso = new JButton("Buscar");
		btnBuscaCurso.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnBuscaCurso.setBounds(382, 90, 85, 21);
		tabCurso.add(btnBuscaCurso);
		
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
		
		tfCodigoDisciplinaIns = new JTextField();
		tfCodigoDisciplinaIns.setBounds(240, 92, 96, 19);
		tabInscricao.add(tfCodigoDisciplinaIns);
		tfCodigoDisciplinaIns.setColumns(10);
		
		tfCpfProfessorIns = new JTextField();
		tfCpfProfessorIns.setBounds(240, 137, 96, 19);
		tabInscricao.add(tfCpfProfessorIns);
		tfCpfProfessorIns.setColumns(10);
		
		tfCodigoProcessoIns = new JTextField();
		tfCodigoProcessoIns.setBounds(240, 180, 96, 19);
		tabInscricao.add(tfCodigoProcessoIns);
		tfCodigoProcessoIns.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 221, 599, 161);
		tabInscricao.add(scrollPane_2);
		
		JTextArea taInscricao = new JTextArea();
		scrollPane_2.setViewportView(taInscricao);
		
		JButton btnBuscarInscricao = new JButton("Buscar");
		btnBuscarInscricao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBuscarInscricao.setBounds(419, 179, 85, 21);
		tabInscricao.add(btnBuscarInscricao);
		
		JButton btnRemoveInscricao = new JButton("Remover Inscrição");
		btnRemoveInscricao.setBounds(20, 393, 117, 21);
		tabInscricao.add(btnRemoveInscricao);

		JButton btnCadastroInscricao = new JButton("Inscrever Professor");
		btnCadastroInscricao.setBounds(463, 392, 146, 21);
		tabInscricao.add(btnCadastroInscricao);
		
		JButton btnAtualizaInscricao = new JButton("Atualizar Inscrição");
		btnAtualizaInscricao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtualizaInscricao.setBounds(298, 392, 126, 21);
		tabInscricao.add(btnAtualizaInscricao);
		
		JLabel lblNomeProfessor = new JLabel("Nome do Professor");
		lblNomeProfessor.setBounds(26, 60, 99, 14);
		tabProfessor.add(lblNomeProfessor);
		
		JLabel lblCpfProfessor = new JLabel("CPF do Professor");
		lblCpfProfessor.setBounds(26, 111, 99, 14);
		tabProfessor.add(lblCpfProfessor);
		
		JLabel lblArea = new JLabel("Area de conhecimento");
		lblArea.setBounds(348, 111, 116, 14);
		tabProfessor.add(lblArea);
		
		JLabel lblPontuacao = new JLabel("Pontuacao do professor");
		lblPontuacao.setBounds(348, 71, 116, 14);
		tabProfessor.add(lblPontuacao);
		
		JButton btnCadastroProfessor = new JButton("Cadastrar professor");
		btnCadastroProfessor.setBounds(306, 359, 89, 23);
		tabProfessor.add(btnCadastroProfessor);
		
		JButton btnAtualizaProfessor = new JButton("Atualizar Professor");
		btnAtualizaProfessor.setBounds(458, 359, 89, 23);
		tabProfessor.add(btnAtualizaProfessor);
		
		JButton btnRemoveProfessor = new JButton("Remover Professor");
		btnRemoveProfessor.setBackground(new Color(250, 128, 114));
		btnRemoveProfessor.setBounds(52, 359, 89, 23);
		tabProfessor.add(btnRemoveProfessor);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 183, 563, 166);
		tabProfessor.add(scrollPane);
		
		JTextArea taProfessor = new JTextArea();
		scrollPane.setViewportView(taProfessor);
		
		JButton btnBuscaProfessor = new JButton("Busca");
		btnBuscaProfessor.setBounds(249, 107, 89, 23);
		tabProfessor.add(btnBuscaProfessor);
		
		tfNomeProfessor = new JTextField();
		tfNomeProfessor.setBounds(121, 57, 86, 20);
		tabProfessor.add(tfNomeProfessor);
		tfNomeProfessor.setColumns(10);
		
		tfCpfProfessor = new JTextField();
		tfCpfProfessor.setBounds(121, 108, 86, 20);
		tabProfessor.add(tfCpfProfessor);
		tfCpfProfessor.setColumns(10);
		
		tfAreaProfessor = new JTextField();
		tfAreaProfessor.setBounds(490, 108, 86, 20);
		tabProfessor.add(tfAreaProfessor);
		tfAreaProfessor.setColumns(10);
		
		tfPontuacaoProfessor = new JTextField();
		tfPontuacaoProfessor.setBounds(490, 68, 86, 20);
		tabProfessor.add(tfPontuacaoProfessor);
		tfPontuacaoProfessor.setColumns(10);

		tfCodigoCurso = new JTextField();
		tfCodigoCurso.setBounds(222, 49, 96, 19);
		tabCurso.add(tfCodigoCurso);
		tfCodigoCurso.setColumns(10);
		
		tfNomeCurso = new JTextField();
		tfNomeCurso.setBounds(222, 90, 96, 21);
		tabCurso.add(tfNomeCurso);
		tfNomeCurso.setColumns(10);
		
		tfAreaConhecimento = new JTextField();
		tfAreaConhecimento.setBounds(222, 132, 182, 19);
		tabCurso.add(tfAreaConhecimento);
		tfAreaConhecimento.setColumns(10);

		btnCadastroCurso.setBounds(477, 383, 119, 21);
		tabCurso.add(btnCadastroCurso);
		
		btnAtualizaInscricao.setBounds(327, 392, 126, 21);
		tabInscricao.add(btnAtualizaInscricao);
		
		ControllerProfessor pCont = new ControllerProfessor(tfNomeProfessor, tfCpfProfessor, tfAreaProfessor, tfPontuacaoProfessor, taProfessor);
		btnCadastroProfessor.addActionListener(pCont);
		btnAtualizaProfessor.addActionListener(pCont);
		btnRemoveProfessor.addActionListener(pCont);
		btnBuscaProfessor.addActionListener(pCont);
		
		ControllerCurso cCont = new ControllerCurso(tfCodigoCurso, tfNomeCurso, tfAreaCurso);
		btnCadastroCurso.addActionListener(cCont);
		btnAtualizaCurso.addActionListener(cCont);
		btnRemoveCurso.addActionListener(cCont);
		btnBuscaCurso.addActionListener(cCont);
		
		ControllerDisciplina dCont = new ControllerDisciplina(tfNomeDisciplina, tfCodigoDisciplina, tfCodigoCursoDisciplina,
				tfDiaSemanaDisciplina, tfHoraInicialDisciplina, tfHorasDiariasDisciplina);
		btnCadastroDisciplina.addActionListener(dCont);
		btnAtualizaDisciplina.addActionListener(dCont);
		btnRemoveDisciplina.addActionListener(dCont);
		btnBuscaDisciplina.addActionListener(dCont);
		
		ControllerInscricao iCont = new ControllerInscricao(tfCpfProfessorIns, tfCodigoProcessoIns, tfCodigoDisciplinaIns);
		btnCadastroInscricao.addActionListener(iCont);
		btnAtualizaInscricao.addActionListener(iCont);
		btnRemoveInscricao.addActionListener(iCont);
		btnBuscarInscricao.addActionListener(iCont);
		
	}
}