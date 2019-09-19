package com.loiane.cursojava.aula12;

//import java.util.Locale;
import java.util.Scanner;

public class LeuturaDadosTeclados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.println("Digite seu nome primeiro nome:");
		String nomeCompleto = scan.next();
		System.out.println("Seu primeiro nome �: " + nomeCompleto);
		
		System.out.println("Digite sua idade:");
		String idade = scan.next();
		System.out.println("Seu idade �: " + idade);
		
		System.out.println("Digite sua altura:");
		String altura = scan.next();
		System.out.println("Sua altura �: " + altura);
		*/
		System.out.println("Digite o seu nome, idade, qtd filhos, altura, Tem bichinho de estima��o:");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores:");
		System.out.println("Nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de Filhoes: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem animal de estima��o? " + temPet);
		
		//Kleber 39 1 1,71 true
		
		scan.close();

	}

}
