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
//RESULT
//Circulo com raio: 5.0
//Retangulo com largura: 12.0 e comprimento: 10.0
//Caixa com largura: 12.0, Comprimento: 5.0e altura: 6.0
//Cilindro com raio: 5.0 e altura: 6.0

