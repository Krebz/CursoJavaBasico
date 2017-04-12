package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por horas?");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha em um mês?");
		double horasTrabalhada = scan.nextDouble();
		
		double salario = ganhoHora * horasTrabalhada;
		System.out.println("Seu salário no mês é de:" + salario);

	}

}
