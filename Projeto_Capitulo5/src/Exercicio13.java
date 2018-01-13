import dsa.Aluno;
import dsa.Pessoa;

/**
 * Created by suemareverton on 29/06/17.
 * Classes abstratas
 */

public class Exercicio13 {

    public static void main(String[] args) {

       /* Pessoa p = new Pessoa();
        p.setNome("Suemar");
        p.setSobrenome("Everton");
        System.out.println("Nome completo da pessoa: " + p.getNomeCompleto());*/

        Aluno a = new Aluno();
        a.setNome("João");
        a.setSobrenome("Silva");
        a.setNumeroMatricula(1);
        System.out.println("Nome completo do aluno: " + a.getNomeCompleto());
    }

}
