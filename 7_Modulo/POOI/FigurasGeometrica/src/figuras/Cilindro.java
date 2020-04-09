package figuras;

public class Cilindro extends Circulo{
	// Atributos
	private double altura;
	
	// Construtores
	public Cilindro() {
		super();
		this.altura = 8;
	}
	public Cilindro(double raio, double altura) {
		super(raio);
		this.altura = altura;
	}
	
	//Método Get e Set
	public double  getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// Outros Métodos
	@Override
	public double calcularArea() {
		return 2*Math.PI*raio*raio+2*Math.PI*raio*altura;
	}
	public double calcularVolume() {
		return 2*Math.PI*altura;
	}
	@Override
	public void mostrar() {
		System.out.println("Cilindro com raio: "+raio+ " e altura: "+altura);
	}
}
