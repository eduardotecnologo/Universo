package Pessoa;

public class Aluno extends Pessoa{

	public String nameCource;
	public String dateInput;

	//Método Construct Aluno
	public Aluno(String name, int age, String nameCource, String dateInput) {
		super(name, age); //Recebendo atributos classe Pessoa
		this.nameCource = nameCource;
		this.dateInput = dateInput;
	}
}
