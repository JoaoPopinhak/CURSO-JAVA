package POO.AULA44CONSTRUTORES;

public class Carro {
	/**
	 * Construtor é para iniciar as variaveis que esse objeto tem
	 */
	
	String modelo;
	int velocidademax;
	double segundosZeroACem;
	
	public Carro() {//Versão do construtor padrão
		
	}  
	
	
    public Carro (String modelo, int velocidademax,double segundosZeroACem){ //Construtor pode receber parametros e abaixo está indicando que o parametro recebido vai para os atributos criados
		this.modelo = modelo;
		this.velocidademax = velocidademax;
		this.segundosZeroACem = segundosZeroACem;
	}

}
