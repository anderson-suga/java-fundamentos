import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by suemareverton on 13/06/17.
 * Datas em Java: Calendar
 * Referência: https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
 */

public class Exercicio23 {

    public static void main(String[] args) {

        // Obtendo uma instância de um calendário
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

         cal.setTime(new Date());

        int dia = cal.get(Calendar.DATE);
        int mes = cal.get(Calendar.MONTH)+1;
        int ano = cal.get(Calendar.YEAR);

        System.out.println(dia + "/" + mes + "/" + ano);

        // alterar o ano de uma data (da mesma forma outros campos podem ser manipulados)
        cal.set(Calendar.YEAR,2018);
        System.out.println(cal.toInstant().toString());

        // Manipulações de datas
        cal.add(Calendar.MONTH, 1);
        cal.add(Calendar.DATE, -7);
        System.out.println(cal.toInstant().toString());

        Calendar outroCal = Calendar.getInstance();
        System.out.println(outroCal.after(cal));

        /*
            Recomendação

            Para Java 8 ou superior utilize classes do pacote java.time
            http://www.oracle.com/technetwork/articles/java/jf14-date-time-2125367.html

            Para Java 7 ou inferior utilize Joda Time
            http://www.joda.org/joda-time/
         */
    }
}
