package POO.AULA44CONSTRUTORES;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro bwm = new Carro(); // Contrutor padrão do objeto
		bwm.modelo = "Z4";
		bwm.velocidademax = 240;
		bwm.segundosZeroACem = 1.5;
		
		Carro zentorno = new Carro("Z4",240 ,1.5);
		
		System.out.println(zentorno.modelo + zentorno.segundosZeroACem + zentorno.velocidademax);
	}
}
