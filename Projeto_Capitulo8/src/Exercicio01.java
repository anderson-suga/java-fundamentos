/**
 * Created by suemareverton on 24/07/17.
*/

public class Exercicio01 {

    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("código executado dentro da thread");
            }
        }).start();

        new Thread( () -> System.out.println("código executado dentro da thread")).start();


    }

}
