import dsa.Calculadora;

/**
 * Created by suemareverton on 27/06/17.
 * Métodos estáticos
 */

public class Exercicio06 {

    public static void main(String[] args) {

        System.out.println("3 + 7 = " + Calculadora.soma(3,7));

        for(int i = 1; i <= 50; i++) {
            Calculadora c = new Calculadora();
        }

        System.out.println(Calculadora.getTotalCalculadoras());

    }

}
