import models.Livro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suemareverton on 24/07/17.
 * Mapeamentos
 */
public class Exercicio11 {

    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<Livro>();
        livros.add(new Livro(0,"L1",756,200));
        livros.add(new Livro(1,"Livro 1",80,120));
        livros.add(new Livro(2,"Livro 2",120,145));
        livros.add(new Livro(3,"Livro 3",15,140));
        livros.add(new Livro(4,"Livro 4",140,90));
        livros.add(new Livro(5,"Livro de Teste",1000,300));

        // Podemos mapear elementos de uma coleção para outros tipos
        // Por exemplo, dado uma coleção de livros, retornar somente os títulos

        livros.stream()
                .map(l -> l.getTitulo()) // Mapeando para uma stream de Strings
                .filter(s -> s.startsWith("Livro")) // Observe que agora a expressão lambda recebe uma String
                .map(s -> s.length())    // Mapeando para uma stream de Inteiros
                .filter(i -> i.intValue() > 7) // Observe que agora a expressão lambda recebe um inteiro
                .forEach(s -> System.out.println(s));
    }

}
