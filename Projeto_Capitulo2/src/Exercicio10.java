/**
 * Created by suemareverton on 08/06/17.
 * Escopo de variáveis
 */

public class Exercicio10 {


    public static void main(String[] args) {

        int idade = 70;
        float preco = 200;

        if(idade >= 60) {
            float precoComDesconto = preco / 100 * 90;
            System.out.println("Desconto de " + (preco - precoComDesconto));
            preco = precoComDesconto;
        }

        exibirPrecoFinal(preco);

    }

    private static void exibirPrecoFinal(float paramPreco) {
        System.out.println("Preço final: " + paramPreco);
    }

}
