import java.util.Set;
import java.util.TreeSet;

/**
 * Created by suemareverton on 11/07/17.
 * Comparações
 */

public class Exercicio08 {

    public static void main(String[] args) {

        Set<Instrutor> instrutores = new TreeSet<>();
        instrutores.add(new Instrutor(1,"Márcia",1500));
        instrutores.add(new Instrutor(2,"Vânia",3500));
        instrutores.add(new Instrutor(1,"Vera",1500));

        System.out.println(instrutores.size());

        for (Instrutor i : instrutores) {
            System.out.println(i.getNome() + " => " + i.getSalario());
        }

    }

}
