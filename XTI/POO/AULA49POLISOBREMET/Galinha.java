package POO.AULA49POLISOBREMET;

public class Galinha extends Animal {
	
	
	public Galinha() {
		super(5, "milho"); //utlizandio o construtor da classe pai
	}	
	
	public void barulho(){
		System.out.println("Có, có");
	}

}
