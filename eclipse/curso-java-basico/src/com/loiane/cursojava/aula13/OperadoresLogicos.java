package com.loiane.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1 ) && (valor2 == 2);
		System.out.println("valor1 � 1 AND valor2 � 2 - resultdo: " + resultado1);
		
		boolean resultado2 = (valor1 == 1 ) || (valor2 == 2);
		System.out.println("valor1 � 1 OR valor2 � 2 - resultdo: " + resultado2);
		
		boolean verdadero = true;
		boolean falso = false;
		System.out.println(verdadero && falso);
		System.out.println(verdadero || falso);
		System.out.println(verdadero ^ falso);
		System.out.println(!verdadero && falso);

	}

}
