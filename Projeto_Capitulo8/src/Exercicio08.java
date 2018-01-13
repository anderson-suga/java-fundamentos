import java.util.stream.DoubleStream;

/**
 * Created by suemareverton on 24/07/17.
 * Streams
 */

public class Exercicio08 {

    public static void main(String[] args) {

        DoubleStream ds = DoubleStream.of(5.3,2.1,4.7,8.8,9.1,41,-2.3,8.3);
        ds.filter(d -> d >= 0 && d <= 10)
          .sorted() // Sorted é uma operação intermediária
          .limit(4) // Limit é uma operação intermediária
          .skip(1)  // Skip é uma operação intermediária
          .forEach(d -> System.out.println(d)); // ForEach é uma operação terminal
    }



}
