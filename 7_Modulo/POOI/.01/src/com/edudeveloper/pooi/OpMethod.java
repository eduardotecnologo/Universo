package com.edudeveloper.pooi;

import java.util.Scanner;

public class OpMethod {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		Integer num1 = 0;
		Integer num2 = 0;
		
		System.out.println("Calculadora de Soma: ");
		System.out.println("Digite o primeiro número: ");
		num1 = reader.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = reader.nextInt();
		
		
//		Integer result = num1 + num2;
		Integer result = sum(num1,num2);
		
		// resultado
		System.out.println("O resultado é " + result);
	}
	
	public static Integer sum(Integer num1, Integer num2) {
		return num1 + num2;
	}

}
