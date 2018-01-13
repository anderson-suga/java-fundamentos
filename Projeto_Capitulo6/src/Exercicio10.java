import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by suemareverton on 11/07/17.
 * Filas: https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
 * Estrutura do tipo FIFO: 'Primeiro que entra é o primeiro que sai'
 */

public class Exercicio10 {

    public static void main(String[] args) {

        Queue fila = new LinkedList();
        fila.offer(new Instrutor(3,"Márcia",1500));
        fila.offer(new Instrutor(2,"Vânia",3500));
        fila.offer(new Instrutor(1,"Aline",1250));

        // Peek retorna mas não remove o primeiro elemento da fila
        Instrutor instrutor = (Instrutor) fila.peek();
        System.out.println(instrutor.getNome());
        System.out.println(fila.size());

        // Poll retorna e remove o primeiro elemento da fila ou nulo se a fila estiver vazia
        instrutor = (Instrutor) fila.poll();
        System.out.println(instrutor.getNome());
        System.out.println(fila.size());

        // Remove retorna e remove o primeiro elemento da fila
        instrutor = (Instrutor) fila.remove();
        System.out.println(instrutor.getNome());
        System.out.println(fila.size());

        // Teste Remove vs Poll
        /*instrutor = (Instrutor) fila.poll();
        instrutor = (Instrutor) fila.poll();
        instrutor = (Instrutor) fila.poll();*/

        // "Tipando" a estrutura: agora só serão aceitos 'alunos' ou suas subclasses na fila
        // Queue<Aluno> queue = new LinkedList<Aluno>();
    }

}
