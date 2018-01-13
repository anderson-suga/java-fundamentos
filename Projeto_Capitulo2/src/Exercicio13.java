import java.util.Scanner;

/**
 * Created by suemareverton on 13/06/17.
 * Estruturas de repetição com for
 */

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Tabuada de qual número? ");
        int num = reader.nextInt();

        /*
            Para o comando for, especificar:
            1) variável de controle
            2) critério de continuação
            3) incremento (ou decremento) da variável de controle
        */
        for(int i = 0; i >= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

}
