package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura Farenheit:");
		double grauF = scan.nextDouble();
		double grauC = (5 * (grauF - 32) / 9);
		
		System.out.println("A temperatura em grau Celsius é: " + grauC);

	}

}
