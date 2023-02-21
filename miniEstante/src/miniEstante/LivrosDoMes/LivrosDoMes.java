package miniEstante.LivrosDoMes;

import java.util.ArrayList;
import java.util.Scanner;

public class LivrosDoMes {

	static Scanner leia = new Scanner(System.in);

	public static ArrayList<String> livros = new ArrayList<String>();

	public static void visualizarLivros() {
		
		System.out.println("\"LIMA, Gabriela\", \"Codar, Rezar, Rodar\", \"2019\"");
		
		System.out.println("Cl");
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

	public static String buscarLivro() {
		String[][] livros = { { "LINS, Armando", "Desvendando as Collections", "2018" },
				{ "ARAÚJO, Fernanda", "Matrizes: O que realmente são?", "2019" },
				{ "MENDES, Pedro", "Como usar o Git Bash", "2021" },
				{ "NEVES, Bruna", "Revelando a Linguagem Por Trás do Seu Aplicativo", "2020" },
				{ "LIMA, Gabriela", "Codar, Rezar, Rodar", "2019" } };

		int tentativas = 3;
		boolean encontrou = false;
		String nomeLivro = "";
		Scanner scanner = new Scanner(System.in);

		while (tentativas > 0 && !encontrou) {
			System.out.println("Digite o nome do Livro: ");
			nomeLivro = scanner.nextLine();

			for (String[] livro : livros) {
				if (livro[1].equals(nomeLivro)) {
					encontrou = true;
					System.out.println("livro\n" + nomeLivro + "\nencontrado");
					break;
				}
			}

			if (!encontrou) {
				System.out.println("Livro não encontrado você tem " + tentativas + " tentativas restantes");
				tentativas--;
			}
		}

		if (encontrou) {
			for (String[] livro : livros) {
				if (livro[1].equals(nomeLivro)) {
					return "Livro encontrado: \n" + livro[0] + " - " + livro[1] + " (" + livro[2] + ")\n";
				}
			}
		}
		return "";
	}

}
