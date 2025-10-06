package ATIVIDADES.ATIVIDADE01;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, String raça, int idade){
		super(nome,raça,idade);
	}
	

	public void EmitirSom(){
		System.out.println("Au Au Au!");
	}
	
}
