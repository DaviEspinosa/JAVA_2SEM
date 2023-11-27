package Controller;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Cliente;
import Model.Cliente;

public class ClienteControl {
    // atributos
    public List<Cliente> cliente;
    private DefaultTableModel tableModel;
    private JTable table; // onde os dados serão exibidos

    // Construtor que recebe o tableModel
    public ClienteControl(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }

    // metodo cancelar
    public void cancelar(String nome, String endereco, String numero, String cpf) {
    }

    // Método apagar
    public void apagar(String cpf) {
        // chamando o metodo apagar no bd
        new ClientesDAO().apagar(cpf);
        atualizar();
    }

    // metodo cadastrar
    public void cadastrar(String nome, String endereco, String numero, String cpf) {
        new ClientesDAO().cadastrar(nome, endereco, numero, cpf);
        atualizar();
    }

    // Método atualizar Tabela
    private void atualizar() {

        // Iniciar o tableModel
        if (tableModel != null) {
            // Ao iniciar as linhas existentes irão sumir
            tableModel.setRowCount(0);
            // puxa a lista de Cliente do BD
            cliente = new ClientesDAO().listarTodos();

            // ele vai colocar no TableModel os clientes que estão no banco de dados
            for (Cliente carro : cliente) {
                tableModel.addRow(
                        new Object[] { carro.getNome(), carro.getEndereco(), carro.getNumero(), carro.getCpf() });
            }
        }
        // Se tableModel não foi iniciado ele exibira uma menssagem
        else {
            System.out.println("tableModel não inicializado. Certifique-se de passá-lo ao construtor.");
        }
    }

}
