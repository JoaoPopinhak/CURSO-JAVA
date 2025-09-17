package LOGICA;




import java.util.Arrays;
public class ArraySimples {
	public static void main(String[] args){
		
		
		String[] estados = {"SC","PR","RS"};      //para definir que o objeto String é um array utiliza=se os [] após o nome do tipo é utilizado para colocar mais de um valor em variavel = array
		
		System.out.println(estados[0]);
		
		estados[0] = "Santa Catarina";           // dessa forma você consegue alterar o valor "0" que corresponde ao SC para Santa Catarina utilizando [0](array) e a posição do valor dentro da String estados
		
//--------------------------------------------------------------------------
		
		int[] impares = new int [5];               //Outra forma de utilizar o array de tipo primitivo
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		
		
		System.out.println(impares.length);            //lenght é utilizado para trazer a quantidade de posições(valores) tem o arrey
		
//---------------------------------------------------------------------------	
	    
		
	     //String[] estados = {"SC","PR","RS"};  
	    
	     System.out.println(Arrays.toString(estados));	//classe import java.util.Arrays; para manipular arrays e alterar o tipo do array || para trazer todos os valores do array?
		
		// resultado do programa imprime SC PR RS 
		 
		//PESQUISA DE VALORES NO ARRAY
		 
		int posicao = Arrays.binarySearch(estados, "RS"); //no metodo Arrays.binarySearch recebe o paremetro (Arrays da consulta, valor pesquisa) para realizar a pesquisa do array
		 
		 System.out.println(posicao);
//-------------------------------------------------------------------------------		 
		 String[] paises = {"Brasil", "Alemanha"};
		 
		 Arrays.sort(estados, 0, paises.length);          //metodo para ordenar os valores array 0,1,2,3...
		 
		 System.out.println(Arrays.toString(estados));
		 
//--------------------------------------------------------------------------------
		
		Integer[] valores = {1, 10, 100 ,200};
		System.out.println(valores[0].intValue());  //quando colocado objeto dentro do array podemos acessar os metodos do obejto direto pelo array
		
		
		 
		 
	}
}


