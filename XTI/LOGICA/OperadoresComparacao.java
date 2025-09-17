package br.com.xti.logica;


public class OperadoresComparacao {
public static void main(String[] args) {
	
	int x = 6;
	
	//x == 6;
	//os operadores de comparação sempre retornam um valor boolean (true) or (false)
	System.out.println(x == 2);
	
	Integer x = 6;

	
	System.out.println(x instanceof Integer); // instanceof só funciona para classes wrapper(dúvida w)
	}		
}

/*
Operadores de comparação

== Igual
!= Diferente
> Maior
< Menor
>= Maior ou igual
<= Menor ou igual
instanceof Compara Tipos

*/