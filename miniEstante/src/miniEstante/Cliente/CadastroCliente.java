package miniEstante.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

import miniEstante.paginaCliente.paginaCliente;

public class CadastroCliente {
	public static ArrayList<String> nomes = new ArrayList<String>();
	public static ArrayList<String> telefones = new ArrayList<String>();
	public static ArrayList<String> emails = new ArrayList<String>();
	public static ArrayList<String> senhas = new ArrayList<String>();

	static Scanner scanner = new Scanner(System.in);

	private String nome;
	private String telefone;
	private static String email;
	private static String senha;

	public static void logar() {

		clientesPadroes();

		System.out.println("Login:\n");
		System.out.println("Email:");
		scanner.skip("\\R?");
		email = scanner.nextLine();

		if (email.isBlank())
			System.out.println("Texto Vazio!\n");
		else {

			if (CadastroCliente.emails.contains(email)) {

				int contador = 3;

				do {

					int i = CadastroCliente.emails.indexOf(email);

					System.out.println("Digite a senha:");
					scanner.skip("\\R?");
					senha = scanner.nextLine();

					if (senha.isBlank())
						System.out.println("Senha Vazia!\n");
					else {

						if (senha.equals(CadastroCliente.senhas.get(i))) {
							paginaCliente.homePage();
						} else {
							System.out.println("Senha incorreta!");

							if (contador > 0)
								System.out.println("Você tem " + contador + " tentativa(s)!");
							contador--;
						}
					}

				} while (contador >= 0);

			} else
				System.out.println("\nEmail não cadastrado!");

		}

	}

	public static void cadastrarCliente() {

		clientesPadroes();

		System.out.println("\nCadastre-se\n");

		System.out.print("Nome Completo: ");
		scanner.skip("\\R?");
		String nome = scanner.nextLine();

		System.out.print("Telefone com DDD: ");
		scanner.skip("\\R?");
		String telefone = scanner.nextLine();

		System.out.print("Email: ");
		scanner.skip("\\R?");
		String email = scanner.nextLine();

		System.out.print("Senha: ");
		scanner.skip("\\R?");
		String senha = scanner.nextLine();

		nomes.add(nome);
		telefones.add(telefone);
		emails.add(email);
		senhas.add(senha);
		System.out.println("Cliente cadastrado com sucesso!");
	}

	public static void clientesPadroes() {

		if (nomes.size() == 0) {
			nomes.add("laise france");
			telefones.add("(11) 0000-0000");
			emails.add("laise94@hotmail.com");
			senhas.add("senha123");

			nomes.add("Gustavo Santiago");
			telefones.add("(11) 1111-1111");
			emails.add("gustavo@email.com");
			senhas.add("senha123");

			nomes.add("Rebeca Damas");
			telefones.add("(11) 1111-1111");
			emails.add("rebeca@email.com");
			senhas.add("senha123");

			nomes.add("Gabriel Farias");
			telefones.add("(11) 1111-1111");
			emails.add("gabrielfarias@email.com");
			senhas.add("senha123");

			nomes.add("Thayane");
			telefones.add("(11) 1111-1111");
			emails.add("thayane@email.com");
			senhas.add("senha123");

			nomes.add("Danilo");
			telefones.add("(11) 1111-1111");
			emails.add("danilo@email.com");
			senhas.add("senha123");

			nomes.add("Lucas Marinho");
			telefones.add("(11) 1111-1111");
			emails.add("lucasmarinho@email.com");
			senhas.add("senha123");
		}
	}

	public static void listarClientes() {

		clientesPadroes();

		for (int i = 0; i < nomes.size(); i++) {
			System.out.println("Nome: " + nomes.get(i));
			System.out.println("Telefone: " + telefones.get(i));
			System.out.println("Email: " + emails.get(i));
			System.out.println("--------------------");
		}
	}

	public static void removerCliente() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome do cliente que deseja remover: ");
		scanner.skip("\\R?");

		String nome = scanner.nextLine();

		for (int i = 0; i < nomes.size(); i++) {
			if (nome.equals(nomes.get(i))) {
				nomes.remove(i);
				telefones.remove(i);
				emails.remove(i);
				senhas.remove(i);
				System.out.println("Cliente removido com sucesso!");
				return;
			}
		}

		System.out.println("Cliente não encontrado!");
	}

	public static String getEmail() {
		return email;
	}
}
