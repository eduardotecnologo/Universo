package aula;

public class Funcionario {
	// Solução 01 - Adiconar atributo cursoSuperior
	public String name;
	public String cpf;
	
	Funcionario(String name, String cpf){
		System.out.println(" Construtor de Funcionário");
		if(this.validarCpf(cpf)) {
			this.name = name;
			this.cpf = cpf;
		}
	}
	
	
	public boolean validarCpf(String cpf) {
		if(cpf.length() == 11) {
			return true;
		}
		return false;
	}

}


