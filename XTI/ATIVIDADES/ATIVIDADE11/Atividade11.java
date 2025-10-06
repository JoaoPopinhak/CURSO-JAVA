package ATIVIDADES.ATIVIDADE11;

public class Atividade11 {

	public static void main(String[] args) 
	
	{
		try {
			Livro produto = new Livro("livro", 10);
			System.out.println(produto.nome);
			System.out.println(produto.valor);
			Eletronicos eletronicos = new Eletronicos("Fone", -1);
			System.out.println(eletronicos.nome);
			System.out.println(eletronicos.valor);
		}catch(PrecoInvalidoException e1){
			System.out.println(e1.getMessage());
		}
		

	}

}
