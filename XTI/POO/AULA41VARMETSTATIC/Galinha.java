package POO.AULA41VARMETSTATIC;

public class Galinha {
	
	public static int ovosDaGranja;//static para tornar uma variavel global da classe
	
	public int ovos; //total de ovos do objeto galinha
	
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosDaGranja++;//Adicionando um valor a variavel global da classe
		return this;
	}
	
	public static double mediaDeovos(int galinhas){
		return ovosDaGranja/galinhas; //total de ovos da granja divido pelo numero de galinhas informado pelo usuário.
	}
	

}
