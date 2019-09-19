package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por horas?");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalha em um m�s?");
		double horasTrabalhada = scan.nextDouble();
		
		double salario = ganhoHora * horasTrabalhada;
		System.out.println("Seu sal�rio no m�s � de:" + salario);

		scan.close();
	}

}
