package View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JanelaPrincipal extends JFrame {
    // criação do tabbedPane para incluir as tabs
    private JTabbedPane jTPane;

    public JanelaPrincipal() {
        
        jTPane = new JTabbedPane();
        add(jTPane);
        

        // tab1 carros
        JanelaCarros tab1 = new JanelaCarros();
        jTPane.add("Carros", tab1);
        
        //tab2 cliente 
        JanelaCliente tab2 = new JanelaCliente();
        jTPane.add("Clientes", tab2);

        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // métodos para tornar a janela visível
    public void run() {
        this.setVisible(true);
    }
}