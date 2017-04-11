package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe dois número:");
		int num1 = scan.nextInt();		
		int num2 = scan.nextInt();
		int resultado = num1 + num2;
		
		System.out.println("A soma dos número " + num1 + " e " + num2 + " é igua a " + resultado);

	}

}
