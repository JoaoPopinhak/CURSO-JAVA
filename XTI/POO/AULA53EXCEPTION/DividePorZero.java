package POO.AULA53EXCEPTION;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		boolean continua = true;
		
		do {
			
			try { // Bloco de codigos que deve ser executado se houver exception
				System.out.println("Digite o primeiro numero: ");
				int num1 = scanner.nextInt();
				
				System.out.println("Digite o segundo segundo: ");
				int num2 = scanner.nextInt();
				
				//Infinity num2 = 0
				//InputMismatchException String
				
				System.out.println(num1/num2);
				continua = false;
			}
			catch(InputMismatchException e1){//Tratamento do Expection que ocorrer
				System.err.println("Numeros devem ser inteiros");
				scanner.nextLine();//Descarta a entrada errada e liberada para uma nova tentativa
			}
			
			catch(ArithmeticException e2){
				System.err.println("O dividor deve ser diferente de 0");
			}
			
			finally{//Sempre é executado independente se houver erro ou não, é utilizado para limpar suas variaveis fechar conexão, fechar stremes de dados... 
				System.out.println("Finally executado...");
				scanner.close();
			}
			
		}while(continua);
		
		
		
		
		

	}

}
