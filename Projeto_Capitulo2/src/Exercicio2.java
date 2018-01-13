/**
 * Created by suemareverton on 05/06/17.
 * Tipos de dados primitivos
 * Referência: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */

public class Exercicio2 {

    public static void main(String[] args) {

        // Declaração com inicialização
        long num1 = 33000;

        // Declarando um número ponto flutuante
        float num2 = 3432.0F;

        // Imprimindo o resultado de uma expressão aritmética
        System.out.println(num1+num2);

        // Variáveis booleanas (podem assumir valores "false" e "true")
        boolean primeiroCurso = false;
        System.out.println(primeiroCurso);

        // Armazenando um caractere
        char letra = 'S';

        // Declarando e inicializando Strings
        // String não é um tipo de dados primitivo
        String nome = "Suemar";
        System.out.println(letra + nome);

        // Declarando múltiplas variáveis de uma vez
        int num3 = 1, num4 = 2, num5 = 5;
        System.out.println(num3+num4);

        // Outros tipos de dados
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;
    }

}
