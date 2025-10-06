package POO.AULA45RELATEMUM;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro bwm = new Carro(); // Construtor padrão do objeto
		bwm.modelo = "Z4";
		bwm.velocidademax = 240;
		bwm.segundosZeroACem = 1.5;
		
		Motor v12 = new Motor();
		v12.tipo = "v12";
		v12.potencia = 660;
		
		bwm.motor = v12; // Adiciona um objeto a outro objeto (objeto carro tem objeto motor)
		
		Carro zentorno = new Carro("Z4",240 ,1.5); // Construtor com parametros
		Motor dois0 = new Motor("2.0", 300);
		
		zentorno.motor = dois0; //Adiciona um objeto a outro objeto (objeto carro tem objeto motor)
		
		
		Carro bugati = new Carro("Bugatti",430,1.5, new Motor("W16", 1200)); //Criando o objeto carro, como no parametro o carro recebe um motor também podemos criar o objeto motor ao mesmo tempo que criarmos o novo objeto de carro
		
		
		
		System.out.println(bugati.motor.potencia); //acessando os atributos de um objeto que está dentro de outro objeto
	}
}
