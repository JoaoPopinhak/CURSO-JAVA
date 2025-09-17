package POO.AULA36;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.cliente = "Nascimento";
		conta.saldo = 100.25;
		conta.exibeSaldo();
		conta.saca(0.25);
		conta.exibeSaldo();
		conta.deposito(900);
		conta.exibeSaldo();
		
		Conta conta2 = new Conta();
		conta2.cliente = "Tais";
		conta2.saldo = 300;
		conta2.exibeSaldo();
		conta2.transfere(conta, 300);
		conta2.exibeSaldo();
		
		conta.exibeSaldo();
	}

}
