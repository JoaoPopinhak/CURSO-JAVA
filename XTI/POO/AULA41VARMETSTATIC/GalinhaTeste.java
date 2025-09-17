package POO.AULA41VARMETSTATIC;

public class GalinhaTeste {

	public static void main(String[] args) {
		
		Galinha corico = new Galinha();
		
		corico.botar();
		corico.botar();
		corico.botar();
		
		corico.botar().botar().botar();
		
		System.out.println(corico.ovos);
		
		
		Galinha zilda = new Galinha();
		zilda.botar().botar();
		
		System.out.println(zilda.ovos);
		
		System.out.println(Galinha.ovosDaGranja);
		
		System.out.println(Galinha.mediaDeovos(2));
		
		

	}

}
