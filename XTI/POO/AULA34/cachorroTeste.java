package POO.AULA34;

public class cachorroTeste {

	public static void main(String[] args) {
		
		cachorroClass pitbull = new cachorroClass();
		
		pitbull.raça = "pitbull";
		pitbull.tamanho = 40;
		pitbull.latir();
		
		
		cachorroClass viraLata = new cachorroClass();
		viraLata.raça = "Vira-Lata";
		viraLata.tamanho = 30;
		viraLata.latir();
		
	}
}
