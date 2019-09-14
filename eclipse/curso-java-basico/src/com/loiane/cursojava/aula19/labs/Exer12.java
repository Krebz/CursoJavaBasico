package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10]; 
		
		for(int i=0 ; i<vetorA.length; i++) {
			System.out.println("Informe o valor da posição "+ i+1 + " do vetor" );
			vetorA[i] = scan.nextInt();
		}
		
        int soma = 0;
        for (int i=0; i<vetorA.length; i++){
            soma += vetorA[i];
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.println("Soma: " + soma);
		

	}

}
