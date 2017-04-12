package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por horas?");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha em um mês?");
		double horasTrabalhada = scan.nextDouble();
		
		double salarioBruto = ganhoHora * horasTrabalhada;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double impostoDeRenda = salarioBruto * 0.11;
		double totalDescontos = (inss + sindicato + impostoDeRenda);
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("\n\nSalário Bruto: ..........   R$ " + salarioBruto);
		System.out.println("\nIRRF 11%: ............... - R$ " + impostoDeRenda);
		System.out.println("INSS  8%: ............... - R$ " + inss);
		System.out.println("Contribuição Sindical 5%: - R$ " + sindicato);
		System.out.println("Total dos descontos: .... - R$ " + totalDescontos);
		System.out.println("\nSalário Liquido: ........   R$ " + salarioLiquido);
		
	}

}
