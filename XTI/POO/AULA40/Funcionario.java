package POO.AULA40;

public class Funcionario {
/*
GET / IS
Para captura de informação

SET
Para edição configuração

IS para boolean
*/
	
	private String nome;
	private boolean ativo;
	
	public String getNome(){  // METODO getVariavel(Nome varivel private) para retornar a variavel private para public sem alterar a variavel 
		return nome;
	}
	
	
	public void setNome(String novonome){
		this.nome = novonome;
		
	}
	
	public boolean isAtivo(){
		return ativo;
	}
	
	public void istAtivo (boolean ativo){
		this.ativo = ativo;
	}



	
	
	
	
	
	
public static void main(String[] args) {
	
	Funcionario funci = new Funcionario();
	
	funci.nome = "João"; // Está acessivel pois está na mesma classe
	
	
    }	
}