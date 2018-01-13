import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by suemareverton on 15/06/17.
 * Tratamento de erros
 * Referência: https://docs.oracle.com/javase/tutorial/essential/exceptions/
 */


public class Exercicio8 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Vamos fazer a divisão entre 2 números...");

        try {
            System.out.println("Qual o primeiro número?");
            int num1 = reader.nextInt();

            System.out.println("Qual o segundo número? ");
            int num2 = reader.nextInt();

            int resultado = 0;

            resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException ae) {
            System.out.println("Ocorreu um erro aritmético");
        } catch (InputMismatchException ime) {
            System.out.println("Número informado é inválido");
        }
        finally {
            System.out.println("Bloco finally");
        }
    }

}
