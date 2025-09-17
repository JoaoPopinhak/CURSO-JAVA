package br.com.xti.logica;



import javax.swing.JOptionPane;
public class EntradaGrafica {
	public static void main (String[] args) {
		String nome = JOptionPane.showInputDialog("Qual seu nome?");   
		JOptionPane.showMessageDialog(null, "Boa tarde"     +   nome);
		//JOptionPane é uma classe - showInputDialog é um metodo da classe
	}
}