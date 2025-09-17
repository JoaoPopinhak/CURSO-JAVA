package LOGICA;


public class AulaConstantesModificadorFinal {
	public static void main (String[] args) {
		
		
		int var1 = 10000;       //Pode ser alterado com um novo valor
		var1 = 123; //o valor é modificado              
		
		final int var2 = 1000; //o valor não pode ser modificado (final é um modificador) torna a var2 uma constante aonde não pode ser modificado
		var2 = 123; // da erro ao compilar justamente por conta do modificar "final" na var2
		
		
		//exemplo quando precisar usar um modificador final 
		final char = SEXO_MASCULINO = 'M';   //NOME DE CONSTANTE É ATRIBUIDA COM LETRA MAISCULA SEPARADO POR  "_"
		final char = SEXO_FEMENINO = 'F';
		
		//AO UTILIZAR UM MODIFICADOR NA VARIAVEL TORNA A VARIAVEL NUMA CONSTANTE
		
		System.out.println (var2); 		
    }
}