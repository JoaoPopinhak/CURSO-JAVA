package br.com.xti.logica;


import java.util.Random;
import java.util.Scanner;

public class SeletorCartaUser {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Random r = new Random();      //classe Random (java.util.Random) escolhe um número aleatoriamente
		
		String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] nipes = {"Espada", "Copa", "Paus", "Ouro"};
		
		System.out.println("Informe o numero da carta que deseja");
		String infface = s.nextLine(); 
		
		System.out.println("Informe o nipe da carta que deseja");
		String infnipe = s.nextLine();
		
		
	    int indiceFace = r.nextInt(faces.length);       
		String face = faces[indiceFace];
		
		int indiceNipes = r.nextInt(nipes.length);
		String nipe = nipes[indiceNipes];  		       
		
		//String face = faces[0];
		//String nipe = nipes[0];
		
		
		String msg = (infface.equalsIgnoreCase(face) && infnipe.equalsIgnoreCase(nipe)) ? "Parabens! Voce acertou!" : "Voce errou, tente novamente";		
		String carta = face + " "  + "de"  + " " +  nipe;		
		System.out.println(carta + "" + " " + msg);
		
	}
}


// como fazer a comparação de uma string com a ordem do array numeral