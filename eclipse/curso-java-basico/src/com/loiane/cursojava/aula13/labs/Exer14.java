package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo (em MB)?");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Qual a velocidade da sua Internet (em Mbps)?");
		double velocidadeInternet = scan.nextDouble();
		
		double tempoDownload = tamanhoArquivo / velocidadeInternet;
		//tempoDownload = tempoDownload / 60;
		
		System.out.println("Seu arquivo ser� baixado em: " + tempoDownload + " mim.");
		
		scan.close();
	}

}
