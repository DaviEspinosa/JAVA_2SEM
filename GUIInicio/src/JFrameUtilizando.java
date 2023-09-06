import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameUtilizando extends JFrame {
    public JFrameUtilizando() {
        super("Janela Principal");
        // Setando a Janela

        this.setBounds(500, 500, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();// Ajustando o Layout da Janela(o Layout é uma classe)
        this.setLayout(flow);

        // Adicionando componentes

        for (int i = 0; i < 6; i++) {
            this.add(new JButton("" + i));
        }
        this.add(new JTextField("Meus Testos", 15));
        //
        this.setVisible(true);
    }
}
