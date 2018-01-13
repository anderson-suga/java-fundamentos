/**
 * Created by suemareverton on 05/06/17.
 * Precedência de operadores aritméticos
 * Referência: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
 */

public class Exercicio4 {

    // Precedência de operadores

    public static void main(String[] args) {
        System.out.println(1 + 2 * 3);
        System.out.println((1 + 2) * 3);

        // Ordem de precedência
        // Multiplicação e divisão
        // Resto
        // Adição e subtração
        // Atribuição

        System.out.println(3 + 5 - 2);

        System.out.println(3 - 3 + 1 * 10); // = 3 - 3 + 10
                                            // = 0 + 10
                                            // = 10
    }

}
