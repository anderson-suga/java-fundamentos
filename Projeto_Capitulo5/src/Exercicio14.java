import dsa2.Animal;
import dsa2.Cachorro;
import dsa2.Gato;
import dsa2.Pato;

/**
 * Created by suemareverton on 29/06/17.
 * Métodos abstratos
 */


public class Exercicio14 {

    public static void main(String[] args) {

        // Não pode instanciar Animal pois é uma classe abstrata
        //Animal a = new Animal();

        Animal a = new Pato();
        System.out.println(a.som());

        a = new Cachorro();
        System.out.println(a.som());
    }

}
