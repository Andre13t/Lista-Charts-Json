package Exercicios;

import java.util.Scanner;

public class Exe2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("escreva um usuario e uma senha diferentes entre si");
		String Usuario = entrada.nextLine();
		String Senha = entrada.nextLine();

		while (Usuario.equalsIgnoreCase(Senha)) {
			System.out.println("ERRO - escreva um usuario e uma senha diferentes entre si");
			Usuario = entrada.nextLine();
			Senha = entrada.nextLine();
		}

		entrada.close();
	}

}
