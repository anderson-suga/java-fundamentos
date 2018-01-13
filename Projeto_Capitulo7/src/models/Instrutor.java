package models;

import java.io.Serializable;

/**
 * Created by suemareverton on 17/07/17.
 */
public class Instrutor implements Serializable {

    private int matricula;
    private String nome;
    private float salario;

    public Instrutor(int matricula, String nome, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }
}
