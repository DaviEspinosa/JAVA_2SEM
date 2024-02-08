package Controller;

import javax.swing.table.DefaultTableModel;
import View.JanelaTarefas;
import Model.Tarefas;

public class AcaoBtn {

    private DefaultTableModel tableModel;

    public AcaoBtn(DefaultTableModel tableModel) { //construtor
        this.tableModel = tableModel;
    }

    //métodos
    public void adicionarTarefa(String descricao) {
        if (!descricao.isEmpty()) {
            Object[] rowData = {tableModel.getRowCount() + 1, descricao};
            tableModel.addRow(rowData);
            int lastRow = tableModel.getRowCount() - 1;
            tableModel.fireTableRowsInserted(lastRow, lastRow); // Notifica a tabela sobre as linhas inseridas
        }
    }
}
