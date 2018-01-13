/**
 * Created by suemareverton on 12/07/17.
 */
public class Livro implements Guardavel {

    private String titulo;
    private int numPaginas;

    public Livro(String titulo, int numPaginas) {
        this.titulo = titulo;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
