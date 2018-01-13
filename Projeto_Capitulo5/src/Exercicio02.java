import dsa.Funcionario;

/**
 * Created by suemareverton on 27/06/17.
 * Construtores de subclasses
 */

public class Exercicio02 {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Suemar","Everton","Desenvolvedor",500F);
        System.out.println(f.getNomeCompleto() + " é " + f.getCargo() + " e recebe " + f.getSalario());
    }

}
