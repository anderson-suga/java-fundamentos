import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by suemareverton on 17/07/17.
 * Leitura de arquivos na Internet
 * Referência: https://docs.oracle.com/javase/tutorial/networking/urls/index.html
 */

public class Exercicio09 {

    public static void main(String[] args) {

        URL url = null;
        BufferedReader in = null;
        try {
            url = new URL("https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data");
            in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(in != null)
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

}
