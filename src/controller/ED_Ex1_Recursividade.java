package controller;

public class ED_Ex1_Recursividade {

	public ED_Ex1_Recursividade()  {
		super();
	}
	
	public String troca(String string, int i) {
		//Condição de parada = entrada com 0 string
		/*Entrada de um caractere, retornará a própria entrada
		*/
		
		if (i == 0) {
			return "";
		/*Entrada com mais de um caractere, virará nova string e será ordenada a partir 
		  do último caractere*/
			
		} else { 
			return string.substring(i - 1, i) + troca(string, i - 1);
		}
	}
}
