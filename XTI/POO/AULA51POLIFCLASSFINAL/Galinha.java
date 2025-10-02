package POO.AULA51POLIFCLASSFINAL;

public class Galinha extends Animal {
	
	/**
	 * Você só não precisará implementar um metodo abstrato na sua classe se a classe filho também foi abstrata
	 */
	
	
	public Galinha() {
		super(5, "milho"); //utlizandio o construtor da classe pai
	}	
	
	public void barulho(){//sobescrevendo o mesmo metodo da classe pai na classe filho com seus comportamentos diferentes agora é obrigatorio pois o metodo agora é abstrato
		System.out.println("Có, có");
	}

}
