import java.util.Calendar;
import java.util.Date;

/**
 * Created by suemareverton on 13/06/17.
 * Formatação de Strings
 * Referência: https://dzone.com/articles/java-string-format-examples
 */

public class Exercicio20 {

    public static void main(String[] args) {

        String msg;
        String curso = "Java Fundamentos";
        double valorCurso = 123.456789;

        // Passando 1 String como argumento
        msg = String.format("Bem-vindo ao curso %s da DSA", curso);

        // Passando 1 String e um int como argumentos
        msg = String.format("Bem-vindo ao curso %s da DSA. Teremos %d vídeos.", curso, 200);

        // Passando 1 String e um double como argumentos
        msg = String.format("Valor do curso %s: %f", curso, valorCurso);
        msg = String.format("Valor do curso %s: %.2f", curso, valorCurso);

        Date dataAtual = new Date();
        msg = String.format("Hoje é %tD",dataAtual);

        System.out.println(msg);

    }

}
