package LOGICA;





import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args){
		Scanner scannerD = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número da equação:");
		double num1 = scannerD.nextDouble(); 
		scannerD.nextLine();
		
		System.out.println("Insira o operador:");
		String operador = scannerD.next();
		
		System.out.println("Insira o segundo número da equação:");
		double num2 = scannerD.nextDouble();
		
		
		double resultado = 0;
		
		switch(operador){
			case ("+") :                                               
			resultado = num1 + num2;
			break;
			
			case ("-") :
			resultado = num1 - num2;
			break;
			
			case ("*") :
			resultado = num1 * num2;
			break;
			
			case ("/") :
			if (num2 == 0) {
				System.out.println("Não é possível dividir por 0");
			} else {
				resultado = num1 / num2;
			}
			break;
			
			default:
			System.out.println("Operador não existe");
		}
			
		
		System.out.println("O resultado é =" + " " + resultado);
	
	}	
}