/**
 * Created by suemareverton on 28/06/17.
 * Igualdade entre Strings
 */

public class Exercicio10 {

    public static void main(String[] args) {

        String curso1 = new String("Java Fundamentos");
        String curso2 = new String("Java Fundamentos");

        if(!curso1.equals(curso2))
            System.out.println("Nomes são diferentes");
        else
            System.out.println("Nomes não são diferentes");

    }

}
