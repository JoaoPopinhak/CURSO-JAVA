
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
		if(saldo >= valor) {
			saldo -= valor;
		}else {
			System.out.println("Saldo insuficiente\nTente novamente.\n");
		}
	}
	
	void transfere (ContaBancariaClass ContaBancariaArray, double valor) {
		if (this.saldo >= valor)
		this.saque(valor);
		ContaBancariaArray.deposita(valor);
		
	}

	@Override
	public String toString() {
		 return "CONTA: " + this.nomeconta + " SALDO: " + this.saldo + "\n";
	}
	
	
}
