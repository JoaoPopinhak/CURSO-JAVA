import java.util.ArrayList;
import java.util.Scanner;

public class ContaBancariaVoid {

	public static void main(String[] args) {
		
		ArrayList<ContaBancariaClass>contas = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		 // Istanciar (criar novo objeto) no 1 = criar novo objeto função criada para criar uma nova conta
		
		while (true) {
			
			System.out.println("Clica em uma das opções informadas abaixo:\n"
					+ "Digite 1 para criar uma nova conta bancaria\n"
					+ "Digite 2 para depositar um valor na conta\n"
					+ "Digite 3 para sacar um valor da conta\n"
					+ "Digite 4 para transferir sua conta\n"
					+ "Digite 5 para exibir suas contas cadastradas e o saldo de cada conta\n");
			
			int opcao = scanner.nextInt();
			
			if (opcao == 1) {
				ContaBancariaClass contabancaria = new ContaBancariaClass();
				
				System.out.println("Digite o nome da sua nova conta: ");
				contabancaria.nomeconta = scanner.next();
				
				System.out.println("Digite o saldo inical da sua conta: ");
				contabancaria.saldo = scanner.nextDouble();
				
				System.out.println("Parabéns, sua nova conta foi registrada!\n");
				
				contas.add(contabancaria);
				contabancaria.exibenomeconta();
				contabancaria.exibesaldo();	
				System.out.println(contas.size());
				
			} //else if (opcao == 2) {
				
//				System.out.println("Informe qual conta bancaria deseja efetuar o deposito: ");
//				
//				
//				System.out.println("Digite o valor que deseja depositar: ");
//				contabancaria.deposita(scanner.nextDouble());
//				
//				contabancaria.exibenomeconta();
//				contabancaria.exibesaldo();
//				
//			} else if (opcao == 3) {
//				System.out.println("Informe qual conta bancaria deseja efetuar o saque: ");
//				
//				
//				System.out.println("Digite o valor que deseja sacar: ");
//				contabancaria.saque(scanner.nextDouble());
//				
//				contabancaria.exibenomeconta();
//				contabancaria.exibesaldo();
//			}
			
		}	
	}
}
