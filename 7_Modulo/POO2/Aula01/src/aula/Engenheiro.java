package aula;

public class Engenheiro extends Funcionario{
	public String cursoSuperior;
	
	Engenheiro(String name, String cpf, String cursoSuperior){
		super(name,cpf);
		this.cursoSuperior = cursoSuperior;
	}

}
