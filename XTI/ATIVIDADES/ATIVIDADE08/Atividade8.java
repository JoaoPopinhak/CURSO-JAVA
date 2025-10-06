package ATIVIDADES.ATIVIDADE08;

public class Atividade8 {
	
	public static int converterParaInteiro(String string) 
	throws NumberFormatException
	{
		try {
			
			return Integer.parseInt(string);
			
		}catch(NumberFormatException e1){
			
			System.out.println("Para converter o caracter precisa ser numero");
			return 0;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		converterParaInteiro("1");
		
	}

}
