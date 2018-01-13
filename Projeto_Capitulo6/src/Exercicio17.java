import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by suemareverton on 12/07/17.
 * Java Generics: https://docs.oracle.com/javase/tutorial/java/generics/why.html
 */

public class Exercicio17 {

    public static void main(String[] args) {

        Boneca elsa = new Boneca();
        elsa.setTitulo("Elsa - Frozen");
        elsa.setCorRoupa("Azul");

        Cofre<Boneca> cofreBoneca = new Cofre<>("123");
        cofreBoneca.abrir("123");
        cofreBoneca.guardar(elsa);
        cofreBoneca.fechar();

        cofreBoneca.abrir("1234");
        Boneca bonecaGuardada = cofreBoneca.obter();
        cofreBoneca.fechar();

        System.out.println(bonecaGuardada.getTitulo() + " com roupa " + elsa.getCorRoupa());

        // Pergunta 1: Posso guardar pessoas (alunos e instrutores) no cofre?
        // Pergunta 2: Como guardar somente brinquedos no cofre (Bolas, Bonecas, etc)?
        // Pergunta 3: Como guardar brinquedos e livros no cofre considerando que livro não é um brinquedo?

        Cofre<Pessoa> cofrePessoa = new Cofre<>("123");
        Aluno a = new Aluno("Suemar",5);
        cofrePessoa.guardar(a);

        Cofre<Livro> cofreLivro = new Cofre<>("123");
        Livro l = new Livro("Livro ABC",50);
        cofreLivro.guardar(l);
    }

}
