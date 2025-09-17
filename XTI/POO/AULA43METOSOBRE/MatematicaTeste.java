package POO.AULA43METOSOBRE;

public class MatematicaTeste {

	public static void main(String[] args) {
		/**
		 * Mesmo criando vários metodos com o mesmo nome
		 * O Java identifica a qual metodo é o correto dependendo do parametro informado
		 * No exemplo 1 foi adicionado dois int
		 * No exemplo 2 foi adicionado duas String
		 * E no exemplo 3 foi adicionado somente um int
		 * porém todos os metodos estão com o mesmo nome
		 */
		
		Matematica mat = new Matematica();
		
		int resultado = mat.media(15, 20);
		
		int resultadoS = mat.media("15", "20");
		
		int resultadoU = mat.media(15);
		
		System.out.println(resultado);
		
		System.out.println(resultadoS);
		
		System.out.println(resultadoU);
	}
	

}
