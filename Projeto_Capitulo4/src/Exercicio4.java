import dsa.Pessoa;

/**
 * Created by suemareverton on 22/06/17.
 * Getters e setters
 */

public class Exercicio4 {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "ais ghais hgashgihas ghaosihgoiashgha shgash gha sghasighaishgashgiashgsao";
        p.setIdade(85);


        System.out.println(String.format("%s possui %d anos", p.nome, p.getIdade()));
    }

}
