import java.io.File;
import java.io.IOException;

/**
 * Created by suemareverton on 17/07/17.
 * Exclusão de Arquivos e criação de diretórios
 */

public class Exercicio06 {

    public static void main(String[] args) {

        File f = new File("src/tabuada.txt");
        System.out.println(f.exists());
        System.out.println("Excluiu? " + f.delete());

        try {
            f.createNewFile();
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File dir = new File("src/exemplo1");
        System.out.println(dir.mkdir());

        File dir2 = new File("src/exemplo2/nivel1/nivel2/nivel3");
        System.out.println(dir2.mkdirs());
    }

}
