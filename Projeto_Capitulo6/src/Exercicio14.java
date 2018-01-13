import java.util.*;

/**
 * Created by suemareverton on 12/07/17.
 * Maps
 */

public class Exercicio14 {

    public static void main(String[] args) {

        // Definindo um mapeamento Instrutor => Conjunto de Alunos
        Map<Instrutor, Set<Aluno>> map = new HashMap<>();

        // Forma de inserção
        Instrutor daniel = new Instrutor(2, "Daniel", 2000);
        Aluno roberta = new Aluno("Roberta", 9.5F);
        Aluno maria = new Aluno("Maria", 10);
        Set<Aluno> turmaDaniel = new HashSet<>();
        turmaDaniel.add(roberta);
        turmaDaniel.add(maria);
        map.put(daniel, turmaDaniel);

        // Outra forma de inserção
        map.put(
                new Instrutor(1, "Suemar", 1000),
                new HashSet<Aluno>(
                        Arrays.asList(
                                new Aluno("Clara", 8),
                                new Aluno("Gislaine", 9)
                        )
                ));


        for(Instrutor i : map.keySet()) { // Para cada instrutor presente no mapa
            for(Aluno a : map.get(i)) {   // percorrer o conjunto de alunos
                System.out.println(a.getNome() + " é aluno de " + i.getNome());
            }
        }
    }

}
