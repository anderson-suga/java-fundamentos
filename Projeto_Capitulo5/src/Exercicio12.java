import dsa.Consultor;
import dsa.Palestra2;
import dsa.interfaces.Palestrante;

import java.util.Date;

/**
 * Created by suemareverton on 29/06/17.
 * Classes anônimas
 */
public class Exercicio12 {

    public static void main(String[] args) {

        Palestra2 palestra =
                new Palestra2("ML", new Date(), "Campo Grande", new Palestrante() {
                    @Override
                    public float getBonusPalestras() {
                        return 200;
                    }
                });

        Palestrante palestrante = palestra.getPalestrante();
        System.out.println(palestrante.getBonusPalestras());

    }

}
