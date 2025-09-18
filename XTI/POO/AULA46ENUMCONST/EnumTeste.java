package POO.AULA46ENUMCONST;

public class EnumTeste {
	
	public static final double PI = 3.14;
	public static void andar(Medida medida, int total) {
		if(medida == Medida.M) {
			//... tal coisa
		}else{
			//... tal coisa
		}
	}

	public static void main(String[] args) {
		
		
		for(Medida m : Medida.values()) {
			System.out.println(m + " : " + m.titulo);
		}
		
		
	}
}
	
