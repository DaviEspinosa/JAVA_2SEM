package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // atributos (Nesta ordem - boa prática)
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "postgres";

    // metodos
    public static Connection getConnection() {

        try {

            return DriverManager.getConnection(URL, USUARIO, SENHA);
            
        } 
        catch (SQLException e) {

            throw new RuntimeException("Erro ao obterconexão com o banco de dados");
       
        }
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            // TODO: handle exception
            ex.printStackTrace();
        }
    }
}