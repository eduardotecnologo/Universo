package Carro;

public class Teste {

	public static void main(String[] args) {
		Carro carro = new Carro("Chevrolet", "Chevette", 1993, 11);
		carro.setFuel(60);
		carro.runing(60);
		carro.getFuel();
	}
}
