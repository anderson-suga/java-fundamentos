/**
 * Created by suemareverton on 15/06/17.
 * Arrays multidimensionais
 */
public class Exercicio4 {

    public static void main(String[] args) {

        // Cada elemento do array é um outro array
        // Ou seja, temos arrays de arrays para representar 1 matriz
        int[][] matriz;
        matriz = new int[3][4];
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++)
                matriz[i][j] = i + j;
        }

        // Inicializando uma matriz
        int[][] matriz2 = { {10,20}, {30,40,50} };
        int numeroCinquenta = matriz2[1][2];
        System.out.println(numeroCinquenta);
    }
}
