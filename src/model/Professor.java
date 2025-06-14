package model;

public class Professor {
	public String nome_professor; //mudei para public para ler no COntrollerProfessor na Busca
	public String area_a_inscrever; // mudei para public
	public String cpf; //mudei para publico para ler no ControllerProfessor na Busca. Mudei para string o CPF
	private double pontuacao;
	
	//Construtor Padrão
	public Professor() {		
	}
	
	// Construtor completo
	public Professor(String nome_professor, String area_a_inscrever, String cpf, double pontuacao) { //mudei CPF para String
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

	public String getCpf() { //mudei de int para string
		return cpf;
	}

	public void setCpf(String cpf) { //mudei de int para String 
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
		return nome_professor+";"+area_a_inscrever+";"+cpf+";"+pontuacao;
	}
}
