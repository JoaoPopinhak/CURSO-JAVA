package LOGICA;


public class ArrayMulti {
	public static void main(String[] args){
		
		String[][] duas = {
			{"Joao Marcos", "SC", "24 anos"}, 
			{"Carlos", "PR", "23 Anos"}};
		
		//duas[0][0]                // para chamar o primeiro diamensão array [0] "joão" e a segunda chamada [1] para o estado SC
		//duas[1][0]                // para chamar a segunda diamensão array [1] "joão" e a segunda chamada [0] para o nome Carlos
		
		
		System.out.println(duas.length);     //para descobrir quantos elemementos tem o array resposta "2"
		System.out.println(duas[0].length);  //para descobrir quantos valores tem o primeiro elemento resposta "3"
		
		
		duas[0][0] = "Joao Popinhak";
		System.out.println(duas[0][0]);
		
	}
}
