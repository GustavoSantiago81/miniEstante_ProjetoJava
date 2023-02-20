package miniEstante.menuAdministrador;

import java.util.Scanner;

import miniEstante.Menu;
import miniEstante.Cliente.CadastroCliente;
import miniEstante.LivrosDoMes.LivrosDoMes;

public class MenuAdministrador {

	private static String usuario = "admin";
	private static String senha = "1234";

	public static void menuAdministrador() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem-vindo ao menu de administrador da biblioteca!");
		// AQUI CHAMA MENU ADMIN
		System.out.println("Digite o usuário: ");
		String usuarioDigitado = scanner.next();
		System.out.println("Digite a senha: ");
		String senhaDigitada = scanner.next();

		if (usuarioDigitado.equals(usuario) && senhaDigitada.equals(senha)) {
			System.out.println("Bem-vindo ao menu de administrador da biblioteca.");
			AdministradorMenu();
		} else {
			System.out.println("Credenciais incorretas. Saindo do sistema...");
		}
	}

	public static void AdministradorMenu() {

		int opcao;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Ver lista de clientes");
			System.out.println("3 - Excluir clientes");
			System.out.println("4 - Adicionar livros");
			System.out.println("5 - Ver livros");
			System.out.println("6 - Excluir livro");
			System.out.println("7 - Sair(admin)");
			opcao = scanner.nextInt();
			scanner.skip("\\R?");

			switch (opcao) {
			case 1 -> CadastroCliente.cadastrarCliente();
			case 2 -> CadastroCliente.listarClientes();
			case 3 -> CadastroCliente.removerCliente();
			case 4 -> LivrosDoMes.adicionarLivros();
			case 5 -> System.out.println("codigo para ver livros");
			case 6 -> System.out.println("codigo para excluir livros");
			case 7 -> {
				System.out.println(" Administrador Deslogado \nObrigado por usar o sistema!");
				Menu.main(null);
			}
			}
		} while (opcao != 7);

	}

	

}
