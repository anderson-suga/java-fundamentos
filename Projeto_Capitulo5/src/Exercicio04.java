import dsa.Executivo;
import dsa.Funcionario;

/**
 * Created by suemareverton on 27/06/17.
 * Herança
 */
public class Exercicio04 {

    public static void main(String[] args) {

        Funcionario f = new Funcionario("Suemar","Everton","Desenvolvedor",1000F);
        System.out.println(String.format("%s terá um bônus de %f",f.getNome(),f.getBonus()));

        Executivo e = new Executivo("João","Silva","Diretor",2000F);
        System.out.println(String.format("%s terá um bônus de %f",e.getNome(),e.getBonus()));

        
    }

}
