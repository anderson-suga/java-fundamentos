import java.sql.*;

/**
 * Created by suemareverton on 18/07/17.
 * Executando comandos DDL e DML
 */
public class Exercicio12 {

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


                // Criando uma tabela
                PreparedStatement cmdCreate = con.prepareStatement(
                        "CREATE TABLE Alunos (" +
                            "id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY," +
                            "nome VARCHAR(30) NOT NULL, " +
                            "sobrenome VARCHAR(30) NOT NULL, " +
                            "pontuacao INT(2) NOT NULL " +
                        ")"
                );

                cmdCreate.executeUpdate();
                cmdCreate.close();

                // Inserindo dados em uma tabela
                String sqlInsert = "insert into Alunos(nome,sobrenome,pontuacao) values (?,?,?)";
                PreparedStatement cmdInsert = con.prepareStatement(sqlInsert);
                cmdInsert.setString(1, "suemar");  // nome
                cmdInsert.setString(2, "everton"); // sobrenome
                cmdInsert.setInt(3,80);            // pontuação

                int totalLinhasAfetadas = cmdInsert.executeUpdate();
                System.out.println("Total de linhas afetadas pelo insert: " + totalLinhasAfetadas);
                cmdInsert.close();

                // Excluindo todos os filmes que possuem nota abaixo da média
                String sqlDelete = "delete from movies where color <> 'Color'";
                PreparedStatement cmdDelete = con.prepareStatement(sqlDelete);
                System.out.println("Total de filmes excluídos: " + cmdDelete.executeUpdate());
                cmdDelete.close();

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
