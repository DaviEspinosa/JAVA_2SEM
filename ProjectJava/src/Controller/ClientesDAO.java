package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionFactory;

import Model.Cliente;

public class ClientesDAO {

    // atributos
    private List<Cliente> clientes;
    private Connection connection;

    // criar Tabela
    public void criaTabela() {
        
        //aqui esta sendo criada uma tabela no banco de dados
        //com nome 'cliente_loja' e com colunas 'nome, endereço, número, cpf'
        String sql = "CREATE TABLE IF NOT EXISTS cliente_loja (NOME VARCHAR(255),ENDERECO VARCHAR(255),NUMERO VARCHAR(255),CPF VARCHAR(255) PRIMARY KEY)";
        
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            // caso ocorra erro na criação o código imprimirá uma menssagem de erro
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } 
        //finally esta garantindo que a conexão será fechada 
        finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // Listar todos os valores cadastrados
    public List<Cliente> listarTodos() {
        PreparedStatement stmt = null; //  o PreparedStatement executará a consulta SQL
        ResultSet rs = null; // Ela armazena o que o PreparedStatement consultou
        clientes = new ArrayList<>(); // Armazena uma lista de carros puxando do BD
    
        try {
            // Prepara a consulta SQL para selecionar todos os registros da tabela
            stmt = connection.prepareStatement("SELECT * FROM cliente_loja"); 
            
            // Executa a consulta e armazena os resultados no ResultSet
            rs = stmt.executeQuery(); 

            
            while (rs.next()) {
                // Para cada registro no ResultSet, cria um objeto Carros com os valores do registro
                Cliente cliente = new Cliente(

                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getString("numero"),
                    rs.getString("cpf")

                );
                clientes.add(cliente); // Adiciona o objeto cliente à lista de cliente
            }
        } catch (SQLException ex) {
            System.out.println(ex); // Em caso de erro durante a consulta, imprime o erro
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }
        return clientes; // Retorna a lista de carros recuperados do banco de dados
    }

    //cadstrar carro no banco de dados
    public void cadastrar(String nome, String endereco, String numero, String cpf){
        PreparedStatement stmt = null;

        String sql = "INSERT INTO cliente_loja (nome, endereco, numero, cpf) VALUES (?, ?, ?, ?)";
    try {
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, endereco);
        stmt.setString(3, numero);
        stmt.setString(4, cpf);
        stmt.executeUpdate();
        System.out.println("Dados inseridos com sucesso");
    } catch (Exception e) {
        throw new RuntimeException(e + "Erro ao inserir dados ao Banco de dados");
    }finally{
        ConnectionFactory.closeConnection(connection,stmt);
    }

    }

}
