package figuras;

public class Retangulo implements IObjetoGeometrico{
	// Atributos
	
	protected double largura;
	protected double comprimento;
	
	// Construtores
	
	public Retangulo() {
		this.largura = 5;
		this.comprimento = 10;
	}
	public Retangulo(double largura,double comprimento) {
		this.largura = largura;
		this.comprimento = comprimento;
	}
	//Método Get e Set	
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	// Outros Métodos
	public double calcularArea() {
		return largura*comprimento;
	}
	public double calcularPerimetro() {
		return 2*largura + 2*comprimento;
	}
	public void mostrar() {
		System.out.println("Retangulo com largura: "+largura+ " e comprimento: "+comprimento);
	}
}
