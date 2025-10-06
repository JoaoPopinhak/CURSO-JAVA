package POO.AULA50POLICLASSABSTR;
/**
 * Primeiro precisamos identificar os objetos que contenham os mesmo atributos e metodos
 * Após isso foi criado uma superclasse que represente os dois
 *  Como saber identificar se uma classe deve herdar outra classe para isso o teste "É um" exemplo Cachorro é um animal, galinha é uma ave e ave é um animal
 *  
 *  teste exemplo É UM
 *  1. Quadrado é uma forma? Sim (então QUADRADO pode herdar de FORMA)
 *  2. Bebida é Cerveja? Não 
 *  3. Forno é cozinha? Não 
 *  4. Funcionário é pessoa? Sim 
 */

public abstract class Animal {  //Os metodos abstratos só podem existir quando a CLASSE não pode ser istanciada ou seja somente em classses abstratas também.
	

	Double peso;
	String comida;
	
	
	abstract void barulho(); //metodo generico abstrato do pai onde os filhos ssempre precisaram sobrescrever o metodo do pai pois o pai não faz nada são os filhos que fazem
	
	
	void dormir(){ //As classes abstratas também podem ter metodos implemementados(normais)
		System.out.println("Dormiu");
	}
	
	public Animal(double peso, String racao){//Criando o construtor do pai
		
	}
	

	
	

}
