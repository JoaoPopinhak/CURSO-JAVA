
public class ContaBancariaClass {
	
	String nomeconta;
	double saldo;
	
	void exibenomeconta () {
		System.out.println("Conta: " + nomeconta);
		
	}
	
	void exibesaldo () {
		System.out.println("Seu saldo é: " + saldo + " Reais\n");
	}
	
	void deposita (double valor) {
		saldo += valor;
	}
	
	void saque (double valor) {
		saldo -= valor;
	}
	
	void transfere (ContaBancariaClass nomeconta, double valor) {
		this.saque(valor);
		nomeconta.deposita(valor);
		
	}
	
}
