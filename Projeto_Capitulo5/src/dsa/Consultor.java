package dsa;

import dsa.interfaces.Palestrante;

/**
 * Created by suemareverton on 27/06/17.
 */

public class Consultor extends Pessoa implements Palestrante {

    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public float getBonusPalestras() {
        return 1000;
    }

}
