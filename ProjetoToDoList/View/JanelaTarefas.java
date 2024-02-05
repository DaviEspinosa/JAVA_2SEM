package View;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

// import javax.swing.table.DefaultTableModel;
import Model.Tarefas;

public class JanelaTarefas {

    JFrame frame = new JFrame();
    // Painel dos botões para comandos
    private JPanel painelBtn;
    private JButton loadData = new JButton("Load Data");
    private JButton addTask = new JButton("Add Task");
    private JButton editTask = new JButton("Edit Task");
    private JButton deleteTask = new JButton("Delete Task");
    private JButton applyUpdates = new JButton("Apply Updates");

    // Painel barra de pesquisa
    JPanel painelPesquisa;
    JTextField searchBox;

    // Tabela
    private int linhaSelecionada = -1;
    private List<Tarefas> tarefas;
    private JTable table;
    private TableModel tableModel;

    // private DefaultTableModel tableModel;
    public JanelaTarefas() {
        

        painelBtn.setPreferredSize(new Dimension(700,100));
        painelBtn.add(loadData);
        painelBtn.add(addTask);
        painelBtn.add(editTask);
        painelBtn.add(deleteTask);
        painelBtn.add(applyUpdates);



        frame.add(painelBtn);
        frame.setBounds(200, 200, 800, 400);
        frame.setDefaultCloseOperation(2);
    }
    
    public void run(){
        frame.setVisible(true);
    }
}