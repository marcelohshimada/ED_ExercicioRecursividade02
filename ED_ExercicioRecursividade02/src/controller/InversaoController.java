package controller;

public class InversaoController {

	public InversaoController() {
		super();
	}

	public String inversao(String palavra) {
		
		// Condição de parada
		// Compara o tamanho da palavra
		// Continuará no laço até que a palavra digitada tenha tamanho igual a 1 caractere
		if (palavra.length() == 1) {
			return palavra;
		} else {
			// Se a condição não for atendida (String com mais de 1 caractere)
			// Empilha o caractere correspondente ao indice 0 da palavra
			// Concatena os caracteres formando a nova String na ordem que estão empilhados
			return inversao(palavra.substring(1)) + palavra.charAt(0);
		}
	}

}
