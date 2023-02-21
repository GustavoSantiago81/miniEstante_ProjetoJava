package miniEstante.minhaEstante;

import java.util.LinkedList;

public class MinhaEstante {

	LinkedList<String> livros = new LinkedList<String>();

	public static String meusLivros() {
		String[][] livros = { { "AMARAL,Carla do", "Como Utilizar Simbolos no Seu Código", "2018" },
				{ "FILHO, João", "Desmistificando Python", "2021" }, { "SANTOS, Gilberto", "Java de A a Z", "2019" },
				{ "LIMA, Gabriela", "Como se Destacar no Mercado de Trabalho Tech", "2020" },
				{ "JUNIOR, Breno", "POO na Prática", "2018" },
				{ "NETO, Gabriel", "Vai um Café com esse Código?", "2021" } };

		for (int indiceI = 0; indiceI < livros.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < livros.length; indiceJ++) {
				System.out.println(livros[indiceI][indiceJ] + " ");
			}
		}

		return "";
	}

}
