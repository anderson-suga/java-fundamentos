package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suemareverton on 24/07/17.
 */
public class Time {

    private String nome;
    private List<Jogador> jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public List<Jogador> obterJogadores() {
        return this.jogadores;
    }

}
