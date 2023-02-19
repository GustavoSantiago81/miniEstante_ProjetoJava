package miniEstante.menuAdministrador;

import java.util.Scanner;

public class MenuAdministrador {

  private static String usuario = "admin";
  private static String senha = "1234";

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Bem-vindo ao menu de administrador da biblioteca!");
    System.out.println("Digite o usuário: ");
    String usuarioDigitado = scanner.next();
    System.out.println("Digite a senha: ");
    String senhaDigitada = scanner.next();

    if (usuarioDigitado.equals(usuario) && senhaDigitada.equals(senha)) {
      System.out.println("Bem-vindo ao menu de administrador da biblioteca.");
      //exibeMenu();
    } else {
      System.out.println("Credenciais incorretas. Saindo do sistema...");
    }
  }
}
  

/*private static void exibeMenu() {
	
	
}*/

 