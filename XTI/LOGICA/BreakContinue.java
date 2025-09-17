package LOGICA;
public class BreakContinue {
	public static void main(String[] args){
		
		while (true) {
			System.out.println("Loop infinito");
			break;   //break é utilizado para paralizar o loop inteiro
		}
		
//-------------------------------------------------------------		
		
		for (int i = 0; i<=10; i++){
			if (i == 5){
				break;              //if (se) o i for == a 5 o break para o loop
			}
			System.out.println(i);
			
		}
		
//---------------------------------------------------------------		
		
		for (int i = 0; i<=5; i++){
			if (i == 5){
				continue;                  //se o i for == a 5 ele continua(pula) para a próxima execução do número 6 (ele para apenas o loop atual) 
			}
			System.out.println(i);
		}
		
//---------------------------------------------------------------		
		
		/*Rótulos é utilizado para indicar qual loop você quer continuar ou parar */
		
		
		um:                 //como atribuir um "nome" para o for (um:)
		for() {
			dois:           //nome dois:
			for (int i =0; i<=10; i++){
			if (i == 5){
				break um;
			}
			System.out.println(i);
			
	        }
		
		}
		
//---------------------------------------------------------------		
		/Não entendi muito bem.../
		boolean [] [] matrix = 
		{
			{false, true, false, false, false},
			{false, false, false, false, false}
			
		};
		
		for (int a = 0; a<matrix.length; a++){
			
			System.out.println("*");
			for (int b = 0; b < matrix[a].length; b++) {
				if(matrix[a] [b]){
					System.out.println("True");
				}
				System.out.println("b");
			}
			
			
		}
		
//-------------------------------------------------------------------------------		
		busca:
		for (int a = 0; a<matrix.length; a++){
			
			System.out.println("*");
			for (int b = 0; b < matrix[a].length; b++) {
				if(matrix[a] [b]){
					System.out.println("True");
					break;                                            // parou o ciclo interno break busca; pararia o for externo
				}
				System.out.println("b");
			}
			
			
		}
		
		
		
		
		
		
		
		
	}
}