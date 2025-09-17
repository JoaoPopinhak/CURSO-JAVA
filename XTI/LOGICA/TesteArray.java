package br.com.xti.logica;


import java.util.Arrays;
public class TesteArray {
	public static void main(String[] args){
		
		String[] estados = {"SC","PR","RS"};
		
		System.out.println("traz o valor array 0"  +   estados[0]);
		
		int posicao = Arrays.binarySearch(estados, "SC");
		
		System.out.println("pesquisa valor SC"  + posicao);
		
		System.out.println("antes ordenacao"    + Arrays.toString(estados));
		
		Arrays.sort(estados, 0, estados.length);	
		System.out.println("Depois ordenacao"   + Arrays.toString(estados));
		
		Integer[] valores = {1, 10, 100 ,200};
		System.out.println("Valor do objeto 0"  +  valores[0].intValue());
		
		
	}	
}