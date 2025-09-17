package LOGICA;



public class AulaGarbege {
	public static void main (String[] args) {
		 
		
		//Variavel primitiva
		//int x = 7;
		//int = 9;
		
		//variavel de referencia
		String var1 = "XTI";   // vai para o coletor de lixo 
		var1 = "xti.com.br";  // altera o conteúdo da var1  
		var1 = null;   // Deixa vazio a var1 e coleta(lixeira) o conteudo(objeto) da var1 anterior
		
		System.out.println("so para testar > " + (var1));
		
		
    }
}