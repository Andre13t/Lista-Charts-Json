package Lista_OO_3;

import java.util.Scanner;

public class Tres {

    public static void main(String[] args) {

        String nome;
        int idade;
        int salario;
        String sexo;
        String estado;

        Scanner leia = new Scanner(System.in);
        System.out.print("Nome: ");
        nome = leia.next();
        System.out.print("Idade: ");
        idade = leia.nextInt();
        System.out.print("Salário: ");
        salario = leia.nextInt();
        System.out.print("Sexo(f/m): ");
        sexo = leia.next();
        System.out.print("Estado Civil (s/c/v/d): ");
        estado = leia.next();

        while (nome.length() < 3) {
            System.out.print("Nome: ");
            nome = leia.next();
        }while (!(idade > 0 && idade < 150 )){
            System.out.print("Idade: ");
            idade = leia.nextInt();
        }while (salario <= 0){
            System.out.print("Salário: ");
            salario = leia.nextInt();
        }while (!(sexo.equals("f") || sexo.equals("m"))){
            System.out.print("Sexo(f/m): ");
            sexo = leia.next();
        }while (!(estado.equals("c") || estado.equals("s") || estado.equals("v") || estado.equals("d"))){
            System.out.print("Estado Civil (s/c/v/d): ");
            estado = leia.next();
        }
    }
}
