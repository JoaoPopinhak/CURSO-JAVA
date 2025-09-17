package POO.AULA43METOSOBRE;

public class Matematica {
	/**
	 * Mesmo criando vários metodos com o mesmo nome
	 * O Java identifica a qual metodo é o correto dependendo do parametro informado
	 * No exemplo 1 foi adicionado dois int
	 * No exemplo 2 foi adicionado duas String
	 * E no exemplo 3 foi adicionado somente um int
	 * porém todos os metodos estão com o mesmo nome
	 */
	
	int media (int num1 , int num2){
		System.out.print("media (int num1 , int num2) ");//Assinatura do metodo
		return num1+num2/2;
	}
	
	int media (String y, String x) {
		System.out.print("media (String y, String x) ");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix+iy)/2;
	}
	
	int media (int num1){
		System.out.print("media (int num1) ");//Assinatura do metodo
		return num1/1;
	}
	 
	
	
}
