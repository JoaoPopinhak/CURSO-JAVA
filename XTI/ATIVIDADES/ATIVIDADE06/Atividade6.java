package ATIVIDADES.ATIVIDADE06;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		boolean errado = true;
		
		do {
			try{
				System.out.println("Digite o 1 número");
				int num1 = scan.nextInt();
				
				System.out.println("Digite o 1 número");
				int num2 = scan.nextInt();
				
				System.out.println(num1/num2);
				errado = false;
			} 
			catch(ArithmeticException e1){
				System.out.println("Numeros não podem ser divididos por zero");
			}

		}while(errado);
		
		
		System.out.println("Continuou");
		scan.close();
		
	}

}
