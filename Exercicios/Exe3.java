package Exercicios;
/*
 * 3. Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';

 */
import java.util.Scanner;
public class Exe3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva nome maior que 3 caracater: ");
		String nome = entrada.nextLine();
		while(nome.length() < 3) {
			System.out.print("ERRO - Escreva nome maior que 3 caracater: ");
			nome = entrada.nextLine();
		}
		
		
		System.out.print("Escreva uma idade entre 0 e 150: ");
		int idade = entrada.nextInt();
		while(idade < 0 || idade > 150) {
			System.out.print("ERRO - Escreva uma idade entre 0 e 150: ");
			idade = entrada.nextInt();
			
		}
		
		System.out.print("Escreva salrio maior que 0: ");
		float salario = entrada.nextFloat();
		while(salario < 0) {
			System.out.print("ERRO - Escreva salrio maior que 0: ");
			salario = entrada.nextFloat();
			
		}
		
		System.out.print("Escrevaseu sexo F - Femino, M - Masculino: ");
		entrada.nextLine();
		String sexo = entrada.nextLine();
		while(!("F".equalsIgnoreCase(sexo)) && !("M".equalsIgnoreCase(sexo)) ) {
			System.out.print("ERRO - Escrevaseu sexo F - Femino, M - Masculino: ");
			
			sexo = entrada.nextLine();
		}
		
		
		entrada.close();
	}
}
