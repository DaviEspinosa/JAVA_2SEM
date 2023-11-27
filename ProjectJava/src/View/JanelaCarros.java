package View;

import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.CarrosControl;
import Controller.CarrosDAO;

import Model.Carros;

import java.awt.GridLayout;

public class JanelaCarros extends JPanel {
    // Atributos(componentes)
    private JButton cadastrar, apagar, editar;
    private JTextField carMarcaField, carModeloField, carAnoField, carPlacaField, carValorField;
    private List<Carros> carros;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    // Construtor(GUI-JPanel)
    public JanelaCarros() {
        super();
        // entrada de dados
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Carros"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        // marca
        inputPanel.add(new JLabel("Marca"));
        carMarcaField = new JTextField(20);
        inputPanel.add(carMarcaField);

        // modelo
        inputPanel.add(new JLabel("Modelo"));
        carModeloField = new JTextField(20);
        inputPanel.add(carModeloField);

        // ano
        inputPanel.add(new JLabel("Ano"));
        carAnoField = new JTextField(20);
        inputPanel.add(carAnoField);

        // placa
        inputPanel.add(new JLabel("Placa"));
        carPlacaField = new JTextField(20);
        inputPanel.add(carPlacaField);

        // valor
        inputPanel.add(new JLabel("Valor"));
        carValorField = new JTextField(20);
        inputPanel.add(carValorField);

        add(inputPanel);

        // botões
        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));
        add(botoes);

        // tabela de carros
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Marca", "Modelo", "Ano", "Placa", "Valor" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);
        new CarrosDAO().criaTabela();

        CarrosControl operacoes = new CarrosControl(tableModel);

        // BOTAO DE CADASTRAR
        cadastrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.cadastrar(carMarcaField.getText(), carModeloField.getText(), carAnoField.getText(),
                        carPlacaField.getText(), carValorField.getText());

                JOptionPane.showMessageDialog(null, "Cadastro Aprovado!!!");

                // limpar os campos de entrada
                carMarcaField.setText("");
                carModeloField.setText("");
                carAnoField.setText("");
                carPlacaField.setText("");
                carValorField.setText("");

            }
        });

        // BOTAO DE APAGAR
        apagar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                operacoes.apagar(carPlacaField.getText());
                String numeroPlaca = JOptionPane.showInputDialog("Qual carro deseja apagar (digite sua placa)...");
                int nPlacaDigitado = Integer.parseInt(numeroPlaca); // convertendo o que o usuario colocar em int
                String placa = new Carros().getPlaca();
                int placas = Integer.parseInt(placa);

                if (nPlacaDigitado == placas) {
                    new CarrosControl(tableModel).apagar(placa);
                    JOptionPane.showMessageDialog(null, "Carro removido da Lista");

                } else {
                    JOptionPane.showMessageDialog(null, "Carros não encontrado, Por favor digite novamente...");

                }

            }
        });

    }
}
