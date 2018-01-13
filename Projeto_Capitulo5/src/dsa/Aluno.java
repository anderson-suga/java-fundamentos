package dsa;

/**
 * Created by suemareverton on 27/06/17.
 */
public class Aluno extends Pessoa  {

    private int numeroMatricula;
    private String curso;
    private float nota;

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Aluno) {
            return
                    this.numeroMatricula == ((Aluno) obj).getNumeroMatricula() &&
                        this.getNome().equals(((Aluno) obj).getNome());
        }
        else {
            return false;
        }
    }
}
