package controller;

public class InversaoController {

	public InversaoController() {
		super();
	}

	public String inversao(String palavra) {
		
		// Condi��o de parada
		// Compara o tamanho da palavra
		// Continuar� no la�o at� que a palavra digitada tenha tamanho igual a 1 caractere
		if (palavra.length() == 1) {
			return palavra;
		} else {
			// Se a condi��o n�o for atendida (String com mais de 1 caractere)
			// Empilha o caractere correspondente ao indice 0 da palavra
			// Concatena os caracteres formando a nova String na ordem que est�o empilhados
			return inversao(palavra.substring(1)) + palavra.charAt(0);
		}
	}

}
