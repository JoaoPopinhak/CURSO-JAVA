package POO.AULA48HERANCACONSTRSUPER;

public class AnimalTest {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Galinha corico = new Galinha();
		
		System.out.println(dog instanceof Cachorro);//intance off retorno se o objeto dog é do tipo aniamal 
		System.out.println(dog instanceof Animal);

		dog.equals(corico);//Equals compara dois objetos e verifica se os valores são iguais
		dog.hashCode();//gera um tipo de ID unico para objeto
		dog.getClass();// retorna o tipo da classe desse objeto
		dog.toString();//Retorna a representação em String desse objeto;
	}

}
