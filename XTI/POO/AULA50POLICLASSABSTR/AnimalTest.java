package POO.AULA50POLICLASSABSTR;
/**
 * Como subistituir fluxos condicionais por poliformismo
 */

public class AnimalTest {
	
	public static void barulho(Animal animal) {
		animal.barulho();
	}
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Galinha corico = new Galinha();
		//Animal generico = new Animal();//Apartir dessa aula a classe animal não pode ser utilizuada (istanciada)
		
		
		dog.equals(corico);//Equals compara dois objetos e verifica se os valores são iguais
		dog.hashCode();//gera um tipo de ID unico para objeto
		dog.getClass();// retorna o tipo da classe desse objeto
		dog.toString();//Retorna a representação em String desse objeto;
		
		dog.barulho();
		corico.barulho();
		//generico.barulho();
		
		
		barulho(dog);
		barulho(corico);
	}

}
