import java.util.Stack;

/**
 * Created by suemareverton on 11/07/17.
 * Pilhas: https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
 * Estruturas do tipo LIFO: 'Último que entra é o primeiro que sai'
 */

public class Exercicio11 {

    public static void main(String[] args) {

        Stack<Aluno> pilha = new Stack<>();
        pilha.push(new Aluno("Vera",5));
        pilha.push(new Aluno("Clara",8.5f));
        pilha.push(new Aluno("Melissa",8));

        // Push 'empilha' um elemento na estrutura
        // No caso acima, Melissa está no topo da pilha, assim ela será a primeira a 'sair'

        Aluno melissa = pilha.peek(); // Obtendo Melissa, mas sem removê-la da estrutura
        System.out.println(melissa.getNome());

        melissa = pilha.pop(); // Obtendo Melissa e removendo-a da estrutura
        System.out.println(melissa.getNome());

        Aluno proximoAluno = pilha.pop();
        System.out.println(proximoAluno.getNome());
    }

}
