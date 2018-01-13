import java.util.Arrays;
import java.util.Random;

/**
 * Created by suemareverton on 15/06/17.
 * Operações paralelas em arrays
 */

public class Exercicio3 {

    public static void main(String[] args) {

        Random rn = new Random();

        int[] array1 = new int[100000000];
        int[] array2 = new int[100000000];

        for(int i = 0; i < array1.length; i++) {
            // Alimenta a posição do array com um valor entre 0 e 99
            array1[i] = rn.nextInt(100);
            array2[i] = array1[i];
        }

        long inicioTarefa = System.currentTimeMillis();
        Arrays.sort(array1);
        long fimTarefa = System.currentTimeMillis();
        System.out.println("Ordenação do array 1: " + (fimTarefa - inicioTarefa));

        inicioTarefa = System.currentTimeMillis();
        Arrays.parallelSort(array2);
        fimTarefa = System.currentTimeMillis();
        System.out.println("Ordenação do array 2: " + (fimTarefa - inicioTarefa));
    }

}
