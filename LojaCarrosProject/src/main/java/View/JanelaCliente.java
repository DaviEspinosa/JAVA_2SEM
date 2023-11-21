package View;

import java.awt.Button;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controller.ClienteControl;

public class JanelaCliente extends JPanel {

    // atributos
    JButton cadastrar, cancelar;
    private JTextField clientNome, clientEndereco, clientNumero, clientCPF;
    // private List <Cliente> cliente;
    private JTable table; // qual a diferença entre este
    private DefaultTableModel tableModel; // e este
    private int linhaselecionada = -1;

    // Construtor
    public JanelaCliente() {
        // entrada de dados

        JPanel entradas = new JPanel(new GridLayout(4, 2));

        JPanel panelBtn = new JPanel();

        // labels
        JLabel labelNome = new JLabel("Nome :");
        JLabel labelEndereco = new JLabel("Endereço:");
        JLabel labelNumero = new JLabel("Número:");
        JLabel labelCPF = new JLabel("CPF :");

        // inputs
        JTextField inputNome = new JTextField(20);
        JTextField inputEndereco = new JTextField(20);
        JTextField inputNumero = new JTextField(20);
        JTextField inputCPF = new JTextField(20);

        // adicionando aos paineis
        entradas.add(labelNome);
        entradas.add(inputNome);
        entradas.add(labelEndereco);
        entradas.add(inputEndereco);
        entradas.add(labelNumero);
        entradas.add(inputNumero);
        entradas.add(labelCPF);
        entradas.add(inputCPF);

   
        panelBtn.add(cadastrar = new JButton("Cadastrar"));
        panelBtn.add(cancelar = new JButton("Cancelar"));

        add(entradas);
        add(panelBtn);
                
        
        
        
    
    ClienteControl operacoes = new ClienteControl();

    cancelar.addActionListener(e->{
    operacoes.cancelar(inputNome.getText(),inputEndereco.getText(),inputNumero.getText(),inputCPF.getText());

    //limpar os campos de entrada
    inputNome.setText("");
    inputEndereco.setText("");
    inputNumero.setText("");
    inputCPF.setText("");
});

     
    }
}