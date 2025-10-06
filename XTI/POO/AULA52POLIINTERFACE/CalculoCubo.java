package POO.AULA52POLIINTERFACE;

public class CalculoCubo implements AreaCalculavel, VolumeCalculavel{

	double lado;
	
	public CalculoCubo(double lado){
		this.lado=lado;
	}
	
	
	
	
	
	public double calcularVolume(){	
		return 6* lado * lado;
	}


	
	
	
	public double calculaArea() {

		return lado*lado*lado;
	}
	
	
	
	
	
	
}
