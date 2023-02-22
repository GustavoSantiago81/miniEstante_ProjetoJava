package miniEstante.Cliente;

import java.util.Scanner;

import miniEstante.paginaCliente.paginaCliente;

public class AlterarDados {

	static Scanner leia = new Scanner(System.in);

	private static String email;
	private static String nome;
	private static String senha;
	private static String telefone;
	private static int set = 0, contador = 3;

	public static void alterarDados() {
		int opcao;
		int i = CadastroCliente.emails.indexOf(CadastroCliente.getEmail());

		email = CadastroCliente.getEmail();
		nome = CadastroCliente.nomes.get(i);
		telefone = CadastroCliente.telefones.get(i);

		do {

			System.out.println("1 - Email:");
			System.out.println(email);
			System.out.println("2 - Nome:");
			System.out.println(nome);
			System.out.println("3 - Senha:");
			System.out.println("******");
			System.out.println("4 - Telefone:");
			System.out.println(telefone);
			System.out.println("0 - Voltar");
			System.out.println("5 - Salvar");

			opcao = leia.nextInt();

			switch (opcao) {
			case 0 -> opcao = 0;
			case 1 -> {
				System.out.println("Digite o novo Email: ");
				leia.skip("\\R?");
				email = leia.nextLine();
			}
			case 2 -> {
				System.out.println("Digite o novo Nome: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
			}
			case 3 -> {
				System.out.println("Digite a nova senha: ");
				leia.skip("\\R?");
				senha = leia.nextLine();
			}
			case 4 -> {
				System.out.println("Digite o novo Telefone: ");
				leia.skip("\\R?");
				telefone = leia.nextLine();
			}
			case 5 -> {

				do {

					int numeroEmail = CadastroCliente.emails.indexOf(CadastroCliente.getEmail());

					System.out.println("Digite a senha:");
					leia.skip("\\R?");
					senha = leia.nextLine();

					if (senha.isBlank())
						System.out.println("Senha Vazia!\n");
					else if (senha.equals(CadastroCliente.senhas.get(numeroEmail))) {

						CadastroCliente.emails.set(i, email);
						CadastroCliente.nomes.set(i, nome);
						CadastroCliente.senhas.set(i, senha);
						CadastroCliente.telefones.set(i, telefone);

						contador = -1;

					} else {
						System.out.println("Senha incorreta!");

							if (contador > 0) {
								System.out.println("Você tem " + contador + " tentativa(s)!");
							}
						
						contador--;
					}

				} while (contador >= 0);

			}

			default -> System.out.println("Opção inválida");
			}

		} while (opcao != 0);
	}
}
