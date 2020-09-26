package testes;
import classes.*;

public class Teste extends Conta{
	public Teste(Cliente titular) {
		super(titular);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Cliente c1 = new Cliente("123","Eduardo", new Endereco("av", "garcia",200,"apt 102"), "developer",6000);
		
		System.out.println("*********Conta normal*********");
		Conta conta01 = new Conta(c1);
		conta01.depositar(1000);
		System.out.println(conta01);
		conta01.sacar(200);
		System.out.println(conta01);
	}
}
