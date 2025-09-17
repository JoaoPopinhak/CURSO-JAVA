package br.com.xti.logica;


public class DesafioFonabicci {
	public static void main(String[] args){
		
	int primeiro = 0;
	int segundo = 1;
	int resposta;
	
	
		for(int i = 0; i <= 10; i++){
			resposta = primeiro + segundo;
			primeiro = segundo;
			segundo = resposta;
			System.out.println(resposta);
			}
		
		
//--------------------------------------------------------------------		
		
		
		int i = 0;
		
		while(i < 10) {
			resposta = primeiro + segundo;
			primeiro = segundo;
			segundo = resposta;
			
			System.out.println(resposta);
			
			i++;
		}
		
	
			
	}
}