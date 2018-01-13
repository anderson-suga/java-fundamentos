import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by suemareverton on 13/06/17.
 * Datas em Java: Date
 * Referência: https://docs.oracle.com/javase/7/docs/api/java/util/Date.html
 */

public class Exercicio22 {

    public static void main(String[] args) {

        // Data é Java é representado basicamente como um número (long)
        // que indica quantos milissegundos se passaram deste 01/01/1970

        Date dataAtual = new Date(); // obtém a data atual
        System.out.println(dataAtual.getTime());
        System.out.println(dataAtual);

        Date outraData = new Date(0);
        System.out.println(outraData);

        outraData.setTime(2352525235L);
        System.out.println(outraData);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(dataAtual));

        SimpleDateFormat sdf2 = new SimpleDateFormat("D"); // dia no ano
        System.out.println(sdf2.format(dataAtual));

        // Consulte mais possibilidades de formatações em:
        // http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

        System.out.println(dataAtual.after(outraData));
        System.out.println(dataAtual.before(outraData));
    }
}
