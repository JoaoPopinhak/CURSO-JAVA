package POO.AULA49POLISOBREMET.OPMATH;

public class OperacaoTest {
	
	public static void calcule(OperacaoMatematica operacao, double num1, double num2){
		System.out.println(operacao.calcular(num1, num2));
	}
	
	public static void main(String[] args) {
		
		calcule(new Soma(), 5,5);
		calcule(new Multiplicacao(), 5,5);
		
	}

}
