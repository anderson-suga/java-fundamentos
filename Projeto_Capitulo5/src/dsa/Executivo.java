package dsa;

import dsa.interfaces.Palestrante;

/**
 * Created by suemareverton on 27/06/17.
 */

public class Executivo extends Funcionario implements Palestrante {

    private static final int BONUS_PERCENTUAL = 10;

    public Executivo(String nome, String sobrenome, String cargo, float salario) {
        super(nome, sobrenome, cargo, salario);
    }

    @Override
    public float getBonus() {
        return this.salario / 100 * BONUS_PERCENTUAL;
    }

    @Override
    public float getBonusPalestras() {
        return 3000;
    }
}
