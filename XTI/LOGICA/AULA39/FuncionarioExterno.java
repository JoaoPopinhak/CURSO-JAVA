package LOGICA.AULA39;
import POO.AULA39.Funcionario;

public class FuncionarioExterno {
	
	

	
	
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		
		f.nome = "João"; //Não tem acesso pois o nome está PRIVATE acessivel somente na mesma classe
		
		f.nome1 = "João"; // Não tem acesso pois esta variavel está como PACKAGE acessivel somente para membros do mesmo pacote
		
		f.nome2 = "João"; //Tem acesso pois está publico para todos dentro da classe dentro do pacote ou externo
		

	}
}
