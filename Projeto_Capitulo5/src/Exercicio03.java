import dsa.Executivo;
import dsa.Funcionario;

/**
 * Created by suemareverton on 27/06/17.
 * Herança
 */

public class Exercicio03 {

    public static void main(String[] args) {
        Executivo e = new Executivo("Suemar","Everton","Diretor",1000F);
        System.out.println(e.getNome() + " terá um bônus de " + e.getBonus());

        Funcionario f = new Funcionario();
        System.out.println(f.getSalario());
    }

}
