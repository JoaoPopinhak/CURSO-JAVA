import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Calculator calculadora = new Calculator();
		
		while (true) {
			System.out.println("Escoha a operação deseja fazer:\n"
					+ "\n"
					+ "Digite + para somar\n"
					+ "Digite - para subtrair\n"
					+ "Digite * para multuiplicar\n"
					+ "Digite / para dividir");
			
			String operacao = scanner.next();
			
				
				if (operacao.equals("+")) {
					
					System.out.println("Digite os números que deseja somar: ");
					double result = calculadora.soma(scanner.nextDouble(), scanner.nextDouble());
					System.out.println(result);
					
				} if (operacao.equals("-")) {
					
					System.out.println("Digite os números que deseja subtrair: ");
					double result = calculadora.soma(scanner.nextDouble(), scanner.nextDouble());
					System.out.println(result);
					
				}if (operacao.equals("*")) {
					
					System.out.println("Digite os números que deseja multiplicar: ");
					double result = calculadora.multiplicação(scanner.nextDouble(), scanner.nextDouble());
					System.out.println(result);
				}if (operacao.equals("/")) {
					
					System.out.println("Digite os números que deseja dividir: ");
					double result = calculadora.divisão(scanner.nextDouble(), scanner.nextDouble());
					System.out.println(result);
					
				} else {
					
					System.out.println("Operação inválida. Tente novamente!\n");
				}
			
		}			
	}
}
