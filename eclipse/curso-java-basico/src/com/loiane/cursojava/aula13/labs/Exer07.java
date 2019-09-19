package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o lado do quadrado:");
		double lado = scan.nextDouble();
		double area = Math.pow(lado, 2);
		
		System.out.println("A �rea deste quadrado �: " + area);
		System.out.println("O dobro desta �res �: " + (area * 2));
		scan.close();
	}
		

}
