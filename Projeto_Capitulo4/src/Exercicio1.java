import dsa.Pessoa;

/**
 * Created by suemareverton on 22/06/17.
 * Instanciação de objetos
 */

public class Exercicio1 {

    public static void main(String[] args) {

       Pessoa p =  new Pessoa();
       p.nome = "Suemar";
       p.pais = "Brasil";

       Pessoa p2;
       p2 = p;

       p2.nome = "Everton";
       System.out.println(p.nome + " mora no " + p.pais);

    }

}
