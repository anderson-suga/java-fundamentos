import java.util.*;

/**
 * Created by suemareverton on 11/07/17.
 * Ordenações
 */

public class Exercicio09 {

    public static void main(String[] args) {
        List<Instrutor> instrutores = new ArrayList<>();
        instrutores.add(new Instrutor(3,"Márcia",1500));
        instrutores.add(new Instrutor(2,"Vânia",3500));
        instrutores.add(new Instrutor(1,"Aline",1250));

        // Ordenação padrão será pela matrícula, pois utiliza o compareTo da classe Instrutor
        Collections.sort(instrutores);

        for (Instrutor i : instrutores) {
            System.out.println(i.getNome() + " => " + i.getSalario());
        }

        System.out.println("---");

        // Ordenação padrão será pela matrícula, pois utiliza o compareTo da classe Instrutor
        Collections.sort(instrutores, new Comparator<Instrutor>() {
            @Override
            public int compare(Instrutor o1, Instrutor o2) {

                return o1.getNome().compareTo(o2.getNome());
            }
        });

        for (Instrutor i : instrutores) {
            System.out.println(i.getNome() + " => " + i.getSalario());
        }
    }

}
