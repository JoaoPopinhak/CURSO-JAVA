package br.com.xti.logica;





import java.util.Random;
public class SeletorCarta {
	public static void main(String[] args){
		
		Random r = new Random();      //classe Random (java.util.Random) escolhe um número aleatoriamente
		
		String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] nipes = {"Espada", "Copa", "Paus", "Ouro"};
	
	
		int IndiceFace = r.nextInt(faces.length);       //r.nextInt(); da para informar no parametro "()" um valor de 0 até tal valor, ou informar outro tipo que resulte um limite de valor no parametro ex: "length"
		String face = faces[IndiceFace];
		
		int IndiceNipes = r.nextInt(nipes.length);
		String nipe = nipes[IndiceNipes];                      // dúvida do conteudo []
		
		
		
		String carta = face + " "  + "de"  + " " +  nipe;		
		System.out.println(carta);
		
	}
}