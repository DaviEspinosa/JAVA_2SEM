package Controller;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.List;

import Model.Carros;
import Controller.CarrosDAO;

public class CarrosControl {
    private List<Carros> carros;
    private DefaultTableModel tableModel; //intermediario entre Bd e lista visivel
    private JTable table;

    // Construtor que recebe o tableModel
    public CarrosControl(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }

    //Método atualizar Tabela
    private void atualizarTabela() {

        //Iniciar o tableModel
        if (tableModel != null) {
            // Ao iniciar as linhas existentes irão sumir 
            tableModel.setRowCount(0);
            // puxa a lista de Carros do BD
            carros = new CarrosDAO().listarTodos();

            // ele vai colocar no TableModel os carros que estão no banco de dados
            for (Carros carro : carros) {
                tableModel.addRow(new Object[] { carro.getMarca(), carro.getModelo(), carro.getAno(), carro.getPlaca(),
                        carro.getValor() });
            }
        }
        //Se tableModel não foi iniciado ele exibira uma menssagem 
        else {
            System.out.println("tableModel não inicializado. Certifique-se de passá-lo ao construtor.");
        }
    }

    // Método cadastrar
    public void cadastrar(String marca, String modelo, String ano, String placa, String valor) {
        //chamando o metodo cadastrar no banco de dados
        new CarrosDAO().cadastrar(marca, modelo, ano, placa, valor);
        // Atualizar tabela 
        atualizarTabela();
    }

    // Método apagar
    public void apagar(String placa) {
        // chamando o metodo apagar no bd 
        new CarrosDAO().apagar(placa);
        atualizarTabela();
    }

    // Método para atualizar pela Placa
    public void atualizar(String marca, String modelo, String ano, String placa, String valor) {

        atualizarTabela();
    }
    
}
