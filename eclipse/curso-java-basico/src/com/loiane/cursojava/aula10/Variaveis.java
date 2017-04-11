package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {

		//convenção Java
		int idade = 20;
		String nome = "Kleber";
		String nomeDoMeuCachorro = "Binbo";
		String ano2014 = "2014";
		
		// aceito mais não é convenção Java
		int _idade;
		int $idade;
		
		// Não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		idade = 25;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		//Má prática
		int a = 20;
		String b = "Kleber";
		
	}

}
