package FINANCEIRO;

public class CartaoCredito {
	String nomecc;
	double limite;
	double limiteutilizado;
	double limitedisponivel;
	
	
	
	void despesacartao (double valor){
		limiteutilizado += valor;
		if(limiteutilizado <= limite){
			System.out.println("Despesa lançado com sucesso.");
			limitedisponivel = limite - limiteutilizado;
		}else {
			limiteutilizado -= valor;
			System.out.println("Crédito insuficente.");
			
		}
		
		System.out.println("limite utilizado " + limiteutilizado + " Valor limite disponivel " + limitedisponivel + " Limite " + limite);
	}

	void pagamentocartao(ContaBancariaClass contabancaria){
		if(contabancaria.saldo >= limiteutilizado){
			contabancaria.saque(limiteutilizado);
			limiteutilizado = 0;
			limitedisponivel = limite;
			System.out.println("Pagamento realizado com sucesso.");
			System.out.println("Seu novo saldo é: " + contabancaria.saldo + " Seu limite disponível é: " + limitedisponivel);
		}else{
			System.out.println("Sem saldo suficiente para realizar o pagamento do cartão.");
		}
		
	}
}
