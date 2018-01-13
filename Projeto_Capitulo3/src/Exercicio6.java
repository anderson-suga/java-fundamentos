/**
 * Created by suemareverton on 15/06/17.
 * Passagem de arrays por parâmetros
 */

public class Exercicio6 {

    private static int[] somaArrays(int[] a, int[] b) {

        int[] resultado = new int[a.length+b.length];

        int i = 0;
        for(int num : a) {
            resultado[i] = num;
            i++;
        }

        for(int num : b) {
            resultado[i] = num;
            i++;
        }

        return resultado;
    }

    public static void main(String[] args) {

        int[] salariosDiretores = { 10000, 20000, 30000 };
        int[] salariosExecutivos = { 40000, 50000, 60000 };

        int[] salariosTodos = somaArrays(salariosDiretores, salariosExecutivos);
        for(int salario : salariosTodos)
            System.out.println(salario);
    }

}
