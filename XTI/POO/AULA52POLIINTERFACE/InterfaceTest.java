package POO.AULA52POLIINTERFACE;

public class InterfaceTest {
	
	public static void area(AreaCalculavel a){
		System.out.println(a.calculaArea());
	};
	
	public static void vol(VolumeCalculavel v){
		System.out.println(v.calcularVolume());
	}

	public static void main(String[] args) {
		
		area(new Quadrado(10));
		
		vol(new CalculoCubo(10));
		
		area(new CalculoCubo(10));
	
	}

}
