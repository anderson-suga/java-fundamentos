import dsa.Conta;
import dsa.Funcionario;

/**
 * Created by suemareverton on 27/06/17.
 * Composição
 */
public class Exercicio05 {

    public static void main(String[] args) {

        Funcionario f =
                new Funcionario("Suemar","Everton","Desenvolvedor",1000F,new Conta());
        f.getConta().deposita(100);
        System.out.println(f.getConta().getSaldo());

        Conta c = new Conta();
        c.deposita(200);
        f.setConta(c);
        System.out.println(f.getConta().getSaldo());

        Funcionario f2 = new Funcionario();
        System.out.println(f2.getConta().getSaldo());

    }

}
