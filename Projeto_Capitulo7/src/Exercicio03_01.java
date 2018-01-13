import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by suemareverton on 24/07/17.
 * Leitura de Arquivos - Parte 2
 */
public class Exercicio03_01 {

    public static void main(String[] args) {
        Path path = Paths.get("src", "arquivo_de_teste_2.txt");
        Charset charset = Charset.forName("UTF-8");

        try {
            List<String> lines = Files.readAllLines(path, charset);
            System.out.println(lines);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
