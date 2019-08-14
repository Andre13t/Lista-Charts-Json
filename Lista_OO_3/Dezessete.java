package Lista_OO_3;

import java.util.Scanner;

public class Dezessete {


    public static void main(String[] args){

        System.out.print("Digite teu numero pia: ");
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();

        boolean a = false;

        for (int i = n - 1; i > 1; i--){
            if (n % i > 0){
                a = true;
            }else{
                a = false;
                break;
            }
        }

        System.out.println(a);


    }

}