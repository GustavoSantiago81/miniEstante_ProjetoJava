package miniEstante.paginaCliente;

import java.util.Scanner;

import miniEstante.Menu;

import miniEstante.Cliente.CadastroCliente;
import miniEstante.LivrosDoMes.LivrosDoMes;
import miniEstante.devolucaoLivro.devolucaoLivro;

public class paginaCliente {
	
	static Scanner leia = new Scanner(System.in);

	public static void homePage() {

		int opcao;
		
		
		while (true) {
			System.out.println("\n********************************************************************");
			System.out.println("                                                                    ");
			System.out.println("                      Bem-vinde, " + 
					CadastroCliente.nomes.get(CadastroCliente.emails.indexOf(CadastroCliente.getEmail())));
			System.out.println("                                                                    ");
			System.out.println("********************************************************************");
			
			System.out.println("1 - Minha Estante");
			System.out.println("2 - Buscar Livros");
			System.out.println("3 - Devolução");
			System.out.println("4 - Alterar dados");
			System.out.println("5 - Logout");
			
			opcao = leia.nextInt();
			
			switch (opcao) {
			case 1 -> System.out.println("1");
			case 2 -> LivrosDoMes.livrosDoMes();

			case 3 -> devolucaoLivro.devolver();
			case 4 -> System.out.println("3");
			case 5 -> Menu.main(null);

			default -> System.out.println("Opção inválida\n");
			}
		}
	}
}
