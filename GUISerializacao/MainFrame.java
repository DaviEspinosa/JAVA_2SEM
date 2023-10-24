package GUISerializacao;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Frame pricipal da App");
        setDefaultCloseOperation(2);

        //add abas ao JPanel
        JTabbedPane abas = new JTabbedPane();
        abas.add("CadastroUsuarios",  new CadastroUsuarios());
        abas.add("Agendamentos",  new CadastroAgendamento());
        
        add(abas);

    }

    public void run() {
        pack();
        setVisible(true);
    }
}
