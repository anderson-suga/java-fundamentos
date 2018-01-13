import java.util.Scanner;

/**
 * Created by suemareverton on 08/06/17.
 * Estruturas de decisão
 * Referência: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
 */

public class Exercicio7 {

    public static void main(String[] args) {

        // Fazer import da classe java.util.Scanner;
        Scanner reader = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = reader.nextInt();

        if(idade < 0) {
            System.out.println("Idade inválida");
            System.out.println("Tente novamente");
        } else
            System.out.print("OK, faltam " + (100 - idade) + " para você chegar aos 100 anos!!!");
    }
}
