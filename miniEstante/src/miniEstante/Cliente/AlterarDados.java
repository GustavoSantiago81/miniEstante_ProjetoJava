package miniEstante.Cliente;

import java.util.Scanner;

import miniEstante.paginaCliente.paginaCliente;

public class AlterarDados {

	// Ler
	static Scanner leia = new Scanner(System.in);

	private static String email;
	private static String nome;
	private static String senha1;
	private static String telefone;
	private static int set = 0, contador = 3, setEmail = 0, setNome = 0, setSenha = 0, setTelefone = 0;
	private static int opcao, sair = 1;
	private static int i = CadastroCliente.emails.indexOf(CadastroCliente.getEmail());

	public static void alterarDados() {

		email = CadastroCliente.getEmail();
		nome = CadastroCliente.nomes.get(i);
		telefone = CadastroCliente.telefones.get(i);
		//set = 0;		// Garante a reinicialização do Menu Alterar Dados
		setEmail = 0; setNome = 0; setSenha = 0; setTelefone = 0;
		
		
		// Loop para o Menu de alterar Dados
		do {
			sair = 1; contador = 3; set = 0;
			//setEmail = 0; setNome = 0; setSenha = 0; setTelefone = 0; 
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
			case 0 -> {

				if (setEmail == 1 || setNome == 1 || setSenha == 1 || setTelefone == 1) {
					System.out.println("Sair sem salvar alterações?");
					System.out.println("0 - Sim | 1 - Não");
					sair = leia.nextInt();

					if (sair == 0) {
						setEmail = 0; setNome = 0; setSenha = 0; setTelefone = 0; set = 0;
						paginaCliente.homePage();
					}
				} else
					paginaCliente.homePage();
			}

			case 1 -> {
				System.out.println("Digite o novo Email: ");
				leia.skip("\\R?");
				email = leia.nextLine();
				// setEmail = 1;
			}
			case 2 -> {
				System.out.println("Digite o novo Nome: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				setNome = 1;
			}
			case 3 -> {
				System.out.println("Digite a nova senha: ");
				leia.skip("\\R?");
				senha1 = leia.nextLine();
				setSenha = 1;
				System.out.println("SetSenha: " + setSenha);
				System.out.println("Senhaaa: " + senha1);
			}
			case 4 -> {
				System.out.println("Digite o novo Telefone: ");
				leia.skip("\\R?");
				telefone = leia.nextLine();
				setTelefone = 1;
			}
			case 5 -> {

				do {

					System.out.println("Digite a senha:");
					leia.skip("\\R?");
					String testaSenha1 = leia.nextLine();

					if (testaSenha1.isBlank())
						System.out.println("Senha Vazia!\n");
					else if (testaSenha1.equals(CadastroCliente.senhas.get(i))) {
						
					
						 setEmail = 0; setNome = 0; setSenha = 0; setTelefone = 0;
						 
						System.out.println("Senhaaa: " + setSenha);
						System.out.println("Senhaaa: " + senha1);
						set = 1;
						contador = -1;		// Para sair do loop
					} else {
						System.out.println("Senha incorreta!");

						if (contador > 0) {
							System.out.println("Você tem " + contador + " tentativa(s)!");
						} else
							paginaCliente.homePage();

						contador--;
					}

				} while (contador >= 0);

			}

			default -> System.out.println("Opção inválida");
			}

			if (set == 1) {
				System.out.println("Senhaaa: " + setSenha);
				System.out.println("Senhaaa: " + senha1);
				CadastroCliente.emails.set(i, email);
				CadastroCliente.nomes.set(i, nome);
				CadastroCliente.senhas.set(i, senha1);
				System.out.println("sEnhaGet " + CadastroCliente.senhas.get(i));
				CadastroCliente.telefones.set(i, telefone);
				System.out.println("Mudança(s) salva(s)!");
				paginaCliente.homePage();
			}

		} while (sair != 0);
	}
}
