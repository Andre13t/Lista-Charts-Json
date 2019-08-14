package Exercicios;

import java.util.Scanner;

public class Exer12 {
	public static void main(String[] args) {
		System.out.println("Insira a qauntidade de termos da sequencia fibonachi");
		Scanner entrada = new Scanner(System.in);
		int i = entrada.nextInt();
		int y = 0;
		for (int x = 1; x <= i; x += y) {
			y = x - y;
			System.out.print(x + ", ");
		}
		entrada.close();
	}
}
