import dsa.Funcionario;

/**
 * Created by suemareverton on 27/06/17.
 * Definindo uma subclasse
 */

public class Exercicio01 {

    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        f.setNome("Suemar");
        f.setSobrenome("Everton");
        f.setCargo("Desenvolvedor");
        System.out.println(f.getNomeCompleto() + " é um " + f.getCargo());



    }

}
