import java.io.*;

/**
 * Created by suemareverton on 17/06/17.
 * Checked exceptions:
 */
public class Exercicio10 {

    public static void imprimeArquivo(String nomeArquivo) throws IOException {

        FileInputStream fis = new FileInputStream(nomeArquivo);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();


    }

    public static void main(String[] args) {
        try {
            imprimeArquivo("src/Exercicio098.java");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }
    }

}
