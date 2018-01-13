import java.util.Arrays;

/**
 * Created by suemareverton on 15/06/17.
 * Manipulação de Arrays
 */


public class Exercicio2 {

    public static void main(String[] args) {

        // Inicializando os valores de um array na sua inicialização
        String[] nomes = { "Daniel", "Higor", "Suemar" };
        int[] idades = { 10, 20, 30 };

        // Preenche os valores de um array
        Arrays.fill(idades,10);

        idades[0] = 30;
        idades[1] = 10;
        idades[2] = 20;

        // Realizando uma busca linear
        int numeroAProcurar = 20;
        boolean achou = false;
        for(int idade : idades) {
            if(idade == numeroAProcurar) {
                achou = true;
                break;
            }
        }
        System.out.println("Número " + numeroAProcurar + " está na lista? " + achou);

        // Ordenando um array
        Arrays.sort(idades);

        // Fazendo uma busca binária no array
        // Para a busca binária funcionar, o array precisa estar ordenado
        int pontoInsercao = Arrays.binarySearch(idades, 20 );
        System.out.println(pontoInsercao);

        // Imprimindo todos os elementos do array
        for(int idade : idades)
            System.out.println(idade);
    }
}
