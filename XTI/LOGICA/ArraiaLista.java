package LOGICA;





import java.util.ArrayList;
public class ArraiaLista {
	public static void main(String[] args){
		
		ArrayList<String> cores = new ArrayList<String>();   
		/*essa classe ArrayList é utilizada para criar um Array que possbilite a inclusão de valores no array.   
		ArrayList(chamada classe)<String(tipo do arrey)nome = new ArrayList<String>();		
		*/
		
		cores.add("Branco");       //metodo utilizado para colocar(inserir) valor dentro do ArrayList. cores[0] = "branco"; na forma tradicional seria dessa forma que chamaria o valor
		cores.add("Vermelho");
		cores.add(0, "Amarelo");
		
		System.out.println(cores.toString());           //Apresenta o nome de todos os valores
		System.out.println("tamanho"cores.size());      //Apresenta a quantidade parecido com o length
		System.out.println("posicao 2"cores.get(2));    //Apresenta o valor que inserir no parametro ()
		System.out.printl(cores.IndexOf("Branco"));     //Qual a posicao do valor "branco"
		
		
		cores.remove("Branco");     //para remover o valor branco da lista do array
		cores.contains("Amarelo");  //Consulta de tem o valor amarelo dentro da lista array. O retorno é True or False
		
	}
}