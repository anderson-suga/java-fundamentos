import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by suemareverton on 11/07/17.
 * Métodos de listas
 */


public class Exercicio12 {

    public static void main(String[] args) {

        // Observe a notação, tem que ser Lista de uma 'Classe'... não pode ser tipo primitivo
        List<Integer> nums = new ArrayList<>();

        Random random = new Random(42); // parâmetro seed para reproduzir os mesmos resultados
        for(int i = 0; i <= 10; i ++) {
            nums.add(random.nextInt(100)); // bound = 100 retorna um número entre 0 e 99
        }

        System.out.println(nums);

        // Ordenação
        Collections.sort(nums);

        System.out.println(nums);

        // Embaralha
        Collections.shuffle(nums);
        System.out.println(nums);

        // Inverte
        Collections.reverse(nums);
        System.out.println(nums);

        System.out.println("Maior número: " + Collections.max(nums));
        System.out.println("Menor número: " + Collections.min(nums));

        // Inicializa
        Collections.fill(nums,10);
        System.out.println(nums);

        System.out.println("---");

        List<Integer> nums2 = new ArrayList<Integer>();
        for(int i = 1; i <= 20; i++)
            nums2.add(i);

        // Atenção: o primeiro parâmetro é o destino e o segundo é a origem
        // O tamanho da lista de destino deverá ser maior ou igual à origem
        // Se a lista de destino for menor que a origem, uma exceção é lançada (IndexOutOfBoundsException)
        Collections.copy(nums2,nums);
        System.out.println(nums2);

        // Frequência
        int quantidadeNumeros10 = Collections.frequency(nums2,10);
        System.out.println("Há " + quantidadeNumeros10 + " números 10 na lista");

        // Collections.disjoint retorna true se as listas NÃO tem elementos em comum
        System.out.println("As 2 listas possuem números comuns? " + !Collections.disjoint(nums,nums2));
    }

}
