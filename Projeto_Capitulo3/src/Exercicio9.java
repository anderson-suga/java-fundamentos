import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by suemareverton on 17/06/17.
 * Tratamento de erros: Checked Exceptions
 * Hierarquia de classes Java: https://docs.oracle.com/javase/8/docs/api/java/lang/package-tree.html
 */
public class Exercicio9 {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/Exercicio100.java");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            e.printStackTrace();
        }

    }

}
