package br.com.xti.logica;


import java.util.Scanner;
import java.util.Random;
public class DesafioDado {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[]faceDado = {"1", "2", "3", "4", "5", "6"};
		
		System.out.println("Digite o primeiro numero de 1 a 6");
		int faceEscolhida = scanner.nextInt();
		
		int faceSorteio = random.nextInt(faceDado.length);
		//int faceSorteio = 6;
		
		
		if (faceEscolhida == faceSorteio ) {		
			System.out.println("Numero sorteado =" + " " + faceSorteio + " " + "PARABENS VOCE ACERTOU");
		}
		else {		
			System.out.println("Numero sorteado =" + " " + faceSorteio  + " " + "Voce errou :( Tente novamente!");	
		}
		
		
		
	}
}