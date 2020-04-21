package aula;

public class Engenheiro {
	// Solução 01 - Adiconar atributo cursoSuperior
	public String name;
	public String cpf;
	public String cursoSuperior;
	
	Engenheiro(String name, String cpf, String cursoSuperior){
		if(this.validarCpf(cpf)) {
			this.name = name;
			this.cpf = cpf;
			this.cursoSuperior = cursoSuperior;
		}
	}
	
	
	public boolean validarCpf(String cpf) {
		if(cpf.length() == 11) {
			return true;
		}
		return false;
	}

}
