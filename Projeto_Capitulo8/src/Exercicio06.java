import java.util.stream.IntStream;

/**
 * Created by suemareverton on 24/07/17.
 */
public class Exercicio06 {

    public static void main(String[] args) {

        IntStream intStream = IntStream.of(1,2,2,4,4,4,7,8,9,10);

        // O que ocorre aqui?
        // Operações intermediárias não serão executadas enquanto não for invocada uma operação terminal
        //System.out.println(intStream.distinct());

        // System.out.println("Total de elementos distintos: " + intStream.distinct().count());

        // ForEach é uma operação terminal
        intStream.distinct().forEach( i -> System.out.println(i) );
    }

}
