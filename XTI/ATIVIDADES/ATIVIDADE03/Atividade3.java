package ATIVIDADES.ATIVIDADE03;

public class Atividade3 {

	public static void main(String[] args) {
		
		Gerente gerenteNovo = new Gerente("Osvaldo", 2000, 300);
		System.out.println(gerenteNovo.CalcularSalario());
		
		Vendedor vendedorNovo = new Vendedor("Outro", 1100, 150);
		System.out.println(vendedorNovo.CalcularSalario()); 
	}

}
