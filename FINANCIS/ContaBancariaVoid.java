import java.util.ArrayList;
import java.util.Scanner;

public class ContaBancariaVoid {

	public static void main(String[] args) {
		
		ArrayList<ContaBancariaClass> contasBancarias = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);		
		//TODO: Edição de contas
		//Validação para cotas repetidas
		//Validacao de transferencia, deposito e saque
		
		
		System.out.println("Clica em uma das opções informadas abaixo:\n\n"
				+ "Digite 1 para criar uma nova conta bancaria\n"
				+ "Digite 2 para depositar um valor na conta\n"
				+ "Digite 3 para sacar um valor da conta\n"
				+ "Digite 4 para transferir sua conta\n"
				+ "Digite 5 para exibir suas contas cadastradas e o saldo de cada conta\n"
				+ "Digite 6 para editar o nome das suas contas\n"
				+ "Digite 10 para SAIR\n");
		
		int opcao = scanner.nextInt();
		
		while (opcao != 10) {
			
			
			if (opcao == 1) {
			
				ContaBancariaClass contabancaria = new ContaBancariaClass();
					
					System.out.println("Digite o nome da sua nova conta: ");
					contabancaria.nomeconta = scanner.next();
					
					System.out.println("Digite o saldo inical da sua conta: ");
					contabancaria.saldo = scanner.nextDouble();
					
					boolean nomeJaExiste = false;
					
					for (int i = 0; i < contasBancarias.size(); i++) {
						if(contabancaria.nomeconta.equalsIgnoreCase(contasBancarias.get(i).nomeconta)){
							nomeJaExiste = true;
							break;
						}
					}
					if(nomeJaExiste) {
						System.out.println("Esse nome já existe. Tente novamente com outro nome.");
					} else {
						System.out.println("Parabéns! Sua nova conta foi adicionada.\n" + contabancaria);
						contasBancarias.add(contabancaria);
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
					System.out.println(i + " CONTA: " + contasBancarias.get(i).nomeconta + " SALDO: " + contasBancarias.get(i).saldo);
				}
				
				
				ContaBancariaClass contabancaria = contasBancarias.get(scanner.nextInt());
				System.out.println("Digite o novo nome da sua conta");
				contabancaria.nomeconta = scanner.next();
				
			}
			
			System.out.println("Clica em uma das opções informadas abaixo:\n\n"
					+ "Digite 1 para criar uma nova conta bancaria\n"
					+ "Digite 2 para depositar um valor na conta\n"
					+ "Digite 3 para sacar um valor da conta\n"
					+ "Digite 4 para transferir sua conta\n"
					+ "Digite 5 para exibir suas contas cadastradas e o saldo de cada conta\n"
					+ "Digite 6 para editar o nome das suas contas\n"
					+ "Digite 10 para SAIR\n");
			
			opcao = scanner.nextInt();
			
		} //Fim while
		scanner.close();
	} 
}
