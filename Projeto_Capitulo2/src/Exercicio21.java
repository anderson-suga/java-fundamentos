/**
 * Created by suemareverton on 13/06/17.
 * Manipulação de Strings
 * Referência: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 */

public class Exercicio21 {

    public static void main(String[] args) {

        // Obtendo um caracter de uma String em uma posição específica
        String anotherPalindrome = "Niagara. O roar again!";

        char aChar = anotherPalindrome.charAt(9);
        System.out.println(aChar);

        // Obtendo uma sub-String de uma String
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

        // Dividindo (separando) conteúdo de uma String
        String nomes = "João,José,Maria,Roberto,Silvia";
        String[] arrayNomes = nomes.split(",");
        for(String nome : arrayNomes)
            System.out.println(nome);

        // Obtendo o comprimento de uma String
        // Lembrando que o índice inicial (posição do primeiro caractere é 0)
        System.out.println(
                String.format("%s tem %d letras",
                        anotherPalindrome,anotherPalindrome.length()
                )
        );

        // Convertendo para maíusculo
        System.out.println("dsa é incrível!!!".toUpperCase());

        // Procurando a primeira ocorrência de uma substring em uma String
        int primeiraOcorrencia = anotherPalindrome.indexOf("ga");
        System.out.println(primeiraOcorrencia);

        // Procurando a última ocorrência de uma substring em uma String
        int ultimaOcorrencia = anotherPalindrome.lastIndexOf("ga");
        System.out.println(ultimaOcorrencia);

        // Verificando se uma String possui uma substring
        // Retorno do método contains é booleano (verdadeiro ou falso)
        System.out.println("DSA é incrível".contains("é"));
        System.out.println("DSA é incrível".contains("curso ruim"));

        // Substituindo caracteres e realizando encadeamento
        String frase = "seja-bem-vindo-ao-curso-de-java-fundamentos"
                .replace('-',' ')
                .replaceAll(" ","  ")
                .replaceFirst("ja","JA");


        System.out.println(frase);
    }

}
