/**
 * Created by suemareverton on 15/06/17.
 * Lista de argumentos com tamanho variável
 */

public class Exercicio7 {

    private static int soma2Numeros(int num1, int num2) {

        return num1 + num2;
    }

    private static int soma3Numeros(int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }

    private static int somaNumeros(int... numeros) {
        int total = 0;
        for(int num : numeros) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        //System.out.println(soma2Numeros(10,20));
        //System.out.println(soma3Numeros(10,20,30));
        System.out.println(somaNumeros(10,20,30,40));
        System.out.println(somaNumeros(50,60,70,80,90));
    }


}
