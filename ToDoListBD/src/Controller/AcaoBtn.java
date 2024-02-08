package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import View.JanelaTarefas;
import Model.Tarefas;

public class AcaoBtn {

    private DefaultTableModel tableModel;
    private List<Tarefas> task;
    public AcaoBtn(DefaultTableModel tableModel ) { //construtor // List<Tarefas> task
        this.tableModel = tableModel;
        this.task = new ArrayList<>();
    }

    //métodos
    public void adicionarTarefa(String descricao) {
        if (!descricao.isEmpty()) {
            System.out.println("Tarefa adicionada com sucesso");
            Tarefas novaTarefa = new Tarefas(descricao, true);
            task.add(novaTarefa);

            // Adiciona a nova tarefa ao modelo da tabela
            Object[] rowData = {task.size(), descricao}; // Usando task.size() como ID da tarefa
            tableModel.addRow(rowData);

            // Notifica a tabela sobre as linhas inseridas
            int lastRow = tableModel.getRowCount() - 1;
            tableModel.fireTableRowsInserted(lastRow, lastRow);
            
        }
    }

}
