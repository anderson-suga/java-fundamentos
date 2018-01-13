import models.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by suemareverton on 24/07/17.
 * Redução
 */

public class Exercicio09 {

    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(1,"Livro 1",80,120)); // 1.5 por página
        livros.add(new Livro(2,"Livro 2",120,45)); // 0.375 por página
        livros.add(new Livro(3,"Livro 3",15,140)); // 9.33 por página
        livros.add(new Livro(4,"Livro 4",140,90)); // 0.64 por página

        // Vamos fazer uma operação de redução para retornar o livro que tem o maior preco
        Optional<Livro> ol = livros.stream() // o método .stream retorna um Stream<Livro>
                .reduce(
                    (livro1,livro2) ->
                            livro1.getPreco() / livro1.getPaginas() > livro2.getPreco() / livro2.getPaginas() ? livro1 : livro2
            );

        if(ol.isPresent())
            System.out.println(ol.get().getTitulo() + ": " + ol.get().getPreco());

        // Livro 1 X Livro 2
        // Livro 1 X Livro 3
        // Livro 3 X Livro 4
        // Resultado: Livro 3
    }

}
