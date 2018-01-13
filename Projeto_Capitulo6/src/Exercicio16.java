import java.util.ArrayList;
import java.util.List;

/**
 * Created by suemareverton on 12/07/17.
 */

public class Exercicio16 {

    public static void main(String[] args) {

        Livro livro = new Livro("Senhor dos Anéis",1000);

        CofreRuim cofreRuim = new CofreRuim();
        cofreRuim.guardar(livro);

        Livro livroDoCofre = (Livro) cofreRuim.obter();
        System.out.println(livro.getTitulo());

        // Observer acima que foi necessário realizar uma conversão explícita
        // pois o cofre só armazena a referência como objeto
        // O problema é saber qual a classe do objeto que está guardado no cofre

        // Podemos resolver este tipo de problema utilizando Java Generics
        // Observe por exemplo como podemos "tipar" uma lista para que ele aceite qualquer tipo
        /*List<Livro> livros = new ArrayList<>();
        livros.add(livro);
        Livro livro1 = livros.get(0);

        List<Boneca> bonecas = new ArrayList<>();
        Boneca boneca1 = bonecas.get(0);*/
    }
}
