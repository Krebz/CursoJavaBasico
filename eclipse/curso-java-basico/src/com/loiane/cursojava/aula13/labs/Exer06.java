package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o raio da circuferência?");
		double raio = scan.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A áres deste cículo é: " + area);
		

	}

}
