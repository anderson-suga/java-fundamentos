/**
 * Created by suemareverton on 11/07/17.
 * Garbage Collector
 */
public class Exercicio04 {

    public static void main(String[] args) {

        System.out.println("Heap size: " + Runtime.getRuntime().totalMemory());
        System.out.println("Heap max size: " + Runtime.getRuntime().maxMemory());

        String resultadoStr = "";
        for(int i = 0; i <= 100000; i++) {
            resultadoStr = resultadoStr + " " + i;
            System.out.println("Free memory: " + Runtime.getRuntime().freeMemory());
        }

        // Demonstra a intenção de executar o coletor de lixo
        // Não garante que será executado imediatamente
        System.gc();

        System.out.println("FIM");
    }
}
