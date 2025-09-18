package POO.AULA45RELATEMUM;

public class Carro {
	/**
	 * Construtor é para iniciar as variaveis que esse objeto tem
	 */
	
	
	String modelo;
	int velocidademax;
	double segundosZeroACem;
	Motor motor; // Adiciona um atributo que é outra classe, outro objeto a esta classe a este objeto quando criado
	
	
	public Carro() {//Versão do construtor padrão
		
	}  
    
    public Carro (String modelo, int velocidademax,double segundosZeroACem, Motor motor){ //Construtor pode receber parametros e abaixo está indicando que o parametro recebido vai para os atributos criados
		this.modelo = modelo;
		this.velocidademax = velocidademax;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;
	}
    
    public Carro (String modelo, int velocidademax,double segundosZeroACem){ //Construtor pode receber parametros e dentro de chaves está indicando que o parametro recebido vai para os atributos criados
 		this(modelo, velocidademax, segundosZeroACem, null);                // Estamos utilizando esse contrutor para chamar o construtor de cima atraves dessa chamda
 	}
    

}
