package br.com.xti.logica;


import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
		//System.out.println(args[0]);
		Scanner ent = new Scanner (System.in);
		System.out.println ("Qual seu nome?");
		int nome = ent.nextInt();
		System.out.println ("Bem vindo"  + nome);
		
	}
	
}

