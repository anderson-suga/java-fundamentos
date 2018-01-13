import dsa.Pessoa;

/**
 * Created by suemareverton on 22/06/17.
 * NullPointerException
 */
public class Exercicio2 {

    public static void main(String[] args) {

        Pessoa pessoa = null;
        pessoa = new Pessoa();
        pessoa.nome = "João";
        if(pessoa != null)
            System.out.println(pessoa.nome);

        pessoa = new Pessoa();
        System.out.println(pessoa.nome.length());
    }

}
