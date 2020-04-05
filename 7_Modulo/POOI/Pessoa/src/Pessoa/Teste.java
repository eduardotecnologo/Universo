package Pessoa;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		//Solicitar que o usuário digite um número
		System.out.println("Precione '1' para adicionar Pessoa, ou '2' para adicionar Aluno!!");
		Scanner keyboard = new Scanner(System.in);
		int value = keyboard.nextInt();

		//Verifica se � Pessoa ou Aluno
		if(value == 1) {
			Pessoa pessoa = new Pessoa("Eduardo", 35);
			pessoa.printDados("Eduardo", 35, null, null);
		}else {
			Aluno aluno = new Aluno("Lohann", 15, "Dev", "01/01/2020");
			aluno.printDados("Lohann", 15, "Dev", "01/01/2020");
		}
	}
}
