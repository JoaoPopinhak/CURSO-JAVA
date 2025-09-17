package br.com.xti.logica;




public class Switch {
	public static void main(String[] args){
		
		char sexo = 'M';
			
		switch (sexo) {                                 //NO SWITCH VOCÊ PODE USAR A VARIAVEL APENAS UMA VEZ SE FOSSE NO IF ELSE TERIA QUE REPETIR A CADA CONSULTA 
			case ('M') :
			System.out.println(MASCULINO);              //NO SWITCH NÃO FAZ AS COMPARCOES ==, <=, >=, !=, || ELE FAZ OPERAÇÃO DE IGUALDADE APENAS = ==
			break;
			
			case ('F') :
			System.out.println(FEMENINO);
			break;
			
			default  :
			System.out.println(OUTRO);
					
		}
						
		
	}
}












