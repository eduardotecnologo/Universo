package Model;

public class Funcionario_model {

	private String nome;
	private int matricula;
	
	public Funcionario_model(String nome, int matricula){
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getMatricula() {
		return String.valueOf(this.matricula);
	}
}
