package figuras;

public class Circulo implements IObjetoGeometrico{
	// Atributos
	protected double raio;
	
	// Construtor
	public Circulo() {
		this.raio = 5;
	}
	public Circulo(double raio) {
		this.raio = raio;
	}
	// Métodos Get e Set
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	// Outros métodos
	public double calcularArea() {
		return Math.PI*raio*raio;
	}
	public double calcularPerimetro() {
		return 2*Math.PI*raio;
	}
	public void mostrar() {
		System.out.println("Circulo com raio: "+raio);
	}
}
