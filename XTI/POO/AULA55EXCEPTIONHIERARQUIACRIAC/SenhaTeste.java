package POO.AULA55EXCEPTIONHIERARQUIACRIAC;

public class SenhaTeste {
	
	static void autenticar(String senha)
			throws SenhaInvalidaException
	{
		if("123".equals(senha)){
			//autenticado
			System.out.println("Autenticado");
		}else{
			//senha incorreta
			throw new SenhaInvalidaException("SENHA INCORRETA");
		}
	}

	
//-------------------------------------------------------------------	
	
	
	public static void main(String[] args) {
		
		
		try{
			autenticar("oi");
			
			
		}
		catch(SenhaInvalidaException e1){
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		
	}

}
