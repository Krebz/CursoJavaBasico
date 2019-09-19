package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe \"F\" para Feminino ou \"M\" para Masculo:");
		String valor = scan.next();
		
		if(valor.equalsIgnoreCase("f")){
			
			System.out.println("F - Feminino");
			
		} else if(valor.equalsIgnoreCase("m")){
			
			System.out.println("M - Masculino");
			
		} else {
			
			System.out.println("Sexo Invalido");
			
		}
		scan.close();

	}

}
