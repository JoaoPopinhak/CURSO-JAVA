package POO.AULA48HERANCACONSTRSUPER;

public class Cachorro extends Animal {
	
	double peso;
	
	public Cachorro(){
		super(10, "Carne"); //utilizando o contrutor da classe pai
		
		//this.peso; // Estou chamando o atributo dessa classe
		//super.peso // Estou chamando o atributo da classe pai
		
	}

}
