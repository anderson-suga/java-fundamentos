/**
 * Created by suemareverton on 15/06/17.
 * Referências:
 * https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 */

public class Exercicio1 {

    public static void main(String[] args) {

        // Problema: armazenar vários valores do mesmo tipo
        //double salario1 = 123.0, salario2 = 456.0, salario3 = 789.0;

        // Declarando um array de strings
        double[] salarios;

        // Instanciando um array COM 5 POSIÇÕES
        // Importante: uma vez que o tamanho é definido, ele não poderá ser alterado
        salarios = new double[5];

        // Escrevendo em uma posição do array
        salarios[3] = 1000;
        salarios[4] = 2000;

        // Linha abaixo não funciona, índice deverá ser um inteiro
        //nomes[3.4] = "Everton;

        // Linha abaixo dá erro, extrapola os limites do array
        //salarios[5] = 20000;

        // Iterando para escrever em um array
        // Primeira posição do array é 0
        for(int i = 0; i < salarios.length; i++) {
            salarios[i] = 1000 * i;
        }

        // Iterando e acumulando o valor de todos os salários
        double totalSalarios = 0;
        for(double salario : salarios) {
            totalSalarios += salario;
        }
        double mediaSalarios = totalSalarios / salarios.length;
        System.out.println(String.format("Média salarial: %f", mediaSalarios));
    }

}
