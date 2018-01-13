import java.util.function.BiConsumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;

/**
 * Created by suemareverton on 24/07/17.
 * Interfaces funcionais: https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
 */

public class Exercicio02 {

    public static void main(String[] args) {
        // Função que recebe 2 Inteiros e não possui retorno
        BiConsumer<Integer, Integer> somaInteiros = (a, b) -> System.out.println(a + b);
        somaInteiros.accept(2,5);

        // Função que recebe um Double e retorna uma String
        DoubleFunction<String> df = d -> String.valueOf(d * d);
        System.out.println(df.apply(3f));

        // Função que recebe 2 Inteiros e retorna uma Inteiro
        ToIntBiFunction<Integer,Integer> somaInteiros2 = (a, b) -> a + b;
        System.out.println(somaInteiros2.applyAsInt(3,10));

        // Função que recebe 2 Strings e retorna um Inteiro
        ToIntBiFunction<String, String> totalCaracteres = (a,b) -> a.length() + b.length();
        System.out.println(totalCaracteres.applyAsInt("DSA","Java"));

        // Função que recebe uma String e retorna um Inteiro
        Function<String, Integer> totalCaracteres2 = (i) -> i.length();
        System.out.println(totalCaracteres2.apply("DSA"));
    }

}
