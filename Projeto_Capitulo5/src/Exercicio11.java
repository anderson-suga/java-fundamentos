import dsa.Aluno;
import dsa.Motorista;
import dsa.Pessoa;

/**
 * Created by suemareverton on 28/06/17.
 * Comparação entre Objetos
 */

public class Exercicio11 {

    public static void main(String[] args) {

        // Na classe Aluno, alteramos o comportamento de comparação
        // sobreescrevendo o método "equals"

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Suemar");
        aluno1.setNumeroMatricula(1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Suemar");
        aluno2.setNumeroMatricula(1);

        if(aluno1.equals(aluno2))
            System.out.println("É o mesmo aluno");
        else
            System.out.println("Não é o mesmo aluno");
    }

}
