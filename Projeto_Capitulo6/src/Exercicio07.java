import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by suemareverton on 11/07/17.
 * Sets: https://docs.oracle.com/javase/tutorial/collections/implementations/set.html
 */

public class Exercicio07 {

    public static void main(String[] args) {

        HashSet<String> cores = new HashSet<>();
        cores.add("Vermelho");
        cores.add("Verde");

        System.out.println("Inseriu amarelo? " + cores.add("amarelo"));
        System.out.println("Inseriu amarelo? " + cores.add("amarelo"));

        System.out.println(cores + " tem " + cores.size() + " elementos");

        for(String cor : cores) {
            System.out.println(cor);
        }

        System.out.println("---");

        TreeSet<String> cores2 = new TreeSet<>();
        cores2.add("Vermelho");
        cores2.add("Verde");
        cores2.add("Amarelo");
        cores2.add("Preto");
        cores2.add("Laranja");

        for(String cor : cores2) {
            System.out.println(cor);
        }

        System.out.println("---");

        // HeadSet retorna um conjunto de elementos menor
        // que o elemento especificado por parâmetro
        SortedSet<String> coresMenorQuePreto =
                cores2.headSet("Preto");

        System.out.println(coresMenorQuePreto);

        coresMenorQuePreto =
                cores2.headSet("Preto", true);

        System.out.println(coresMenorQuePreto);

        System.out.println("---");

        // TailSet retorna um conjunto de elementos maior
        // que o elemento especificado por parâmetro
        SortedSet<String> coresMaiorOuIgualAPreto =
                cores2.tailSet("Preto");

        System.out.println(coresMaiorOuIgualAPreto);

        String primeiraCor = cores2.first();
        System.out.println("Primeiro elemento: " + primeiraCor);

        String ultimaCor = cores2.last();
        System.out.println("Último elemento: " + ultimaCor);

        SortedSet<String> coresDoMeio = cores2.subSet(primeiraCor,false,ultimaCor,false);
        System.out.println("Cores do meio: " + coresDoMeio);
    }

}
