package models;

/**
 * Created by suemareverton on 24/07/17.
 */
public class Livro {

    public Livro(int codigo, String titulo, int paginas, float preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.paginas = paginas;
        this.preco = preco;
    }

    private int codigo;
    private String titulo;
    private int paginas;
    private float preco;

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }


    public int getPaginas() {
        return paginas;
    }


    public float getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", paginas=" + paginas +
                ", preco=" + preco +
                '}';
    }
}
