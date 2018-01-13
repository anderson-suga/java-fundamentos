package dsa;

import dsa.interfaces.Palestrante;

/**
 * Created by suemareverton on 29/06/17.
 */

public class Instrutor extends Funcionario implements Palestrante {

    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    @Override
    public float getBonusPalestras() {
        return 500;
    }
}
