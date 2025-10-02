package POO.AULA51POLIFCLASSFINAL;

public final class Cachorro extends Animal {//Como a classe pai recebeu o modificador final isso impede que essa classe seja extendida pela classe filho 
	
	
	
	
	public Cachorro(){
		super(10, "Carne"); //utilizando o contrutor da classe pai
	}
		//this.peso; // Estou chamando o atributo dessa classe
		//super.peso // Estou chamando o atributo da classe pai
		
		public void barulho(){ //sobescrevendo o mesmo metodo da classe pai na classe filho com seus comportamentos diferentes agora é obrigatorio pois o metodo agora é abstrato
			System.out.println("Au, au");
		}
		
		void dormir(){//Se o modificador final for implementado no metodo da classe pai não é possível sobreescrever esse metodo em seus filhos
			System.out.println("Dormir");
		}
		
	

}
