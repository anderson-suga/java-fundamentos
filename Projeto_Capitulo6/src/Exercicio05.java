import java.util.ArrayList;

/**
 * Created by suemareverton on 11/07/17.
 * ArrayLists: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 *
 * Arrays são podem ser redimensionados
 * ArrayLists podem
 */

public class Exercicio05 {

    public static void main(String[] args) {

        ArrayList<String> alunos = new ArrayList<>();
        System.out.println("Tamanho: " + alunos.size());
        System.out.println("Lista está vazia? " + alunos.isEmpty());

        alunos.add("João"); // Insere no final
        alunos.add(0,"José"); // Insere em uma posição específica
        System.out.println("Tamanho: " + alunos.size());
        System.out.println("Lista está vazia? " + alunos.isEmpty());

        String nome = "Maria";
        alunos.add(nome);

        // Loop-for
        for(int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }

        System.out.println("---");

        for(String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("---");

        System.out.println("Roberto está na lista? " + alunos.contains("Roberto"));
        System.out.println("Posição do Roberto: " + alunos.indexOf("Roberto"));
        System.out.println("João está na lista? " + alunos.contains("João"));
        System.out.println("Posição do João: " + alunos.indexOf("João"));
        alunos.add("João");
        System.out.println("Posição do João: " + alunos.indexOf("João"));
        System.out.println("Posição do último João: " + alunos.lastIndexOf("João"));

        alunos.remove(0); // Remove o elemento no índice especificado
        alunos.remove(alunos.lastIndexOf("João"));
        alunos.remove("Maria");

        ArrayList<String> outrosAlunos = new ArrayList<>();
        outrosAlunos.add("Daniel");
        outrosAlunos.add("Higor");
        outrosAlunos.add("Suemar");

        alunos.addAll(outrosAlunos);
        for(String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("---");

        alunos.removeAll(outrosAlunos);
        for(String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("---");

        alunos.set(0,"João Silva"); // Altera o elemento no índice especificado
        System.out.println(alunos.get(0));

        // Convertendo um ArrayList para um Array
        String[] alunosArray = new String[alunos.size()];
        alunosArray = alunos.toArray(alunosArray);

        for(String aluno : alunosArray) {
            System.out.println(aluno);
        }


    }

}
