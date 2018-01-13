import java.sql.*;

/**
 * Created by suemareverton on 18/07/17.
 * Criando uma conexão com o banco de dados MySQL
 */

public class Exercicio10 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            System.out.println("Driver carregado");
        } catch (Exception ex) {
            System.out.println("Exceção ao carregar o driver: " + ex.getMessage());
            return;
        }

        Connection con = null;
        try {
                con =
                    DriverManager.getConnection("jdbc:mysql://localhost/dsa?" +
                            "user=suemar&password=dsa123&serverTimezone=UTC");
                System.out.println("Conexão estabelecida");

        } catch (SQLException ex) {
            // Manipulação de erros
            System.out.println("SQLException: " + ex.getMessage());
        }
    }

}
