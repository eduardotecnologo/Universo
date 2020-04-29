package aula;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello");
		Funcionario winglerson = new Funcionario(" Winglerson","22222222222");
		System.out.println(winglerson.name);
		
		Engenheiro eduardo = new Engenheiro(" Eduardo","33333333333","Developer");
		System.out.println(eduardo.name + " - " + eduardo.cursoSuperior);

	}

}
