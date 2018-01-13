import models.Curso;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by suemareverton on 17/07/17.
 * Desserialização de objetos
 */

public class Exercicio08 {

    public static void main(String[] args) {
        Curso curso = null;

        try {
            FileInputStream fileIn = new FileInputStream("curso.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            curso = (Curso) in.readObject();
            in.close();
            fileIn.close();
        } catch(IOException i) {
            i.printStackTrace();
        } catch(ClassNotFoundException c) {
            System.out.println("Não é um objeto da classe Curso");
            c.printStackTrace();
        }

        System.out.println("Objeto desserializado");
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Instrutor: " + curso.getInstrutor().getNome());
    }
}
