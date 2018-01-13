import java.io.*;

/**
 * Created by suemareverton on 17/07/17.
 */
public class Exercicio05 {

    public static void main(String[] args) {

        try(BufferedWriter bufferedWriter = new BufferedWriter
                (new FileWriter("src/tabuada.txt"))) {

            int num = 3;
            for(int i = 0; i <= 10; i++) {
                bufferedWriter.write(String.format("%d X %d = %d", num,i,num*i));
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();

        }  catch (IOException e) {
            e.printStackTrace();
        }

    }
}
