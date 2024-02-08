package Connection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Tarefas;

public class ConnectionDAO {

    // atributos
    private Connection connection;
    private List<Tarefas> task;

    // construtor
    public ConnectionDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    // Adicionando o método CRUD
    public void criarTabelaBD() {
        // criando a Tabela caso não exista
        String sql = "CREATE TABLE IF NOT EXISTS agenda_tarefas (DESCRICAO VARCHAR(255))";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar Tabela:    " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // Listar todos os valores ao bd
    public List<Tarefas> listarTarefasBD() {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        task = new ArrayList<>();

        // Cria uma lista para armazenar os recuperados do banco de dados

        try {
            String sql = "SELECT * FROM agenda_tarefas";
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Tarefas tarefas = new Tarefas(
                rs.getString("descricao"));
                task.add(tarefas);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        finally{
            ConnectionFactory.closeConnection(connection);
        }
        return task;
    }
}
