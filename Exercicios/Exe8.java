package Exercicios;

import java.util.Scanner;

public class Exe8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira dois n inteiros: ");
		int i = entrada.nextInt();
		int i2 = entrada.nextInt();
		if (i > i2) {
			int aux = i;
			i = i2;
			i2 = aux;
		}
		int y = 0;
		for (int x = i; x <= i2; x++) {
			y += x;
		}
		System.out.println("Soma dos numeros no intervalo: " + y);

		entrada.close();
	}
}
