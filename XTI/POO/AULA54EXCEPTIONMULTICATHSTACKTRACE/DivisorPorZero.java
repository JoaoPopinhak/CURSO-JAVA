package POO.AULA54EXCEPTIONMULTICATHSTACKTRACE;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisorPorZero {
	
	public static void dividir(Scanner scanner) throws InputMismatchException,ArithmeticException//Avisa o dev que pode ocorrer essa exceções e avisa que precisa ser tratado
	{
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo segundo: ");
		int num2 = scanner.nextInt();
		
		System.out.println(num1/num2);
		
	}
	
	public static void main(String[] args){
		
		
				Scanner scanner = new Scanner(System.in);
				boolean continua = true;
				
				do {
					
					try { // Bloco de codigos que deve ser executado se houver exception
						
						dividir(scanner);
						
						//Infinity num2 = 0
						//InputMismatchException String
						
						
						continua = false;
					}
					catch(InputMismatchException | ArithmeticException e1){//Tratamento do Expection que ocorrer, multi catch é a possibilidade de tratar vários expetion no mesmo bloco
						System.err.println("Digito inválido, tente novamente");
						
						e1.printStackTrace();//Mostra a pilha de erros
						e1.getStackTrace();//recebe um array de pilha de erros
						e1.getMessage();//Recebe os erros em formato string.
						
						scanner.nextLine();//Descarta a entrada errada e liberada para uma nova tentativa
					}
					
					finally{//Sempre é executado independente se houver erro ou não, é utilizado para limpar suas variaveis fechar conexão, fechar stremes de dados... 
						System.out.println("Finally executado...");
					}
					
				}while(continua);
				
		
	}
}
