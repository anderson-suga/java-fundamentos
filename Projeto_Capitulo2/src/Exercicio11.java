import java.util.Scanner;

/**
 * Created by suemareverton on 13/06/17.
 * Estruturas de repetição com while
 * Referência: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
 */

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Tabuada de qual número? ");
        int num = reader.nextInt();

       /* System.out.println(num + " * 1 = " + num * 1);
        System.out.println(num + " * 2 = " + num * 2);
        System.out.println(num + " * 3 = " + num * 3);
        System.out.println(num + " * 4 = " + num * 4);
        System.out.println(num + " * 5 = " + num * 5); */

        int i = 1;
        while(i <= 10) {
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        }


    }
}
