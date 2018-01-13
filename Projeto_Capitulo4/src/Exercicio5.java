import dsa.Conta;

/**
 * Created by suemareverton on 22/06/17.
 */
public class Exercicio5 {

    public static void main(String[] args) {

        Conta c = new Conta();
        c.titular = "Suemar";

        c.deposita(1000);
        c.saca(200);
        c.saca(900);
        System.out.println(c.getSaldo());
    }

}
