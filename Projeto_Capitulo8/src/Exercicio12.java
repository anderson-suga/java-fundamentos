import models.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by suemareverton on 24/07/17.
 * Coletando resultados
 * Referência: http://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
 */
public class Exercicio12 {

    public static void main(String[] args) {
        // Até agora utilizamos forEach como operação terminal
        // Mas, e para retornarmos uma lista?

        List<Livro> livros = new ArrayList<Livro>();
        livros.add(new Livro(0,"L1",756,200));
        livros.add(new Livro(1,"Livro 1",80,120));
        livros.add(new Livro(2,"Livro 2",120,145));
        livros.add(new Livro(3,"Livro 3",15,140));
        livros.add(new Livro(4,"Livro 4",140,90));
        livros.add(new Livro(5,"Senhor dos Anéis",1000,300));

        // Obtendo uma lista de livros com preço superior a 100 reais
        List<Livro> livrosPrecoMaiorQue100 =
                livros.stream()
                    .filter(l -> l.getPreco() > 100)
                    .collect(Collectors.toList()); // operação terminal que retorna em formato List<Livro>

        System.out.println(livrosPrecoMaiorQue100);

        System.out.println("--");

        // Obtendo String com Títulos de livros com preços maiores que 100 reais, separados por vírgula
        String titulosLivros = livrosPrecoMaiorQue100.stream()
                .map(l -> l.getTitulo())
                .collect(Collectors.joining(", "));

        System.out.println(titulosLivros);

        System.out.println("---");

        int totalPaginas1 = livros.stream()
                .collect(Collectors.summingInt(l -> l.getPaginas()));

        int totalPaginas2 = livros.stream()
                .collect(Collectors.summingInt(Livro::getPaginas)); // Estamos utilizando referências de métodos

        System.out.println("Total de páginas de todos os livros: " + totalPaginas1 + " = " + totalPaginas2);

    }

}