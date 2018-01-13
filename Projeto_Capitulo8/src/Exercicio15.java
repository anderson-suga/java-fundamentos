import models.Jogador;
import models.Time;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suemareverton on 24/07/17.
 * FlatMaps
 */
public class Exercicio15 {

    public static void main(String[] args) {

        List<Time> times = new ArrayList<>();

        Time gremio = new Time("Grêmio");
        gremio.adicionarJogador(new Jogador("Renato Gaúcho"));
        gremio.adicionarJogador(new Jogador("Paulo Nunes"));

        Time internacional = new Time("Internacional");
        internacional.adicionarJogador(new Jogador("Falcão"));
        internacional.adicionarJogador(new Jogador("Carpegiani"));

        times.add(gremio);
        times.add(internacional);

        // Flatmaps pode transformar cada elemento de uma stream
        // em uma stream de outros objetos
        // 1 entrada pode ser mapeada em 0, 1 ou muitas saídas
        // No caso cada entrada (time) é mapeada em várias saídas (jogadores)

        times.stream()
             .flatMap(t -> t.obterJogadores().stream())
                .forEach(j -> System.out.println(j.getNome()));
    }

}
