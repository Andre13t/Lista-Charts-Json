package Exercicios;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digiti uma nota entre 0-10");
		int nota = entrada.nextInt();
		while (nota < 0 || nota > 10) {
			System.out.println("Digiti uma nota entre 0-10 valida");
			nota = entrada.nextInt();
		}

		entrada.close();
	}

}
