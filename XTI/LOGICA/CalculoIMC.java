/*
Calculor o IMC
imc = peso Kg / (altura em M * Altura em M) 
*/
package LOGICA;

import java.util.Scanner;
public class CalculoIMC {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	
	System.out.println("Digite seu peso...");
	double pesokg = s.nextDouble();
	
	System.out.println("Digite sua altura em Metros...");	
	double altura = s.nextDouble();
	
	double imc = pesokg / (altura * altura);
	
	String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do peso, bora malhar!!";
		
	
	System.out.println("Seu IMC é"  +  imc + "" +  msg);
	
	}
} 


//resposta correta 34,35