package POO.AULA47HERANCA;

public class AnimalTest {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		dog.comida = "Carne";
		dog.domir();
		
		Galinha coco = new Galinha();
		coco.fazerBarulho();
		coco.domir();
		

	}

}
