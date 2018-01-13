/**
 * Created by suemareverton on 11/07/17.
 */
public class Instrutor extends Pessoa implements Comparable {

    private int matricula;
    private float salario;

    public Instrutor(int matricula, String nome, float salario) {
        this.matricula = matricula;
        this.setNome(nome);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public int compareTo(Object e) {
        return this.matricula - ((Instrutor)e).matricula;
    }
}
