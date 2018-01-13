import dsa.Conta;

/**
 * Created by suemareverton on 22/06/17.
 * Sobrecarga de métodos
 */

public class Exercicio9 {

    public static void main(String[] args) {
        Conta c = new Conta();

        // Deposita 500 reais
        c.deposita(500);
        System.out.println(c.getSaldo());

        // Agenda o depósito para daqui 2 dias, valor do saldo não é alterado
        c.deposita(300,2);
        System.out.println(c.getSaldo());

        // Deposita com um bônus
        c.deposita(300,10F);
        System.out.println(c.getSaldo());
    }

}
