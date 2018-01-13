/**
 * Created by suemareverton on 08/06/17.
 * Operadores unários
 * Referência: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
 */

public class Exercicio5 {

    public static void main(String[] args) {

        int a = 0;
        a = a + 10;
        System.out.println(a);

        a += 10;
        a -= 20;
        System.out.println(a);

        System.out.println(++a);
        System.out.println(a);

        boolean graduado = false;
        graduado = !graduado;
        System.out.println(graduado);
    }

}
