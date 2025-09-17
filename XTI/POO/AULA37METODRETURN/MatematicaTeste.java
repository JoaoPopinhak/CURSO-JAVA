package POO.AULA37METODRETURN;

public class MatematicaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matematica mat = new Matematica();
		
		int ma = mat.maior(10, 15);
		
		System.out.println(ma);
		
		
		int so = mat.soma(10, 20);
		System.out.println(so);
		
		int par = mat.maior(2, 4);
		int impar = mat.maior(3, 5);
		
		int sot = mat.soma(par, impar);
		
		System.out.println(sot);
	}

}
