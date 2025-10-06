package ATIVIDADES.ATIVIDADE07;

import java.util.Scanner;

public class Atividade7 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int[] numero = new int [5];
		
		for(int i =0; i <numero.length; i++){
			System.out.println("Digite uma nota");
			numero[i]=scan.nextInt();
		}
		
		boolean erro = true;
		do {
			try {
				System.out.println("Digite o array que deseja visualizar");
				int num = scan.nextInt();
				
				System.out.println(numero[num]);
				erro = false;
			}
			catch(ArrayIndexOutOfBoundsException e1){
				System.out.println("O item da lista que escolheu não existe");
			}
			
		}while(erro);
		
		scan.close();	
	}
}
