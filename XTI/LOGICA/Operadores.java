package br.com.xti.logica;




public class Operadores {
	public static void main(String[] args){
		/*cada número é um operando unidos por um operador "+" 
		e todos juntos se chamam de expressão*/
		//2 + 3 operador binario pois trabalha com dois operandos 
		// -2 operador unario pois trabalha apenas com um operando
		// true ? "sim" : "não" operador ternário pois atua com 3 operando
		
		int var1 = 9 + 4;
		String var1 = "9" + "4"; // o operador "+" também é utilizado para unir string
		double var1 = 9 + 4 - 3 * 2; // como na matemática dependendo do operador terá preferencia entre os outros Ex * é primeiro que +.
		double var1 = (9 + 4 - 3) * 2; // como na matématica se inserir os () entre os calculos o que estiver dentro do parentese será calculado primeiro
		System.out.print(var1);
	}
}