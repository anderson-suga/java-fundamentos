import java.util.*;

/**
 * Created by suemareverton on 24/07/17.
 */
public class Exercicio04 {

    public static void main(String[] args) {
        List<String> nomes =
                new ArrayList<>(Arrays.asList("Max","Roberto","Fábio","Miriam","Gislaine"));

        // Método 1
        Collections.sort(nomes, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println(nomes);
        System.out.println("---");
        Collections.shuffle(nomes);

        // Método 2
        Collections.sort(nomes, (o1, o2) -> o1.length() - o2.length());
        System.out.println(nomes);

    }
}
