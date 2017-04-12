package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Imforme a temperatura Celcius");
		double grauC = scan.nextDouble();
		double grauF = (grauC * 1.8) + 32;
		
		System.out.println("A temperatura em Farenheit é: " + grauF);

	}

}
