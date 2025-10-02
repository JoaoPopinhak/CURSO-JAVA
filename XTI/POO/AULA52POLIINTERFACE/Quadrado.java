package POO.AULA52POLIINTERFACE;

public class Quadrado implements AreaCalculavel {//Utiliza IMPLEMETS e escreve o nome da interface que será utilizado

	
	double lado;
	
	public Quadrado(double lado){
		this.lado=lado;
	}
	
	
	public double calculaArea() {
		
		return lado*lado;
	} 
	
	
	
}
