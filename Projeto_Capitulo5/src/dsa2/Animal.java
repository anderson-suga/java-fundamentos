package dsa2;

/**
 * Created by suemareverton on 29/06/17.
 */


public abstract class Animal {

    private float altura;
    private float peso;
    private String cor;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public abstract String som();

}
