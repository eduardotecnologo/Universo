package Carro;

public class Carro {

	public String marca;
	public String model;
	public int yearFabric;
	public double consumption;
	public double tankFuel;
	public double distance;

	// Método Contruct que recebe os parametros para instânciar
	public Carro(String marca, String model, int yearFabric, double consumption) {
		this.marca = marca;
		this.model = model;
		this.yearFabric = yearFabric;
		this.consumption = consumption;
		this.tankFuel = 0;
	}

	//Método para colocar combustivel no tanque do carro
	public double setFuel(double tankFuel) {
		this.tankFuel = tankFuel;
		return this.tankFuel;
	}

	// Método para o carro andar
	public double runing(double distance) {
		this.distance = distance;
		return this.distance;
	}

	// Método para calcular o consumo de combustível e mostrar a quantidade restante
	public void getFuel() {
		double result;
		result = this.tankFuel - (this.distance/this.consumption);
		System.out.println("A qtd de combustivel restante no tanque é de: " + result + " litros.");
	}
}
