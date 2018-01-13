import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by suemareverton on 17/07/17.
 * Try-with-resources (a partir do Java 7)
 */
public class Exercicio04 {

    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader
                (new FileReader("src/arquivo_de_teste_2.txt"))) {

            StringBuilder conteudo = new StringBuilder();
            String linha = null;
            while ((linha = bufferedReader.readLine()) != null)
                conteudo.append(linha).append("\n");

            System.out.println(conteudo.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Fechará o bufferedReader imediatamente após sair do bloco try
        // independentemente se ocorrer exceptions ou não
        // Para isto a classe utilizada deverá implementar a interface AutoCloseable
        //
    }

}
