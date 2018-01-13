import models.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by suemareverton on 24/07/17.
 * Predicados
 */
public class Exercicio10 {

    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(1,"Livro 1",80,120));
        livros.add(new Livro(2,"Livro 2",120,145));
        livros.add(new Livro(3,"Livro 3",15,140));
        livros.add(new Livro(4,"Livro 4",140,90));

        Predicate<Livro> pMaisDe100paginas = livro -> livro.getPaginas() > 100;
        Predicate<Livro> pPrecoMaiorQue100Reais = livro -> livro.getPreco() > 100;

        // E
        Predicate<Livro> pMaisDe100PaginasEPrecoMaiorQue100Reais =
                pMaisDe100paginas.and(pPrecoMaiorQue100Reais);

        // OU
        Predicate<Livro> pMaisDe100PaginasOuPrecoMaiorQue100Reais =
                pMaisDe100paginas.or(pPrecoMaiorQue100Reais);

        // NEGAÇÃO
        Predicate<Livro> p100PaginasOuMenos = pMaisDe100paginas.negate();

        System.out.println("Livros com mais de 100 páginas E preço maior que 100 reais");
        livros.stream()
                .filter(pMaisDe100PaginasEPrecoMaiorQue100Reais)
                .forEach(l -> System.out.println(l));

        System.out.println("---");

        System.out.println("Livros com mais de 100 páginas OU preço maior que 100 reais");
        livros.stream()
                .filter(pMaisDe100PaginasOuPrecoMaiorQue100Reais)
                .forEach(l -> System.out.println(l));

        System.out.println("---");

        livros.stream()
                .filter(p100PaginasOuMenos)
                .forEach(l -> System.out.println(l));
    }

}
