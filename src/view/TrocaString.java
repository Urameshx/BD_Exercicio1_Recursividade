package view;
import javax.swing.JOptionPane;

import controller.ED_Ex1_Recursividade;

public class TrocaString{

	public static void main(String[] args) {
		ED_Ex1_Recursividade word = new ED_Ex1_Recursividade();
		String string = JOptionPane.showInputDialog("Digite uma palavra");
		
		String palavra_invertida = word.troca(string, string.length());
		System.out.println(palavra_invertida);
	}
	
}