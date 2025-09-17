package br.com.xti.logica;


import java.util.ArrayList;
public class ForEach {
	public static void main(String[] args){
		
		int[] pares = {2,4,6,8};
		
		for (int i =0; i<pares.length; i++){    //usando array como limite
			int par = pares[i];                //criando um loop com os valores do array ex 0,1,2,3 e atribuindo na var "par"
			System.out.println(par);
		}   
//------------------------------------------------------------		  
	    for (int par : pares){	                //usando o array "pares" como limite e dizer para o par percorrei a sequencia do array
			System.out.println(par);            // ele so percorre não tem como informar como é para comparar
			
		}
		
//------------------------------------------------------------
		ArrayList<String> list = new ArrayList<String>();
		for (int i= 0; i<10; i++){
			list.add(i);
		}
		for (Integer numero : list){
			System.out.println(numero);
			
			
		}
		
		
	}
}
	
		
		    
		