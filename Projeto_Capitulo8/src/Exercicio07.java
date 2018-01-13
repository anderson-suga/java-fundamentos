import java.util.stream.IntStream;

/**
 * Created by suemareverton on 24/07/17.
 * Streams
 */

public class Exercicio07 {

    public static void main(String[] args) {

        IntStream intStream = IntStream.of(1,2,2,4,4,4,7,8,9,10);

        /*
        intStream
                .distinct() // Operação intermediária
                .filter()   // Operação intermediária
                .map()      // Operação intermediária
                .forEach(i -> System.out.println(i));
        */

        /*intStream
                .distinct()
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .forEach(i -> System.out.println(i));*/

        // Ordem de execução
        intStream
                .distinct() // Operação intermediária
                .filter(i -> {
                    System.out.println("Filtrando " + i);
                    return i % 2 == 0;
                }) // Operação intermediária
                .map(i -> {
                    System.out.println("Mapeando " + i);
                    return i * i;
                }) // Operação intermediária
                .forEach(i -> System.out.println(i));

    }

}
