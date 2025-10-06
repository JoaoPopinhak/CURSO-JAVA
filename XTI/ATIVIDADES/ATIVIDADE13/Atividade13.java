package ATIVIDADES.ATIVIDADE13;

public class Atividade13 {

	public static void main(String[] args) {
		
		ContaCorrente novaCC = new ContaCorrente(300);
		ContaPoupanca novaCP = new ContaPoupanca(250);
		
		try {
			novaCC.saque(200);
			System.out.println(novaCC.getSaldo());
			
			novaCP.saque(300);
			System.out.println(novaCP.getSaldo());
			
		}catch(SaldoInsuficienteException e1){
			System.out.println(e1.getMessage());
		}
		
	}
}
