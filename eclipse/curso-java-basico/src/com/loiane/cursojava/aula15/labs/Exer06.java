package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros inteiros:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1 >= num2 && num1 >= num3){
			System.out.println(num1 + " � o maior N�mero");
		} else if(num2 >= num1 && num2 >= num3){
			System.out.println(num2 + " � o maior N�mero");
		}else {
			System.out.println(num3 + " � o maior N�mero");
		}
		scan.close();
	}

}
