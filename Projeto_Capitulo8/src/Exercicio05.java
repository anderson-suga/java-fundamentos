import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Created by suemareverton on 24/07/17.
 * Operações terminais
 * Referência: https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html
 */
public class Exercicio05 {

    public static void main(String[] args) {

        // Criando uma Stream de inteiros
        IntStream intStream = IntStream.of();
        System.out.println("Total de elementos: " + intStream.count());

        // CUIDADO: Uma Stream não pode ser reutilizada
        System.out.println("Média: " + intStream.average().getAsDouble());

        // System.out.println("Máximo: " + intStream.max().getAsInt());

        /*OptionalInt oi = intStream.min();
        if(!oi.isPresent())
            System.out.println("Não há número mínimo");
        else
            System.out.println("Mínimo: " + oi.getAsInt());*/
    }

}
