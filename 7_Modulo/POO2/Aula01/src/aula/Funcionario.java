package aula;

public class Funcionario {
	// Solução 01 - Adiconar atributo cursoSuperior
	public String name;
	public String cpf;
	public String cursoSuperior;
	
	Funcionario(String name, String cpf){
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


