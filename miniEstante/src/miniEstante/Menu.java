package miniEstante;

import java.util.Scanner;

import miniEstante.Cliente.CadastroCliente;
import miniEstante.login.Login;
import miniEstante.menuAdministrador.MenuAdministrador;


public class Menu {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int opcao;

		while (true) {
			System.out.println("                                                                    ");
			System.out.println("\n********************************************************************");
			System.out.println("                                                                    ");
			System.out.println("                       📖 Mini Estante 📖                            ");
			System.out.println("                                                                    ");
			System.out.println("********************************************************************");
			System.out.println("                                                                    ");
			System.out.println("              1- Fazer Login                                        ");
			System.out.println("              2- Cadastre-se                                        ");
			System.out.println("              3- Administrador                                               ");
			System.out.println("              4- Sair                                                    ");
			System.out.println("********************************************************************");
			System.out.println("                                                                    ");
			System.out.println("Escolha uma opção:");
			opcao = ler.nextInt();


			switch (opcao) {
			case 1 -> CadastroCliente.logar();
			case 2 -> CadastroCliente.cadastrarCliente(); 
			case 3 -> MenuAdministrador.main(args);
			case 4 -> {
				System.out.println("Até mais! Obrigada por ter Visitado o nosso site. Te esperamos logo!");
				ler.close();
				System.exit(0);
			}
			default -> System.out.println("Opção inválida\n");
			}
		}

	}

}
