import java.util.Scanner;

/**
 * Created by suemareverton on 08/06/17.
 * Operadores condicionais
 */
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = reader.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida");
            System.out.println("Tente novamente");
        } else if (idade < 16)
            System.out.println("Não pode votar");
        else if (idade < 18 || idade >= 65)
            System.out.println("Voto opcional");
        else System.out.println("Voto obrigatório");
    }

}
