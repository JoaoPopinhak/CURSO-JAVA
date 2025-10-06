package ATIVIDADES.ATIVIDADE10;

public class Atividade9 {
	
	public static int divisao (int num1, int num2)
	throws DivisaoPorZeroException
	{
		if(num2 == 0){
			throw new DivisaoPorZeroException("Não é permitido a divisão por zero");
		}else{
			return num1/num2;
		}
		
	}
	
	public static void main(String[] args)
	throws DivisaoPorZeroException 
	{
		
		try {
			
			System.out.println(divisao(2,0));
		}
		
		catch(DivisaoPorZeroException e1){
			
			System.out.println(e1.getMessage());
			
		}
		
		
	}
}
