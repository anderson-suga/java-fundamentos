/**
 * Created by suemareverton on 11/07/17.
 * AutoBoxing: https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
 */

public class Exercicio02 {

    public static void main(String[] args) {

        int idade = 10;
        //idade = null; // Erro, tipo primitivo não aceita nulo

        // Mas, e se quisermos atribuir nulo a uma variável inteira?
        // Usamos a Classe que "empacota" o tipo primitivo int
        // Uma referência a um objeto poderá receber nulo

        Integer novaIdade = 20; // Auto Boxing
        System.out.println("Nova idade: " + novaIdade);

        int idadePrimitivo = novaIdade; // Auto Unboxing
        System.out.println("idadePrimitivo " + idadePrimitivo);

        novaIdade = null; // Agora pode, pois novaIdade é uma referência para um objeto
        System.out.println("Nova idade: " + novaIdade);

        idadePrimitivo = novaIdade; // NullPointerException (NPE)
    }

}
