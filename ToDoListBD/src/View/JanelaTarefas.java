package View;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

import Model.Tarefas;

// import javax.swing.table.DefaultTableModel;

public class JanelaTarefas extends JFrame{

    //GridLAyout
    GridLayout grid = new GridLayout();

    //botões para comandos
    private JPanel painelBtn = new JPanel();
    private JButton loadData = new JButton("Load Data");
    private JButton addTask = new JButton("Add Task");
    private JButton editTask = new JButton("Edit Task");
    private JButton deleteTask = new JButton("Delete Task");
    private JButton applyUpdates = new JButton("Apply Updates");
    //barra de pesquisa
    JPanel painelPesquisa = new JPanel();
    JTextField searchBox =  new  JTextField(10);
    //Tabela
    private int linhaSelecionada = -1;
    private List<Tarefas> tarefas;
    private JTable table;
    private TableModel tableModel;
    
    // private DefaultTableModel tableModel;
    public JanelaTarefas() {


        // Painel dos botões

        painelBtn.add(loadData);
        painelBtn.add(addTask);
        painelBtn.add(editTask);
        painelBtn.add(deleteTask);
        painelBtn.add(applyUpdates);

        this.add(painelBtn);
        this.setBounds(200, 200, 800, 400);
        this.setDefaultCloseOperation(2);

    }

    public void run(){
        this.setVisible(true);
    }
    

}

