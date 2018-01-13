import java.sql.*;

/**
 * Created by suemareverton on 18/07/17.
 * Executando comandos DQL
 */
public class Exercicio11 {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            System.out.println("Exceção ao carregar o driver: " + ex.getMessage());
            return;
        }

        Connection con = null;
        try {
                con =
                    DriverManager.getConnection("jdbc:mysql://localhost/dsa?" +
                            "user=suemar&password=dsa123&serverTimezone=UTC");


                PreparedStatement cmd = con.prepareStatement(
                        "SELECT movie_title, title_year, imdb_score " +
                                "FROM movies " +
                                " where movie_facebook_likes > 150000"
                );

                // executando
                ResultSet rs = cmd.executeQuery();

                // Iteração sobre o ResultSet
                while (rs.next()) {
                    String nome = rs.getString("movie_title");
                    int ano = rs.getInt("title_year");
                    float nota = rs.getFloat("imdb_score");
                    System.out.println(nome + " lançado em " + ano + " com nota " + nota);
                }

                // Fecha o ResultSet
                rs.close();

                // Fecha o Statement
                cmd.close();

        } catch (SQLException ex) {
            // Manipulação de erros
            System.out.println("SQLException: " + ex.getMessage());
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
