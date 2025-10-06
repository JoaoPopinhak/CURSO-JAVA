package POO.AULA54EXCEPTIONMULTICATHSTACKTRACE;

import POO.AULA47HERANCA.Animal;
import POO.AULA47HERANCA.Cachorro;
import POO.AULA47HERANCA.Galinha;


public class ExceçõesComuns {
	
	static int[] arrayNull = new int[0];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//NullPointerException  utilizar um metodo de um objeto que ainda não existe
		//System.out.println(arrayNull.length);
		
		
		//ArithmeticException  divisão por 0
		//int x = 5/0;
		
		
		//ArrayIndexOutOfBoundsException acessar a oposição de um array que não existe
		//System.out.println(arrayNull[1]);
		
		
		//ClassCastException
	    //Animal a = new Galinha();	
	    //Cachorro c = (Cachorro) a;

		
		//NumberFormatException
		//double d = Double.parseDouble("x");
	}

}
