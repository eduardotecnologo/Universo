package figuras;

public class Caixa extends Retangulo{
	// Attributos
	private double altura;
	
	// Construtoras
	public Caixa() {
		super();
		this.altura = 3;
	}
	public Caixa(double largura,double comprimento,double altura) {
		super(largura,comprimento);
		this.altura = altura;
	}
	
	// Métodos Get e Set
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// Outros Métodos
	@Override
	public double calcularArea() {
		return 2*(largura*comprimento+comprimento*altura+largura*altura);
	}
	public double calcularVolume() {
		return largura*comprimento*altura;
	}
	@Override
	public void mostrar() {
		System.out.println("Caixa com largura: "+largura+ ", Comprimento: "+comprimento+ "e altura: "+altura);
	}
}
