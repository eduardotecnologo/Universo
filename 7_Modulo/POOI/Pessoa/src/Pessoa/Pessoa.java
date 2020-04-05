package Pessoa;

public class Pessoa {

	public String name;
	public int age;

	//Método Contruct Pessoa
	public Pessoa(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//Exibindo no terminal info de Pessoa
	public void printDados(String name, int age, String nameCource, String dateInput) {
		System.out.println("Nome do aluno: " + name + "\nIdade do aluno: " + age + "\nNome do curso: " + nameCource + "\nData de Entrada: " + dateInput);
	}
}