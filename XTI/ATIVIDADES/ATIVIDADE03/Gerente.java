package ATIVIDADES.ATIVIDADE03;

public class Gerente extends Funcionario{
	double bonus;
	
	public Gerente(String nome, double salario, double bonus){
		super(nome, salario);
		this.bonus=bonus;
	}
	
	public double CalcularSalario(){
		return salario+bonus;
	}
	
	
}
