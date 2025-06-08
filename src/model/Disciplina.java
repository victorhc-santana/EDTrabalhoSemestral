package model;

public class Disciplina {
    private int cod_disciplina;
    private int cod_curso;
    private String nome_disciplina;
    private String dia_semana;
    private String hora_duracao;
    private String hora_inicial;

    // Construtor padrão
    public Disciplina() {
    }

    // Construtor completo
    public Disciplina(int cod_disciplina, int cod_curso, String nome_disciplina,
    		String dia_semana,String hora_duracao, String hora_inicial) {
        this.cod_disciplina = cod_disciplina;
        this.cod_curso = cod_curso;
        this.nome_disciplina = nome_disciplina ;
        this.dia_semana = dia_semana;
        this.hora_duracao = hora_duracao;
        this.hora_inicial = hora_inicial;
    }
    //getters e setters
	public int getCod_disciplina() {
		return cod_disciplina;
	}

	public void setCod_disciplina(int cod_disciplina) {
		this.cod_disciplina = cod_disciplina;
	}

	public int getCod_curso() {
		return cod_curso;
	}

	public void setCod_curso(int cod_curso) {
		this.cod_curso = cod_curso;
	}

	public String getNome_disciplina() {
		return nome_disciplina;
	}

	public void setNome_disciplina(String nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
	}

	public String getDia_semana() {
		return dia_semana;
	}

	public void setDia_semana(String dia_semana) {
		this.dia_semana = dia_semana;
	}

	public String getHora_duracao() {
		return hora_duracao;
	}

	public void setHora_duracao(String hora_duracao) {
		this.hora_duracao = hora_duracao;
	}

	public String getHora_inicial() {
		return hora_inicial;
	}

	public void setHora_inicial(String hora_inicial) {
		this.hora_inicial = hora_inicial;
	}    
}
