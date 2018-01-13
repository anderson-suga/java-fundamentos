/**
 * Created by suemareverton on 05/06/17.
 * Operadores aritméticos
 * Referência: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
 */

public class Exercicio3 {

    public static void main(String[] args) {

        // Operações aritméticas

        int num1 = 10, num2 = 125;
        int num3 = 10 + 20 + num1;
        num3 = num3 + num1;

        byte subtracao = 15 - 120;
        System.out.println(subtracao);

        long resultado1 = num1 * 20000000000000L;
        System.out.println(resultado1);

        int num4 = 9, num5 = 2;

        // Como o dividendo é inteiro, o quociente será inteiro
        int resultado = num4 / num5;
        System.out.println("Resultado da divisão: " + resultado);

        // Desta forma podemos obter o resto da divisão
        // através do operador de módulo
        int resto = num4 % num5;
        System.out.println("Resto da divisão: " + resto);

        // Se quisermos o quociente em ponto flutuante
        // podemos converter o dividendo para float
        float num6 = 9, num7 = 2;
        float resultadoEmFloat = num6 / num7;
        System.out.println(resultadoEmFloat);
    }
}
