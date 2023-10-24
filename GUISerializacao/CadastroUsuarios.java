package GUISerializacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.awt.BorderLayout;
import java.awt.Color;

public class CadastroUsuarios extends JPanel {

    private JTextField inputNome;
    private JTextField inputIdade;
    private DefaultTableModel tableModel;// este ira mostrar em qual formato será a tabela(organiza a lista)
    private JTable table; // este irá mostrar a tabela
    private List<Usuario> usuarios = new ArrayList<>();
    private int linhaSelecionada = -1;

    public CadastroUsuarios() {


        tableModel = new DefaultTableModel();
        tableModel.addColumn("nome");
        tableModel.addColumn("idade");

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // montando a input de dados e botões
        inputNome = new JTextField(20);
        inputIdade = new JTextField(5);
        JButton cadastrarButton = new JButton("Cadastrar");
        JButton atualizarButton = new JButton("Atualizar");
        JButton apagarButton = new JButton("Apagar");
        JButton apagarTodosButton = new JButton("Apagar Todos");
        JButton salvarButton = new JButton("Salvar");
        JButton agendarButton = new JButton("Agendar");

        // Estruturando o frame
        JPanel agendamentos = new JPanel();
        JPanel inputPanel = new JPanel();
        agendamentos.setBounds(200, 200, 200, 200);
        agendamentos.setBackground( Color.BLACK );
        inputPanel.add(new JLabel("Nome:"));
        inputPanel.add(inputNome);
        inputPanel.add(new JLabel("Idade:"));
        inputPanel.add(inputIdade);
        inputPanel.add(cadastrarButton);
        inputPanel.add(atualizarButton);
        inputPanel.add(apagarButton);
        inputPanel.add(apagarTodosButton);
        inputPanel.add(salvarButton);
        inputPanel.add(agendarButton);

        // add ao layout
        this.setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        File arquivo = new File("dados.txt");
        if (arquivo.exists()) {
            usuarios = Serializacao.deserializar("dados.txt");
            atualizarTabela();
        }
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    inputNome.setText((String) table.getValueAt(linhaSelecionada, 0));
                    inputIdade.setText(table.getValueAt(linhaSelecionada, 1).toString());
                }
            }
        });
        OperacoesUsuarios operacoes = new OperacoesUsuarios(usuarios, tableModel, table);
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.cadastrarUsuario(inputNome.getText(), inputIdade.getText());
                inputNome.setText("");
                inputIdade.setText("");
            }
        });
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.atualizarUsuario(linhaSelecionada, inputNome.getText(),

                        inputIdade.getText());

            }
        });
        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarUsuario(linhaSelecionada);
            }
        });
        apagarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarTodosUsuarios();
            }
        });
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.salvarUsuarios();
            }
        });
        agendarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                operacoes.show(agendamentos,agendarButton.getText() );                                                                                              
            }
        });
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Usuario usuario : usuarios) {
            tableModel.addRow(new Object[] { usuario.getName(), usuario.getIdade() });
        }
    }

}