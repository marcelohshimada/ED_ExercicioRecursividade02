package view;

// Biblioteca do Scanner para leitura de dados
import java.util.Scanner;

import controller.InversaoController;

public class Principal {

	public static void main(String[] args) {

		// Método construtor
		InversaoController inversao = new InversaoController();
		
		// Declaração das Strings
		String palavra, saida;

		// Entrada de dados
		Scanner entrada = new Scanner(System.in);

		// Mensagem no console solicitando dados
		System.out.println("Digite uma palavra");
		
		// Imput do dado e armazena na String palavra -> Nextline para separar o imput do texto
		palavra = entrada.nextLine();

		// Fecha Scanner
		entrada.close();
		
		// String saida receberá os caracteres empilhados recursivamente
		saida = inversao.inversao(palavra);

		// Resultado final 
		System.out.println("A palavra digitada foi: " + palavra);
		System.out.println("A inversão da palavra digitada é: " + saida);

	}
}
