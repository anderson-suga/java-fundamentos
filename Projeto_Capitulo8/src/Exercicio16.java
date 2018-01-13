import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by suemareverton on 24/07/17.
 * Paralelismo
 * Referência: https://docs.oracle.com/javase/tutorial/collections/streams/parallelism.html
 */

public class Exercicio16 {

    public static void main(String[] args) {

        Random rdn = new Random(42);

        // Gerando um array com 200 milhões de números inteiros
        int[] numeros =
                rdn.ints(200000000,1,5000)
                        .toArray();

        // Obtendo uma stream a partir de um array
        IntStream stream1 = Arrays.stream(numeros);

        long ti = System.currentTimeMillis();
        long totalElementos = stream1.parallel().filter(n -> n <= 1000).count();
        long tf = System.currentTimeMillis();
        System.out.println("Tempo total: " + (tf - ti));
        System.out.println("Total de elementos: " + totalElementos);

        // Para obter uma stream sequencial a partir de uma lista
        // lista.stream();

        // Para obter uma stream paralela a partir de uma lista
        // lista.parallelStream();

        // Para transformar uma stream sequencial para paralela:
        // streamSequencial.parallel();

        // Para transformar uma stream paralela para sequencial
        // streamParalela.sequential();
    }

}
