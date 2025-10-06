package POO.AULA39MODIFACESS;

public class FuncionarioPacote {
	
	
	
	
	
	
	
	
	
	
	
	
public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		
		f.nome = "João"; //Não tem acesso pois o nome está PRIVATE acessivel somente na mesma classe
		
		f.nome1 = "João"; //Tem acesso pois essa variavel está PACKAGE acessivel para todos no mesmo pacote
		
		f.nome2 = "João"; //Tem acesso pois está publico para todos dentro da classe dentro do pacote ou externo
		
	}

}
