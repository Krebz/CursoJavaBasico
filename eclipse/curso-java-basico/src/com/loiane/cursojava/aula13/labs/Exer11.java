package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe dois números inteiros.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Informe um numero com fracionado.");
		double num3 = scan.nextDouble();
		
		double produtoDobro = (num1 * 2) * (num2 / 2);
		double somaTriplo = (num1 * 3) + num3;
		double elevaCubo = Math.pow(num3, 3);
		
		System.out.println("Você digitou os seguntes números: " + num1 + " | " + num2 + " | " + num3);
		System.out.println("a. O produto do dobro do primeiro com a metade do seguntos. " + produtoDobro);
		System.out.println("b. a soma do triplo do primeiro com o terceiro. " + somaTriplo);
		System.out.println("c. o terceiro elevado ao cubo. " + elevaCubo);
	}

}
