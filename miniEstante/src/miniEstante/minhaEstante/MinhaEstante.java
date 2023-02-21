package miniEstante.minhaEstante;

import java.util.ArrayList;
import java.util.Scanner;

import miniEstante.Cliente.CadastroCliente;
import miniEstante.LivrosDoMes.LivrosDoMes;

public class MinhaEstante {

	public static ArrayList<String> vetorCliente = new ArrayList<String>();
	public static ArrayList<String> livrosCliente = new ArrayList<String>();

	static Scanner leia = new Scanner(System.in);

	public static void minhaEstante() {
		CadastroCliente.getEmail();
//
//		livrosCliente.clone();
//		livrosCliente.add(CadastroCliente.getEmail() + "opa");
//		System.out.println(livrosCliente.clone());
//		System.out.println(livrosCliente);

		System.out.println("CadastroCliente.contaCliente");
		System.out.println(CadastroCliente.contaCliente);

		System.out.println(livrosCliente);
		System.out.println("000000000000000000000000000");
		System.out.println(livrosCliente.size());

		String matriz[][] = new String[CadastroCliente.emails.size()][livrosCliente.size()];

		
		
		
		//matriz[CadastroCliente.emails.indexOf(CadastroCliente.getEmail())][livrosCliente.size()] = leia.nextLine();

		/*if (livrosCliente.size() == 0) {
			System.out.println("Estante Vazia!");
		} else {*/
			//for (int livros = 0; livros < livrosCliente.size(); livros++) {
				System.out.println("Digite o livro a adicionar");
				leia.skip("\\R?");
				//matriz[CadastroCliente.emails.indexOf(CadastroCliente.getEmail())][livrosCliente.size()] = leia.nextLine();
				//matriz[CadastroCliente.emails.indexOf(CadastroCliente.getEmail())][livrosCliente.size()] = leia.nextLine();
				
				String teste = leia.nextLine();
				livrosCliente.add(teste);
				
				matriz[0][0] = teste;
		//	}
		
		
		//for (var livros = 0; livros < 1; livros++) {
		
			System.out.println(matriz[0][0]);
		
		//}

	}
}
