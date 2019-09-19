package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o sal�rio:");
        double salario = scan.nextDouble();
        int percentual = 0;
        
        if(salario <= 280){
        	percentual = 20;
        }else if(salario > 280 && salario <= 700){
        	percentual = 15;       	
        }else if(salario > 700 && salario <= 1500){
        	percentual = 10;
        }else if(salario > 1500){
        	percentual = 5;
        }
        
        double valorAumento = (salario / 100) * percentual;
        double salarioAjutado = salario + valorAumento;
        
        System.out.println("Relat�rio de Ajuste Salirial");
        System.out.println("Salario anterior: " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentual);
        System.out.println("Valor do aumento: " + valorAumento);
        System.out.println("Salario ajustado: " + salarioAjutado);
        
        scan.close();

	}

}
