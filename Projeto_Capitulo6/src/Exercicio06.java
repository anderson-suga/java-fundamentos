import java.util.ArrayList;

/**
 * Created by suemareverton on 11/07/17.
 * Polimorfismo em Listas
 */
public class Exercicio06 {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Aluno joao = new Aluno("João",10);
        pessoas.add(joao);

        pessoas.add(new Aluno("José",6)); // Adicionando um aluno (aluno é pessoa)
        pessoas.add(new Instrutor(1,"Suemar", 1000)); // Adicionando um instrutor (instrutor é pessoa)

        // Então temos no array 3 pessoas, 1 aluno, 1 aluno e 1 instrutor

        // Consigo recuperar uma pessoa, porém só possuo acesso ao seu nome
        Pessoa p = pessoas.get(0);
        System.out.println(p.getNome());


        // Mas também posso converter, por exemplo, quem está no índice 2 é um instrutor
        Instrutor i = (Instrutor) pessoas.get(2);
        System.out.println(i.getNome() + " recebe " + i.getSalario());

        // Mas e se eu tentar converter um aluno em instrutor?
        //i = (Instrutor) pessoas.get(0); // quem está na posição 0 é um aluno => ClassCastException.

        // Como eu posso verificar a instância de um objeto?
        for(Pessoa pes : pessoas) {
            if(pes instanceof Aluno)
                System.out.println("O aluno " + p.getNome() + " tem nota " + ((Aluno) pes).getNota());
            else if (pes instanceof Instrutor)
                System.out.println("O instrutor " + pes.getNome() + " recebe " + ((Instrutor) pes).getSalario());
        }
    }

}
