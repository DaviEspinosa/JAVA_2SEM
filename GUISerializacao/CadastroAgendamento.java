package GUISerializacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.io.File;

public class CadastroAgendamento extends JPanel {
    private JTextField inputData;
    private JTextField inputHora;
    private JComboBox<String> comboUsuarios;
    private JTextField inputDescricao;
    private DefaultTableModel tableModel;
    private JTable table;
    private List<Agendamentos> agendamentos = new ArrayList<>();
    private int linhaSelecionada = -1;

    public CadastroAgendamento() {
        File arquivo = new File("dados.txt");
        List<Usuario> usuarios = new ArrayList<>();
        if (arquivo.exists()) {
            usuarios = Serializacao.deserializar("dados.txt");
        }

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Data");
        tableModel.addColumn("Hora");
        tableModel.addColumn("Usuário");
        tableModel.addColumn("Descrição");

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        inputData = new JTextField(20);
        inputHora = new JTextField(5);

        //Add meu comboBox
        comboUsuarios = new JComboBox<String>();
        for (Usuario usuario : usuarios) {
            comboUsuarios.addItem(usuario.getName());
        }

        JButton cadastrarAgendaButton = new JButton("Cadastrar");
        JButton atualizarButton = new JButton("Atualizar");
        JButton apagarAgendaButton = new JButton("Apagar");
        JButton salvarAgendaButton = new JButton("Salvar");

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Data:"));
        inputPanel.add(inputData);
        inputPanel.add(new JLabel("Hora:"));
        inputPanel.add(inputHora);
        inputPanel.add(comboUsuarios);
        inputPanel.add(cadastrarAgendaButton);
        inputPanel.add(atualizarButton);
        inputPanel.add(apagarAgendaButton);
        inputPanel.add(salvarAgendaButton);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);   
    }

}
