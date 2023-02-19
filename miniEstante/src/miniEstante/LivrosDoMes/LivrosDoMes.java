package miniEstante.LivrosDoMes;

import java.util.ArrayList;
import java.util.Scanner;

import miniEstante.paginaCliente.paginaCliente;

public class LivrosDoMes {

	public static void livrosDoMes() {

		System.out.println("lista de livros");

	}

	static Scanner leia = new Scanner(System.in);

	public static ArrayList<String> livros = new ArrayList<String>();

	public static String visualizarLivros() {
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

		//HomePage.homePage();
	}

}
