import dsa.Executivo;
import dsa.Funcionario;
import dsa.Palestra;

import java.util.Date;

/**
 * Created by suemareverton on 27/06/17.
 * Polimorfismo
 */

public class Exercicio08 {

    public static void main(String[] args) {
        Executivo daniel =
                new Executivo("Daniel","Mendes","CEO", 2000F);

        Funcionario suemar =
                new Funcionario("Suemar","Everton","Desenvolvedor",1000F);

        Palestra palestra = new Palestra("Java",new Date(),"São Paulo", daniel);
        System.out.println(palestra.getPalestrante().getNome() + " dará a palestra de " + palestra.getTitulo());
        System.out.println(
                palestra.getPalestrante().getNome() + " receberá " +
                        palestra.getPalestrante().getBonus()
        );
    }

}
