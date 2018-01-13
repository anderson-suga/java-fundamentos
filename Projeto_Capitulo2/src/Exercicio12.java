import java.util.Scanner;

/**
 * Created by suemareverton on 13/06/17.
 * Estruturas de repetição com do... while
 */


public class Exercicio12 {

    public static void main(String[] args) {

        int idade;

        /*
            Sempre executa o bloco de repetição ao menos 1 vez pois o teste está no FINAL

            No caso da estrutura de repetição WHILE o teste está no início, portanto
            o bloco de repetição pode não ser executado dependendo da condição
        */

        do {
            Scanner reader = new Scanner(System.in);
            System.out.println("Qual a sua idade?");
            idade = reader.nextInt();
        }
        while(idade < 0);

        System.out.println("Faltam " + (100 - idade) + " para você chegar aos 100 anos!");
    }

}
