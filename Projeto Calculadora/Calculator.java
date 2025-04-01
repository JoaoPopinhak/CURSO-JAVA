
public class Calculator {
	
	double soma (double num1, double num2) {
		return num1 + num2;		
	}
	
	double subtração (double num1, double num2) {	
		return num1 - num2;
	}
	
	double multiplicação (double num1, double num2) {
		return num1 * num2;
	}
	
	double divisão (double num1, double num2) {
		if (num2 > 0) {
			return num1 / num2;
		} else {
			System.out.println("Não é possível divir por ZERO!");
			return 0;
		}
		
	}
}
