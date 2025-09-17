package LOGICA;



public class AulaWrapper {
	public static void main (String[] args) {
		
		
	 Integer idade = new Integer(23);  //new Para criar um novo objeto
	
	 Double preco = new Double ("100.00"); 
     double var1 = preco.doubleValue();
	 int    var2 = preco.intValue();
	 byte   var3 = preco.byteValue();
	 //metodos para conversão valor de um wrapper para outro tipo
     
	 
	 Char sexo = 'M';
     Boolean casado = new Boolean("YES"); 
	 
	 //outros metodos para executar uma operação de conversão sem precisar criar uma classe
	 
	 //CONVERSÃO ESTÁTICA
	 double var1 = Double.parseDouble("100.00"); 
	 int    var2 = Integer.parseInt("100%");
	 float  var3 = Float.parseFloat("3.14F")
	 
	 int    var4 = Integer.valueOf("101011",  2);
	 // ao printar vai converter o valor binario para valor inteiro
	  
	 //para cada tipo de variavel primitivo ex "int double char boolean byte float" existe o espelho chamada wrapper primitivo
	 //	para o tipo "int"(variavel primitivo) existe o "Integer"
	 //  para o tipo "byte"(variavel primitivo) existe o "Byte"
	 //  para o tipo "char"(variavel primitivo) existe o "Character"
	 //  Com a execesão da variavel Int e Char todas os outros Wrapper tem o mesmo nome que as variaveis primitivas muda apenas a primeira letra para ser uma classe precisa começar com a letra maiuscula 
	 
    }
}