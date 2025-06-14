package model;

public class Curso {
	private int cod_curso;
	private String nome_curso;
	private String area_de_conhecimento;
	private boolean processo_aberto;
	
	//Construtor Padrão
	public Curso() {		
	}
	
	// Construtor completo
	public Curso(int cod_curso, String nome_curso, String area_de_conhecimento, boolean processo_aberto) {
		super();
		this.cod_curso = cod_curso;
		this.nome_curso = nome_curso;
		this.area_de_conhecimento = area_de_conhecimento;
		this.processo_aberto = processo_aberto;
	}
	
	//Getters e Setters
	public int getCod_curso() {
		return cod_curso;
	}
	public void setCod_curso(int cod_curso) {
		this.cod_curso = cod_curso;
	}
	public String getNome_curso() {
		return nome_curso;
	}
	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}
	public String getArea_de_conhecimento() {
		return area_de_conhecimento;
	}
	public void setArea_de_conhecimento(String area_de_conhecimento) {
		this.area_de_conhecimento = area_de_conhecimento;
	}
	public boolean isProcesso_aberto() {
		return processo_aberto;
	}
	public void setProcesso_aberto(boolean processo_aberto) {
		this.processo_aberto = processo_aberto;
	}
	
	//Configura string para o modelo de csv
	@Override
	public String toString() {
		return cod_curso+";"+nome_curso+";"+area_de_conhecimento+";"+processo_aberto;
	}	
	
}
