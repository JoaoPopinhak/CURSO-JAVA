package POO.AULA42ARGUMENTOSVAR;

public class Matematica {
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return o maior dos dois numeros
	 */
	
	
	int maior(int num1, int num2){  //dessa forma foi definido uma quantidade de argumentos de entradas
		if(num1>num2){
			return num1;
		}else {
			return num2;
		}
	}
	
	
	int soma (int num1, int num2) { //dessa forma foi definido uma quantidade de argumentos de entradas
		return num1+num2;
	}
	
	int somamult (int ... numeros) { // Dessa forma é possível adicionar quantos argumentos forem necessários onde é criado um array com as informações de entrada
		int total = 0;
		for(int n : numeros) {
			total+=n;
		}
		return total;
	}
	 
	
	
}
