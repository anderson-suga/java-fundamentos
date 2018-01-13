/**
 * Created by suemareverton on 11/07/17.
 * Tokenização de Strings
 */

public class Exercicio03 {

    public static void main(String[] args) {

        String frase = "Aprenda Inteligência Artificial na Data Science Academy!";

        String[] tokens = frase.split(" ");
        System.out.println("Número de palavras: " + tokens.length);
        for (String token : tokens)
            System.out.println(token);

        String cpf = "123.456.789.00";
        String[] blocosCPF = cpf.split("\\.");
        for (String bloco: blocosCPF) {
            System.out.println(bloco);
        }
    }

}
