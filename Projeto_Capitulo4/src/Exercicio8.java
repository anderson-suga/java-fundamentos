import dsa.Pessoa;

/**
 * Created by suemareverton on 22/06/17.
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Pessoa p = new Pessoa(null, null);
        p.nome = "Suemar";
        p.sobrenome = "Everton";

        System.out.println(p.getNomeCompleto());
    }

}
