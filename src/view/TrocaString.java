package view;
import javax.swing.JOptionPane;

import controller.ExumRecursividade;

public class TrocaString{

	public static void main(String[] args) {
		ExumRecursividade word = new ExumRecursividade();
		String string = JOptionPane.showInputDialog("Digite uma palavra");
		
		String palavra_invertida = word.troca(string, string.length());
		System.out.println(palavra_invertida);
	}
	
}
