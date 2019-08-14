package Lista_OO_3;

import java.util.Scanner;

public class Dois {


    public static void main(String[] args) {

        String usuario;
        String senha;

        Scanner leia = new Scanner(System.in);
        System.out.print("Escreva um nome de usuário: ");
        usuario = leia.next().toLowerCase();
        System.out.print("Escreva uma senha: ");
        senha = leia.next().toLowerCase();

        while (usuario.equals(senha)) {

            System.out.println("Usuário e senha não podem ser iguais, tente novamente.");
            System.out.print("Escreva um nome de usuário: ");
            senha = leia.next();
            System.out.print("Escreva uma senha: ");
            senha = leia.next();
        }
    }

}
