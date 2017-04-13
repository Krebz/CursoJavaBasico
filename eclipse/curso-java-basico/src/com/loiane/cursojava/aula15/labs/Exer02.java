package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro:");
		int num = scan.nextInt();
		
		if(num >= 0){
			
			System.out.println("O número " + num + " informado é positivo");
			
		} else {
			
			System.out.println("O número " + num + " informado é negativo");
			
		}

	}

}
