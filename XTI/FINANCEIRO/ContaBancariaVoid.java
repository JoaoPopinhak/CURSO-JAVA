package FINANCEIRO;
import java.util.ArrayList;
import java.util.Scanner;

public class ContaBancariaVoid {

	public static void main(String[] args) {
		
		ArrayList<ContaBancariaClass> contasBancarias = new ArrayList<>();
		ArrayList<CartaoCredito> CartoesDeCreditos = new ArrayList<>();
		
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
				+ "Digite 6 para editar o nome ou saldo das suas contas\n"
				+ "Digite 7 para criar um novo cartão de crédito\n"
				+ "Digite 8 para lançar uma despesa no cartão de crédito\n"
				+ "Digite 10 para SAIR\n");
		
		int opcao = scanner.nextInt();
		
		while (opcao != 10) {
			
			switch(opcao){
			
			case 1:
				ContaBancariaClass contabancaria = new ContaBancariaClass();
				
				scanner.nextLine();//Consumir o "enter engatilhado"
				
				System.out.println("Digite o nome da sua nova conta: ");
				contabancaria.nomeconta = scanner.nextLine();
				
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
				
				break;
				
			case 2:
				System.out.println("Informe qual conta bancaria deseja efetuar o deposito: \n");
				
				for (int i = 0; i < contasBancarias.size(); i++) {	
					System.out.println(i + " CONTA : " + contasBancarias.get(i).nomeconta + " SALDO: " + contasBancarias.get(i).saldo + "\n");	
				}
		
				int opcaoconta = scanner.nextInt();
				
				if(opcaoconta >= 0 && opcaoconta < contasBancarias.size()){
					contabancaria = contasBancarias.get(opcaoconta);
					
					System.out.println("Digite o valor que deseja depositar: ");
					contabancaria.deposita(scanner.nextDouble());
						
					contabancaria.exibenomeconta();
					contabancaria.exibesaldo();
				}else{
					System.out.println("Conta inválida. Tente novamente.");
				}
				break;
				
			case 3:
				System.out.println("Informe qual conta bancaria deseja efetuar o saque: ");
				
				for(int i = 0; i < contasBancarias.size(); i++) {
					System.out.println(i + " CONTA: " + contasBancarias.get(i).nomeconta + " SALDO: " + contasBancarias.get(i).saldo + "\n");
				}
				opcaoconta = scanner.nextInt();
				
				if(opcaoconta >= 0 && opcaoconta < contasBancarias.size()){
					
					contabancaria = contasBancarias.get(opcaoconta);
					
					System.out.println("Digite o valor que deseja sacar: ");
					contabancaria.saque(scanner.nextDouble());
					
					contabancaria.exibenomeconta();
					contabancaria.exibesaldo();
				}else{
					System.out.println("Conta inválida. Tente novamente.");
				}
				break;
				
			case 4:
				System.out.println("Informe qual a conta de origem para transferencia");
				
				for(int i = 0; i < contasBancarias.size(); i++) {
					System.out.println(i + " CONTA: " + contasBancarias.get(i).nomeconta + " SALDO: " + contasBancarias.get(i).saldo);
				}
				
				opcaoconta = scanner.nextInt();
				
				if(opcaoconta >= 0 && opcaoconta < contasBancarias.size()){};
				contabancaria = contasBancarias.get(opcaoconta);
				
				System.out.println("Digite a conta de destino, e o valor que deseja transferir: ");
				contabancaria.transfere(contasBancarias.get(scanner.nextInt()), scanner.nextDouble());
				
				System.out.println("Transferência realizada com sucesso!\n");
				
				break;
				
			case 5:
				for(int i = 0; i < contasBancarias.size(); i++) {
					System.out.println(contasBancarias.get(i));
				}
				
				break;
				
			case 6:
				System.out.println("Escolha a conta que deseja editar");
				for(int i = 0; i < contasBancarias.size(); i++) {
					System.out.println(i + " CONTA: " + contasBancarias.get(i).nomeconta + " SALDO: " + contasBancarias.get(i).saldo);
				}
				
				contabancaria = contasBancarias.get(scanner.nextInt());
				
				System.out.println("Digite 1 para editar o NOME da sua conta\n" + "Digite 2 para editar o SALDO da sua conta");
				
				int opcaoedit = scanner.nextInt();
				
				switch(opcaoedit){
				case 1: 
					System.out.println("Digite o novo nome da sua conta");
					contabancaria.nomeconta = scanner.next();
					
					break;
				case 2:
					System.out.println("Digite o novo saldo da sua conta");
					contabancaria.saldo = scanner.nextDouble();
					
					break;
				}
			case 7:
				CartaoCredito cartaocredito = new CartaoCredito();
				
				scanner.nextLine();
				
				System.out.println("Insira o nome do cartão de crédito");
				cartaocredito.nomecc = scanner.nextLine();
				
				System.out.println("Insira o limite do cartão de crédito");
				cartaocredito.limite = scanner.nextDouble();
				
				CartoesDeCreditos.add(cartaocredito);
				
				System.out.println("Cartão de crédito criado com sucesso.");
				
				break;
				
			case 8:
				System.out.println("Escolha o cartão de crédito para lançar a despesa");
				
				for(int i = 0; i < CartoesDeCreditos.size(); i++){
					System.out.println(i + " Cartão: " + CartoesDeCreditos.get(i).nomecc + " Limite Disponível " + CartoesDeCreditos.get(i).limitedisponivel + " Limite " + CartoesDeCreditos.get(i).limite);
				}

				cartaocredito = CartoesDeCreditos.get(scanner.nextInt());
				
				System.out.println("Digite o valor da despesa");
				cartaocredito.despesacartao(scanner.nextDouble());
				
				break;
				
			case 9:
				System.out.println("Selecione o cartão de crédito que deseja realizar o pagamento");
				for(int i = 0; i < CartoesDeCreditos.size(); i++){
					System.out.println(i + " Cartão: " + CartoesDeCreditos.get(i).nomecc + " Limite Disponível " + CartoesDeCreditos.get(i).limitedisponivel + " Limite " + CartoesDeCreditos.get(i).limite);
				}
				
				cartaocredito = CartoesDeCreditos.get(scanner.nextInt());
				
				System.out.println("Selecione a conta bancaria que deseja realizar o pagamento");
				for(int i = 0; i < contasBancarias.size(); i++){
					System.out.println(i + " CONTA: " + contasBancarias.get(i).nomeconta + " SALDO: " + contasBancarias.get(i).saldo);
				}
				
				contabancaria = contasBancarias.get(scanner.nextInt());
				
				cartaocredito.pagamentocartao(contabancaria);
				
				break;
				
			default:
				System.out.println("Tente novamente");
			}
			
			System.out.println("Clica em uma das opções informadas abaixo:\n\n"
					+ "Digite 1 para criar uma nova conta bancaria\n"
					+ "Digite 2 para depositar um valor na conta\n"
					+ "Digite 3 para sacar um valor da conta\n"
					+ "Digite 4 para transferir sua conta\n"
					+ "Digite 5 para exibir suas contas cadastradas e o saldo de cada conta\n"
					+ "Digite 6 para editar o nome ou saldo das suas contas\n"
					+ "Digite 7 para criar um novo cartão de crédito\n"
					+ "Digite 8 para lançar uma despesa no cartão de crédito\n"
					+ "Digite 10 para SAIR\n");
			
			opcao = scanner.nextInt();
			
		} //Fim while
		scanner.close();
	} 
}
