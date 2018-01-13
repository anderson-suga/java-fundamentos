package dsa;

/**
 * Created by suemareverton on 27/06/17.
 */

public class Calculadora {

    private static int totalCalculadoras = 0;

    public Calculadora() {
        totalCalculadoras++;
    }

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static int getTotalCalculadoras() {
        return totalCalculadoras;
    }
}
