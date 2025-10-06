package ATIVIDADES.ATIVIDADE13;

public abstract class Banco {
	
	private double saldo;
	
	public Banco(double saldo){
		this.saldo=saldo;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setSaldo(double valorSaldo){
		this.saldo=valorSaldo;
	}
	
	public void saque(double valorSaque)throws SaldoInsuficienteException{
		if(saldo < valorSaque){
			throw new SaldoInsuficienteException("Valor de saldo insuficiente");
		}else{
			saldo -= valorSaque;
		}
		
	}
}
