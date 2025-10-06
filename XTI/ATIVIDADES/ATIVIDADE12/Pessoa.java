package ATIVIDADES.ATIVIDADE12;

public abstract class Pessoa {
	String nome;
	int idade;
	
	public Pessoa(String nome, int idade)
	throws IdadeInvalidaException
	{
		if(idade < 0){
			throw new IdadeInvalidaException("Idade não pode ser menor que 0");
		}else{
			this.nome = nome;
			this.idade = idade;
		}
	}

}
