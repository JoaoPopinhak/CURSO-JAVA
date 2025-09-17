package LOGICA;




import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Bem vindo playboyzinho\nDIGITE OK PARA COMEÇAR!");
		String ok = scanner1.next();
		
		int i = 0;
	
		while ( i<10){
			
			if("OK".equalsIgnoreCase(ok=scanner1.next())) {
				
				System.out.print("Digite um número para escolher um programa\n1 - Para iniciar a calculadora.\n2 - Para iniciar o seletor de carta.\n3 - Para iniciar o Notepad.\n4 - Para encerrar o programa.");
				int escolha = scanner1.nextInt(); 
				
				if(escolha == 1) {
					
					System.out.print("Digite o primeiro número" + " ");
					double num1 = scanner1.nextDouble();
					
					System.out.print("Digite o operador" + " ");
					String operador = scanner1.next();
					
					System.out.print("Digite o segundo número" + " ");
					double num2 = scanner1.nextDouble();
					
					double resultado = 0;
					
					if(operador.equals("+")){
						
						resultado = num1 + num2;
					}
					
					if(operador.equals("-")){
						
						resultado = num1 - num2;
					}
					
					if(operador.equals("*")){
						
						resultado = num1 * num2;
					}
					
					if(operador.equals("/")){
						
						if(num2 <= 0){
							
							System.out.println("Não é possível dívidir o valor por zero!");
						}
						else{
							resultado = num1 / num2;
						}
						
					} else {
						
						System.out.println("Operador invalido, tente novamente");
					}
					
					System.out.println("Resultado: " + resultado);
					
				} // fim escolha 1 calculadora~
				
				
				if(escolha == 2) {
					Random aleatorio = new Random();
					
					String[] carta = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
					String[] naipe = {"PAUS", "OURO", "COPA", "ESPADA"};
					
					System.out.println("Escolha uma carta de A - K");
					String cartausuario = scanner1.next();
					
					System.out.println("Escolha um naipe: PAUS - OURO - COPA - ESPADA");
					String naipeusuario = scanner1.next();
					
					
					String cartaescrita = carta[aleatorio.nextInt(carta.length)];
					
					
				
					String naipeescrita = naipe[aleatorio.nextInt(naipe.length)];
			
					
					if(cartausuario.equalsIgnoreCase(cartaescrita) && naipeusuario.equalsIgnoreCase(naipeescrita)){
						
						System.out.println(cartaescrita + " " + "DE" + " " + naipeescrita + " " + "Parabéns você acertou");
					} else {
						
						System.out.println(cartaescrita + " " + "DE" + " " + naipeescrita + " " + "Você errou :( Tente novamente");
					}
					
					
					
					
					
				}// fim carta
				
				if(escolha == 3) {
					
					ArrayList<String> notepad = new ArrayList<String>();
					
					System.out.println("Digite sua lista" + " " + "Para encerrar digite FIM");
					
					String lista;
					
					while(!"FIM".equalsIgnoreCase(lista = scanner1.nextLine())){
						notepad.add(lista);
						
					} System.out.println(notepad.toString()); //FIM NOTEPAD
					
				
				}
				if(escolha == 4) {
					System.out.print("FIM");
				}
				
			}else{     //fim if while
				System.out.println("Tente novamente");
				i++;
				continue;
			} 
			
			

			
		} /*fim whille*/
		System.out.println("Você tentou digitar OK 10 vezes e não conseguiu?");
		i++;
		
		
		
		
		
		
			
		
		
	}
}

