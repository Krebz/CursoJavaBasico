package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um n�mero");
        int num = scan.nextInt();
        
        if (num % 2 == 0){
            System.out.println("par");
        } else {
            System.out.println("�mpar");
        }
        scan.close();
	}

}
