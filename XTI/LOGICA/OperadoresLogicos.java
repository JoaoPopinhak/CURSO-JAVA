package br.com.xti.logica;




public class OperadoresLogicos {
public static void main(String[] args){
	
	int x = 12;
	
	
	
	System.out.println((x >= 1) && (x <= 10)); // e  as duas devem ser verdadeiras para retornar true
	System.out.println((x >= 1) || (x <= 10)); // ou um deve ser verdadeira para retornar true
	System.out.println(!(x <= 5));  // nega a operação se for true, vai dar false
	}
}


/*
Operadores Lógicos

&&&   AND (e)
|||   OR (OU)
!!   NOT (NÃO)

*/