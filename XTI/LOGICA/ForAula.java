package br.com.xti.logica;


import java.util.Scanner;

public class ForAula {
	public static void main(String[] args){
		
		for(int i=0; i<10; i++){        //for declara o inicio depois informa até qual número +1 dentro as chaves executa o comanda toda vez que for verdadeiro
			System.out.println(i);
		}
		
//----------------------------------------------------------------------
       /**/
	   for(int i=0; i<3; i++){       
		     texto = texto + i + ",";      //toda vez que for verdadeiro irá atribuir o valor "i" para a var "texto". O valor "i" só pode ser utilizada dentro do for por foi iniciado dentro do for
	} 
	
	    System.out.println(texto);
	
//-----------------------------------------------------------------------	
	    String texto = "";
		for(int i=10; i>0; i--){        //decrementar de 10 á 0 "i--"
			texto = texto + i + ",";
		}
		System.out.println(texto);
	
//-------------------------------------------------------------------------
        for (int i =0; i<=20; i++){
			if(i % 2 == 0){                      //da pra usar if no for
				texto += i + ",";
			}
			System.out.println(texto);
		}

	
	}
}