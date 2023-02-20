package miniEstante.LivrosDoMes;

import java.util.ArrayList;
import java.util.Scanner;

public class LivrosDoMes {

	static Scanner leia = new Scanner(System.in);

	public static ArrayList<String> livros = new ArrayList<String>();

	public static String visualizarLivros() {

		String[][] livros = { { "LINS, Armando", "Desvendando as Collections", "2018" },
				{ "ARAÚJO, Fernanda", "Matrizes: O que realmente são?", "2019" },
				{ "MENDES, Pedro", "Como usar o Git Bash", "2021" },
				{ "NEVES, Bruna", "Revelando a Linguagem Por Trás do Seu Aplicativo", "2020" },
				{ "LIMA, Gabriela", "Codar, Rezar, Rodar", "2019" } };

		System.out.println("Livros do mês: \n");
		for (String[] livro : livros) {
			System.out.println(livro[0] + " - " + livro[1] + " (" + livro[2] + ")\n");
		}

		// Cria um array de arrays de Strings contendo informações sobre os livros.

		// Exibe os livros da lista, um por linha

		return ("");
	}

	public static void adicionarLivros() {

		String livro;

		do {
			System.out.println("Digite 0 para voltar");
			System.out.println("Digite o nome do Livro:");
			leia.skip("\\R?");
			livro = leia.nextLine();

			if (livro.isBlank())
				System.out.println("Texto Vazio!\n");
			else if (!livro.equals("0")) {
				livros.add(livro);
				System.out.println("Livro adicionado!\n");
			}
		} while (!livro.equals("0"));

		// HomePage.homePage();
	}

}
