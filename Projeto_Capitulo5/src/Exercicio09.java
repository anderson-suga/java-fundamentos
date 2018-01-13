import dsa.*;
import dsa.interfaces.Palestrante;

import java.util.Date;

/**
 * Created by suemareverton on 28/06/17.
 * Polimorfismo
 */

public class Exercicio09 {

    public static void main(String[] args) {

        Consultor c = new Consultor();
        c.setNome("Tiago");
        Palestra2 palestraML = new Palestra2("Machine Learning", new Date(), "São Paulo", c);
        System.out.println("O consultor " + c.getNome() + " receberá bônus de " + c.getBonusPalestras());

        Executivo e = new Executivo("Marcos","Silva","CEO",5000);
        Palestra2 palestraIA = new Palestra2("IA", new Date(), "Salvador", e);
        System.out.println("O executivo " + e.getNome() + " receberá bônus de " + e.getBonusPalestras());

        Instrutor i = new Instrutor();
        i.setNome("Roberta");
        i.setCurso("Visão Computacional");
        Palestra2 palestraVC = new Palestra2("Visão Computacional", new Date(), "Manaus", i);
        System.out.println("O instrutor " + i.getNome() + " receberá bônus de " + i.getBonusPalestras());


        // Dará erro ao menos que a classe Aluno passe a implementar a interface Palestrante

        /*Funcionario f = new Funcionario();
        f.setNome("João");
        Palestra2 palestraDL = new Palestra2("Deep Learning", new Date(), "Porto Alegre", f);
        System.out.println("O funcionário " + c.getNome() + " receberá bônus de " + f.getBonusPalestras());*/


        // Dará erro ao menos que a classe Aluno passe a implementar a interface Palestrante
        /*Aluno a = new Aluno();
        a.setNome("Silvio");
        Palestra2 palestraDS = new Palestra2("Data Science", new Date(), "Cuiabá", a);
        System.out.println("O aluno " + a.getNome() + " receberá bônus de " + a.getBonusPalestras());*/
    }

}
