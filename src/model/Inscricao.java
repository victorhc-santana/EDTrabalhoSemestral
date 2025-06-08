package model;

public class Inscricao {
	private int cpf_prof;
	private int cod_processo;
	private int cod_disciplina;
	
	//Construtor Padrão
	public Inscricao() {		
	}
	
	// Construtor completo
	public Inscricao(int cpf_prof, int cod_processo, int cod_disciplina) {
		super();
		this.cpf_prof = cpf_prof;
		this.cod_processo = cod_processo;
		this.cod_disciplina = cod_disciplina;
	}
	
	//Getters e Setters
	public int getCpf_prof() {
		return cpf_prof;
	}

	public void setCpf_prof(int cpf_prof) {
		this.cpf_prof = cpf_prof;
	}

	public int getCod_processo() {
		return cod_processo;
	}

	public void setCod_processo(int cod_processo) {
		this.cod_processo = cod_processo;
	}

	public int getCod_disciplina() {
		return cod_disciplina;
	}

	public void setCod_disciplina(int cod_disciplina) {
		this.cod_disciplina = cod_disciplina;
	}
	
	
}
