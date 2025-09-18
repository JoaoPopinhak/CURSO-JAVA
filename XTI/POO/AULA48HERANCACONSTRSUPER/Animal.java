package POO.AULA48HERANCACONSTRSUPER;
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

public class Animal {
	
	protected int serial;   // Esse modificar so vai aparecer para as subclasses (filhos)
	Double peso;
	String comida;
	
	
	public Animal(double peso, String comida){
		this.comida = comida;
		this.peso = peso;
	}
	
	

}
