package POO.AULA39;

public class Funcionario {
/*
PRIVATE : acessivel somente na própria classe
PACKAGE <nenhum> : acessivel no mesmo pacote
PROTECTED : acessivel somente a subclasses (filhos da classe)
PUBLIC : acessivel em qualquer lugar
*/
	
	private String nome;
	String nome1;
	public String nome2;
	
	public String getNome(){ //segue o mesmo processo de modifcador de acesso
		return nome;
	}


	
	
	
	
	
	
public static void main(String[] args) {
	
	Funcionario funci = new Funcionario();
	
	funci.nome = "João"; // Está acessivel pois está na mesma classe
	funci.nome1 = "João"; //Tem acesso pois essa variavel está PACKAGE acessivel para todos no mesmo pacote
	funci.nome2 = "João"; // Tem acesso pois está publico para todos dentro da classe dentro do pacote ou externo
	
	
    }	
}