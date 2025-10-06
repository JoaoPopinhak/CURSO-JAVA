package FINANCEIRO;

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
		if(valor > 0){
			saldo += valor;
		}else{
			System.out.println("Inconsistência no valor de deposito. Tente novamente.");
		}
	}
	
	void saque (double valor) {
		if(saldo >= valor && valor > 0){
			saldo -= valor;
		}else{
			System.out.println("Inconsistência no valor de saque. Tente novamente.");
		}
	}
	
	void transfere (ContaBancariaClass ContaBancariaArray, double valor) {
		this.saque(valor);
		ContaBancariaArray.deposita(valor);
		
	}

	@Override
	public String toString() {
		 return "CONTA: " + this.nomeconta + " SALDO: " + this.saldo + "\n";
	}
	
	
}
