import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by suemareverton on 17/07/17.
 * Leitura de arquivos - FileInputStream
 * Referência: https://docs.oracle.com/javase/tutorial/essential/io/streams.html
 */

public class Exercicio02 {

    public static void main(String[] args) {


        try {
            FileReader fr = new FileReader("src/arquivo_de_teste.txt");
            int data = fr.read();
            while (data != -1) {
                System.out.println(data + " " + (char) data);
                data = fr.read();
            }

            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
