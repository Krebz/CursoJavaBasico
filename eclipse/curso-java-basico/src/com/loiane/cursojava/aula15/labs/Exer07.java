package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int menor = 0;
		int maior = 0;
		
		System.out.println("Vamos solicitar 3 numeros.");
		System.out.println("\nDigite o primeiro n�mero:");
		num = scan.nextInt();
		menor = num;
		maior = num;
		
		System.out.println("Digite o segundo n�mero:");
		num = scan.nextInt();
		if(num < menor){
			menor = num;
		}
		if(num > maior){
			maior = num;
		}
		
		System.out.println("Digite o terceiro n�mero:");
		num = scan.nextInt();
		if(num < menor){
			menor = num;
		}
		if(num > maior){
			maior = num;
		}
		
		System.out.println(menor + " � o menor numero e " + maior + " � o maior.");
		scan.close();
	}

}
