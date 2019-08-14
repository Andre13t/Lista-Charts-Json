package Lista_OO_3;

import java.util.Scanner;

public class Um {


    public static void main(String[] args) {

        int nota = 11;

        while (!(nota >= 0 && nota <= 10)) {
            System.out.println("Escreva uma nota de zero à dez: ");
            Scanner leia = new Scanner(System.in);
            nota = leia.nextInt();
        }
    }
}
