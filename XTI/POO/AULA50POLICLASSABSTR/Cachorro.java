package POO.AULA50POLICLASSABSTR;

public class Cachorro extends Animal {
	
	double peso;
	
	public Cachorro(){
		super(10, "Carne"); //utilizando o contrutor da classe pai
	}
		//this.peso; // Estou chamando o atributo dessa classe
		//super.peso // Estou chamando o atributo da classe pai
		
		public void barulho(){ //sobescrevendo o mesmo metodo da classe pai na classe filho com seus comportamentos diferentes agora é obrigatorio pois o metodo agora é abstrato
			System.out.println("Au, au");
		}
		
	

}
