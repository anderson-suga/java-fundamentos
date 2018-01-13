package models;

import java.io.Serializable;

/**
 * Created by suemareverton on 17/07/17.
 */
public class Curso implements Serializable {

    private int id;
    private String nome;
    private Instrutor instrutor;
    private float valor;

    public Curso(int id, String nome, Instrutor instrutor, float valor) {
        this.id = id;
        this.nome = nome;
        this.instrutor = instrutor;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public float getValor() {
        return valor;
    }
}
