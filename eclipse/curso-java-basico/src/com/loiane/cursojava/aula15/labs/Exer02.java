package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro:");
		int num = scan.nextInt();
		
		if(num >= 0){
			
			System.out.println("O n�mero " + num + " informado � positivo");
			
		} else {
			
			System.out.println("O n�mero " + num + " informado � negativo");
			
		}
		scan.close();
	}

}
