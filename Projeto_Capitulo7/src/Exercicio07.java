import models.Curso;
import models.Instrutor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by suemareverton on 17/07/17.
 * Serialização de objetos
 */


public class Exercicio07 {

    public static void main(String[] args) {

        Instrutor instrutor = new Instrutor(1,"Suemar",1000);
        Curso curso = new Curso(10,"Java",instrutor,400);

        // Serializando um objeto
        try {
            FileOutputStream fileOut = new FileOutputStream("curso.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(curso);
            out.close();
            fileOut.close();
            System.out.printf("Objeto serializado");
        } catch(IOException i) {
            i.printStackTrace();
        }
    }

}
