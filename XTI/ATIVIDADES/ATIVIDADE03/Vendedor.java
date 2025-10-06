package ATIVIDADES.ATIVIDADE03;

public class Vendedor extends Funcionario{
	double comissao;
	
	public Vendedor(String nome, double salario, double comissao){
		super(nome, salario);
		this.comissao=comissao;
	}
	
	
	public double CalcularSalario(){
		return salario+comissao;
	}

}
