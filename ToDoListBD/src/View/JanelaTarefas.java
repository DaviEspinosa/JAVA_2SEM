package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


import Model.Tarefas;
import Controller.AcaoBtn;

// import javax.swing.table.DefaultTableModel;

public class JanelaTarefas extends JFrame {





    // GridLAyout
    GridLayout grid = new GridLayout();

    // botões para comandos
    private JPanel painelBtn = new JPanel();
    private JButton loadData = new JButton("Load Data");
    private JButton addTask = new JButton("Adicionar Tarefa");
    private JButton editTask = new JButton("Editar Tarefa");
    private JButton deleteTask = new JButton("Deletar Tarefa");
    private JButton applyUpdates = new JButton("Atualizar");
    // barra de pesquisa
    private JPanel painelAdicionar;
    private JTextField searchBox;
    // Tabela
    private JPanel painelTarefas;
    private JTable tarefas;
    private List<Tarefas> task;
    private DefaultTableModel tableModel;

    // private DefaultTableModel tableModel;
    public JanelaTarefas() {
        super("Agenda de Tarefas");
        grid.setHgap(20);

        // Painel dos botões
        painelBtn.setPreferredSize(new Dimension(700, 30));
        painelBtn.setLayout(grid);
        painelBtn.add(loadData);
        painelBtn.add(editTask);
        painelBtn.add(deleteTask);
        painelBtn.add(applyUpdates);
        
        // painel para adicionar
        painelAdicionar = new JPanel();
        painelAdicionar.setPreferredSize(new Dimension(700, 35));
        searchBox = new JTextField();
        searchBox.setPreferredSize(new Dimension(520, 28));
        painelAdicionar.add(searchBox);
        painelAdicionar.add(addTask);
        addTask.setPreferredSize(new Dimension(160, 28));

        // Inicia a lista de tarefas
        task = new ArrayList<>();
        tableModel = new DefaultTableModel();
        tarefas = new JTable(tableModel);// exibe a interface grafica
        
        // Painel de Listas
        painelTarefas = new JPanel(new BorderLayout());
        painelTarefas.add(new JScrollPane(tarefas), BorderLayout.CENTER);
        painelTarefas.add(tarefas);
        painelTarefas.setPreferredSize(new Dimension(700, 260));

        this.add(painelBtn);
        this.add(painelAdicionar);
        this.add(painelTarefas);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setBounds(200, 200, 800, 400);
        this.setDefaultCloseOperation(2);

    }
    public String inputDescricao(){
        return searchBox.getText();
    }
    
    public void run() {
        this.setVisible(true);
    }

}
