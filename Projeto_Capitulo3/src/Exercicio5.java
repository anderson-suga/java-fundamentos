/**
 * Created by suemareverton on 15/06/17.
 * Obtendo valores por linha de comando
 */

public class Exercicio5 {

    public static void main(String[] args) {

        // Obtém uma lista de números, soma e executa

        int total = 0;
        for(String arg : args) {
            total += Integer.parseInt(arg);
        }

        System.out.println("Quantidade de parâmetros: " + args.length);
        System.out.println("Total: " + total);

        //System.out.println("Média: " + total / args.length);
    }

}
