package POO.AULA56ASSERTIONS;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre em um número de 0 a 10");
		int numero = scanner.nextInt();
		
		
		
		assert(numero >=0 && numero<=10) : "Numero Invalido " + numero;//utilizada somente para teste do dev precisa ativar 
		System.out.println("Você acessou " + numero);
		

	}

}
