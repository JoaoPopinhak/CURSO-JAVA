import java.util.ArrayList;
import java.util.Scanner;

public class ContaBancariaVoid {

	public static void main(String[] args) {
		
		ArrayList<ContaBancariaClass> contasBancarias = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);		
		//TODO: Edição de contas
		//Validação para cotas repetidas
		//Validacao de transferencia, deposito e saque
		
		while (true) {
			
			System.out.println("Clica em uma das opções informadas abaixo:\n\n"
					+ "Digite 1 para criar uma nova conta bancaria\n"
					+ "Digite 2 para depositar um valor na conta\n"
					+ "Digite 3 para sacar um valor da conta\n"
					+ "Digite 4 para transferir sua conta\n"
					+ "Digite 5 para exibir suas contas cadastradas e o saldo de cada conta\n");
			
			int opcao = scanner.nextInt();
			
			if (opcao == 1) {
				int voltar = 1;
				while (voltar != 0) {
				ContaBancariaClass contabancaria = new ContaBancariaClass();
				
				System.out.println("Digite o nome da sua nova conta: ");
				contabancaria.nomeconta = scanner.next();
				
				System.out.println("Digite o saldo inical da sua conta: ");
				contabancaria.saldo = scanner.nextDouble();
				
				System.out.println("Parabéns, sua nova conta foi registrada!\n");
				
				contasBancarias.add(contabancaria);
				
				System.out.println(contabancaria);
				
				System.out.println("Para voltar digite 0, para continuar cadastrando digite qualquer tecla");
				voltar = scanner.nextInt();
				}
			} else if (opcao == 2) {
				
				System.out.println("Informe qual conta bancaria deseja efetuar o deposito: \n");
				
				for (int i = 0; i < contasBancarias.size(); i++) {	
					System.out.println(i + " CONTA : " + contasBancarias.get(i).nomeconta + " SALDO: " + contasBancarias.get(i).saldo + "\n");	
				}
				
				ContaBancariaClass contabancaria = contasBancarias.get(scanner.nextInt());
				
				System.out.println("Digite o valor que deseja depositar: ");
				contabancaria.deposita(scanner.nextDouble());
				
				contabancaria.exibenomeconta();
				contabancaria.exibesaldo();
				
			} else if (opcao == 3) {
				
				System.out.println("Informe qual conta bancaria deseja efetuar o saque: ");
				
				for(int i = 0; i < contasBancarias.size(); i++) {
					System.out.println(i + " CONTA: " +contasBancarias.get(i).nomeconta + " SALDO: " + contasBancarias.get(i).saldo + "\n");
				}
				
				ContaBancariaClass contabancaria = contasBancarias.get(scanner.nextInt());
				
				System.out.println("Digite o valor que deseja sacar: ");
				contabancaria.saque(scanner.nextDouble());
				
				contabancaria.exibenomeconta();
				contabancaria.exibesaldo();
				
			} else if (opcao == 4) {
				
				System.out.println("Informe qual a conta de origem para transferencia");
				
				for(int i = 0; i < contasBancarias.size(); i++) {
					System.out.println(i + " CONTA: " + contasBancarias.get(i).nomeconta + " SALDO: " + contasBancarias.get(i).saldo);
				}
				
				ContaBancariaClass contabancaria = contasBancarias.get(scanner.nextInt());
				
				System.out.println("Digite a conta de destino, e o valor que deseja transferir: ");
				contabancaria.transfere(contasBancarias.get(scanner.nextInt()), scanner.nextDouble());
				
				System.out.println("Transferência realizada com sucesso!\n");
				
			}else if (opcao == 5) {
				
				for(int i = 0; i < contasBancarias.size(); i++) {
					System.out.println(contasBancarias.get(i));
				}
				
			}else if(opcao == 6) {
				System.out.println("Escolha a conta que deseja editar");
				for(int i = 0; i < contasBancarias.size(); i++) {
					System.out.println(i + "CONTA: " + contasBancarias.get(i).nomeconta + "SALDO: " + contasBancarias.get(i).saldo);
				}
				
				ContaBancariaClass contabancaria = contasBancarias.get(scanner.nextInt());
				
			}
			
		}	
	} 
}
