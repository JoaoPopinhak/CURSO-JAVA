package ATIVIDADES.ATIVIDADE11;

public abstract class Produto {
	
	String nome;
	double valor;
	
	public  Produto(String nome, double valor)
	throws PrecoInvalidoException
	{
		if(valor<0){
			throw new PrecoInvalidoException("O valor não pode ser menor que 0");
		}else{
			this.nome= nome;
			this.valor=valor;
		}
	
	}
}
