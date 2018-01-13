import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by suemareverton on 12/07/17.
 * Maps: https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
 * */


public class Exercicio13 {

    public static void main(String[] args) {

        /* Maps realizam mapeamento chave => valor
           Um mapa não pode ter chaves duplicadas.
           Cada chave realiza o mapeamento para um valor.
           Elementos não são ordenados... não recupera por índice e sim pela chave
           Rápida busca e inserção de dados
         */

        // Define um mapeamento de 'Long' -> 'Aluno'
        Map<Long, Aluno> mapPessoas = new HashMap<>();

        // Insere um objeto no mapa. Chave é um Long e Valor é um 'Aluno'
        mapPessoas.put(11111111111L, new Aluno(1,"Márcio", 5));
        mapPessoas.put(22222222222L, new Aluno(2, "Maria",6));
        mapPessoas.put(33333333333L, new Aluno(3, "Roberto",5.5F));

        // A chave 22222222222 já existe no mapa, então passará a mapear um novo aluno
        mapPessoas.put(22222222222L, new Aluno("Maria Silva",7));
        System.out.println(mapPessoas.get(22222222222L).getNome());

        System.out.println("Existe chave 333? " + mapPessoas.containsKey(333));
        System.out.println("Existe aluno Márcio? " + mapPessoas.containsValue(new Aluno(1, "Márcio",6)));
        // Implementar método equals

        // Remoção do mapeamento que possui chave 1, retorna null porque não existe valor associado a esta chave
        System.out.println(mapPessoas.remove("1"));

        // Remoção do mapeamento que possui chave 33333333333, retorna o objeto e remove o mapeamento
        Aluno alunoRemovido = mapPessoas.remove(33333333333L);
        System.out.println(alunoRemovido.getNome() + " foi removido. Sobraram " + mapPessoas.size() + " alunos");

        System.out.println("---");

        // Percorrendo todo o mapeamento
        for(Long chave : mapPessoas.keySet()) {
            System.out.println("Aluno " + mapPessoas.get(chave).getNome());
        }

        System.out.println("---");

        Collection<Aluno> colecaoAlunos = mapPessoas.values();
        System.out.println("Coleção de alunos: " + colecaoAlunos);

        // Uma chave pode mapear para nulo
        mapPessoas.put(11111111111L,null);

        // Limpa o mapeamento
        mapPessoas.clear();
        System.out.println("Mapeamento foi 'limpo: '" + mapPessoas.size() + " alunos");
    }

}
