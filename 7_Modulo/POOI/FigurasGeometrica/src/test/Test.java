package test;

import figuras.Caixa;
import figuras.Cilindro;
import figuras.Circulo;
import figuras.Retangulo;

public class Test {
	public static void main(String[] args) {
		Caixa caixa = new Caixa();
		Cilindro cilindro = new Cilindro();
		Circulo circulo = new Circulo();
		Retangulo retangulo = new Retangulo();
		
		circulo.setRaio(5);
		retangulo.setLargura(12);
		
		caixa.setComprimento(5);
		caixa.setLargura(12);
		caixa.setAltura(6);
		
		cilindro.setRaio(5);
		cilindro.setAltura(6);
		
		circulo.mostrar();
		retangulo.mostrar();
		
		caixa.mostrar();
		cilindro.mostrar();	
	}

}
