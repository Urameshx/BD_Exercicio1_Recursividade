package controller;

public class ED_Ex1_Recursividade {

	public ED_Ex1_Recursividade()  {
		super();
	}
	
	public String troca(String string, int i) {
		if (i == 0) {
			return "";
		} else { 
			return string.substring(i - 1, i) + troca(string, i - 1);
		}
	}
}
