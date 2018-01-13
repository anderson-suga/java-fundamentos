package dsa;

import java.util.Date;

/**
 * Created by suemareverton on 22/06/17.
 */
public class Conta {

    public Conta() {
       saldo = 5;
    }

    public Conta(String titular) {
        this();
        this.titular = titular;
    }

    public String titular;
    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    /*public void setSaldo(float saldo) {
        this.saldo = saldo;
    }*/

    public void saca(float valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para saque: " + valor);
        }
        else if(saldo - valor < 0) {
            throw new IllegalArgumentException("Saldo insuficiente: " + valor);
        }
        else {
            saldo -= valor;
        }
    }

    public void deposita(float valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para depósito: " + valor);
        }
        else {
            saldo += valor;
        }
    }

    // Possibilita depósito agendado
    public void deposita(float valor, int emQuantosDias) {
        if(emQuantosDias == 0) {
            deposita(valor);
        }
        else {
            System.out.println("Depósito agendado");
            // Código para agendar um depósito
            // .....
        }
    }

    // Cliente recebe um bônus pelo depósito
    public void deposita(float valor, float bonus) {
        deposita(valor+bonus);
    }
}
