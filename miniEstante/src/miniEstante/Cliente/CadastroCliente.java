package miniEstante.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

import miniEstante.homePage.HomePage;

public class CadastroCliente {
	public static ArrayList<String> nomes = new ArrayList<String>();
	public static ArrayList<String> telefones = new ArrayList<String>();
	public static ArrayList<String> emails = new ArrayList<String>();
	static Scanner scanner = new Scanner(System.in);

	private String nome;
	private String telefone;
	private static String email;

	public static void logar() {

		System.out.println("Login:\n");
		System.out.println("Email:");
		scanner.skip("\\R?");
		email = scanner.nextLine();

		if (CadastroCliente.emails.contains(email)) {
			HomePage.homePage();
				
		} else {
			System.out.println("\nEmail não cadastrado!");
		}

	}

	public static void cadastrarCliente() {
		System.out.println("\nCadastre-se\n");
		System.out.print("Nome Completo: ");
		String nome = scanner.nextLine();
		System.out.print("Telefone com DDD: ");
		String telefone = scanner.nextLine();
		System.out.print("Email: ");
		String email = scanner.nextLine();
		nomes.add(nome);
		telefones.add(telefone);
		emails.add(email);
		System.out.println("Cliente cadastrado com sucesso!");
	}

	public static void listarClientes() {
		if (nomes.size() == 0) {
			System.out.println("Não existem clientes cadastrados");
		} else {
			for (int i = 0; i < nomes.size(); i++) {
				System.out.println("Nome: " + nomes.get(i));
				System.out.println("Telefone: " + telefones.get(i));
				System.out.println("Email: " + emails.get(i));
				System.out.println("--------------------");
			}
		}
	}

	public static void removerCliente() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o nome do cliente que deseja remover: ");
		String nome = scanner.next();
		for (int i = 0; i < nomes.size(); i++) {
			if (nome.equals(nomes.get(i))) {
				nomes.remove(i);
				telefones.remove(i);
				emails.remove(i);
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
