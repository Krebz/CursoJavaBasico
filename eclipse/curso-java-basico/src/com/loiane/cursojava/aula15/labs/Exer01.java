package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite dois n�meros inteiro:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if (num1 > num2){
			
			System.out.println("Maior N�mero: " + num1);
			
		} else {
			
			System.out.println("Maior N�mero: " + num2);
			
		}

	}

}
