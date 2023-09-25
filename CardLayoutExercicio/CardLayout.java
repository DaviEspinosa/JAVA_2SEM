package CardLayoutExercicio;

import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayout {

    JFrame frame = new JFrame();

    public CardLayout() {

        CardLayout cardLayout = new CardLayout();
        JPanel painel = new JPanel();
        painel.setLayout( (LayoutManager) cardLayout);//interface LayoutManager (faz pare do pacote java.awt )
        

        frame.setTitle("Example CardLayout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(2);
    }
}
