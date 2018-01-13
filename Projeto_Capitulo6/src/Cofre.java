/**
 * Created by suemareverton on 12/07/17.
 * Java Generics
 */

public class Cofre<T extends Guardavel> {

    private static final int TAMANHO_MINIMO_SENHA = 3;

    private T t;
    private boolean aberto = false;
    private String senha;

    public Cofre(String senha) {
        if(senha == null || senha.length() < TAMANHO_MINIMO_SENHA)
            throw new IllegalArgumentException(String.format("Senha deverá possuir no mínimo %d caracteres",TAMANHO_MINIMO_SENHA));
        this.senha = senha;
    }

    public void guardar(T t) {
        if(!aberto)
            throw new IllegalStateException("Cofre está fechado");
        this.t = t;
    }

    public T obter() {
        if(!aberto)
            throw new IllegalStateException("Cofre está fechado");
        if(t == null)
            throw new IllegalStateException("Cofre vazio");
        return t;
    }

    public void abrir(String senha) {
        if(aberto)
            throw new IllegalStateException("Cofre já está aberto");
        if(!this.senha.equals(senha))
            throw new IllegalArgumentException("Acesso negado");
        aberto = true;
    }

    public void esvaziar() {
        t = null;
    }

    public void fechar() {
        aberto = false;
    }

}
