import java.util.Scanner;

/**
 * Created by suemareverton on 13/06/17.
 * Instruções "break" e "continue" para alteração de fluxo de execução
 * Referência: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.htmljava
 */

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Tabuada de qual número? ");
        int num = reader.nextInt();

        for(int i = 0; i <= 10; i++) {

            if(i % 2 == 1)
                continue;

            System.out.println(num + " * " + i + " = " + num * i);

            if(i > 7)
                break;
        }

        System.out.println("Fim da tabuada");
    }

}
