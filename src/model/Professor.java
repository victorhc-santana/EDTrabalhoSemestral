package model;

public class Professor {
	private String nome_professor;
	private String area_a_inscrever;
	private int cpf;
	private double pontuacao;
	
	//Construtor Padrão
	public Professor() {		
	}
	
	// Construtor completo
	public Professor(String nome_professor, String area_a_inscrever, int cpf, double pontuacao) {
		super();
		this.nome_professor = nome_professor;
		this.area_a_inscrever = area_a_inscrever;
		this.cpf = cpf;
		this.pontuacao = pontuacao;
	}

	//Getters e Setters
	public String getNome_professor() {
		return nome_professor;
	}

	public void setNome_professor(String nome_professor) {
		this.nome_professor = nome_professor;
	}

	public String getArea_a_inscrever() {
		return area_a_inscrever;
	}

	public void setArea_a_inscrever(String area_a_inscrever) {
		this.area_a_inscrever = area_a_inscrever;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(double pontuacao) {
		this.pontuacao = pontuacao;
	}

	//Configura string para o modelo de csv
	@Override
	public String toString() {
		return nome_professor+";"+area_a_inscrever+cpf+";"+pontuacao;
	}
}
