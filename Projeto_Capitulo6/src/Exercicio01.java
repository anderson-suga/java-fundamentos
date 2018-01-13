/**
 * Created by suemareverton on 11/07/17.
 * StringBuilder
 * https://docs.oracle.com/javase/tutorial/java/data/buffers.html
 */


public class Exercicio01 {

    public static void main(String[] args) {

        String nome = "João";
        nome = nome + " " + "Silva"; // Strings são imutáveis
        System.out.println(nome);

        // Utilizando StringBuilders

        // Cria uma StringBuilder com capacidade para 16 caracteres
        StringBuilder sb1 = new StringBuilder();

        // Cria uma StringBuilder com capacidade para 20 caracteres
        StringBuffer sb2 = new StringBuffer(20);

        // Cria uma StringBuilder com capacidade para tamanho da string + 16 caracteres
        StringBuilder sb3 = new StringBuilder("DSA");

        System.out.println("Tamanho: " + sb3.length());
        System.out.println("Capacidade: " + sb3.capacity());

        sb3.ensureCapacity(100);
        System.out.println("Nova capacidade: " + sb3.capacity());

        String formacao1 = "Formação Cientista de Dados";
        float precoFormacao1 = 2000;

        sb3.append(" possui a promocão ")
                .append(formacao1)
                .append("por ")
                .append(precoFormacao1);

        System.out.println(sb3.toString());

        // Performance
        // Armazenar todos os números entre 1 e 10000

        long ti = System.currentTimeMillis();
        String resultadoStr = "";
        for(int i = 0; i <= 50000; i++) {
            resultadoStr = resultadoStr + " " + i;
        }
        long tf = System.currentTimeMillis();
        System.out.println("Tempo de concatenação com Strings: " + (tf - ti));

        ti = System.currentTimeMillis();
        StringBuilder resultadoSb = new StringBuilder(200000);
        for(int i = 0; i <= 50000; i++) {
            resultadoSb.append(" ").append(i);
        }
        tf = System.currentTimeMillis();
        System.out.println("Tempo de concatenação com StringBuilder: " + (tf - ti));
    }
}
