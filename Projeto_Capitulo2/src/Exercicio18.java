/**
 * Created by suemareverton on 13/06/17.
 * Operador condicional
 */

public class Exercicio18 {

    public static void main(String[] args) {

        /*
            Utilizado para substituir if...else,
            podendo tornar o código mais limpo.

            O operador condicional é o único operador ternário do Java
         */

        int nota1 = 9, nota2 = 7;

        /*float media = (nota1 + nota2) / 2;
        if(media < 6)
            System.out.println("Reprovado");
        else
            System.out.println("Aprovado");*/

        String situacao = ((nota1+nota2)/2 >= 6) ? "Aprovado" : "Reprovado";
        System.out.println(situacao);

    }
}
