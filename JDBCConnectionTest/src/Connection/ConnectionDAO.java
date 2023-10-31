package Connection;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class ConnectionDAO {

    private Connection connection;

    // construtor
    public ConnectionDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS NOME_TABELA (ID SERIAL PRIMARY KEY, NOME VARCHAR (255), EMAIL VARCHAR (255))";

        try (Statement stmt = connection.createStatement()) {// Statement é o tradutor do banco de dados para java
            stmt.execute(sql);
            System.out.println("Tabela criada");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar tabela" + e.getMessage());
            // TODO: handle exception
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void apagarTabela() {
        String sql = "DROP TABLE MINHA_TABELA";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Tabela apagada com sucesso.");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao apagar tabela.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

        public void inserir(String nome, String email){
            String sql = "";
        }

}
