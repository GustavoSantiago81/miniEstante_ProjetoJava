package miniEstante.Cliente;

import java.util.Scanner;

public class AlterarDados {

	static Scanner leia = new Scanner(System.in);

	public static void alterarDados() {
		int opcao;
		int i = CadastroCliente.emails.indexOf(CadastroCliente.getEmail());

		do {

			System.out.println("1 - Email:");
			System.out.println(CadastroCliente.getEmail());
			System.out.println("2 - Nome");
			System.out.println(CadastroCliente.nomes.get(i));
			System.out.println("3 - Senha");
			System.out.println("******");
			System.out.println("4 - Telefone:");
			System.out.println(CadastroCliente.telefones.get(i));
			System.out.println("0 - Voltar");
			System.out.println("5 - Salvar");

			opcao = leia.nextInt();

			switch (opcao) {
			case 0 -> opcao = 0;
			case 1 -> {
				System.out.println("Digite o novo Email: ");
				leia.skip("\\R?");
				String email = leia.nextLine();
				CadastroCliente.emails.set(i, email);
			}
			case 2 -> {
				System.out.println("Digite o novo Nome: ");
				leia.skip("\\R?");
				String nome = leia.nextLine();
				CadastroCliente.emails.set(i, nome);
			}
			case 3 -> {
				System.out.println("Digite a nova senha: ");
				leia.skip("\\R?");
				String senha = leia.nextLine();
				CadastroCliente.emails.set(i, senha);
			}
			case 4 -> {
				System.out.println("Digite o novo Telefone: ");
				leia.skip("\\R?");
				String telefone = leia.nextLine();
				CadastroCliente.emails.set(i, telefone);
			}
			default -> System.out.println("Opção inválida");
			}

		} while (opcao != 0);
	}
}
