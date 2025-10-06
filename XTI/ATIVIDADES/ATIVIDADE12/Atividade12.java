package ATIVIDADES.ATIVIDADE12;

public class Atividade12 {

	public static void main(String[] args) {
		
		try {
			Aluno novoAluno = new Aluno("Nome", -1);
			System.out.println(novoAluno.idade);
		}catch(IdadeInvalidaException e1){
			System.out.println(e1.getMessage());
		}
		
	}

}
