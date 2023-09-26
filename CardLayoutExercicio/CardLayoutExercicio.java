package CardLayoutExercicio;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExercicio {

    public CardLayoutExercicio() {
        JFrame frame = new JFrame();
        CardLayout cl = new CardLayout();
        JPanel painel = new JPanel();
        painel.setLayout(cl);

        // --==criar cards para adicionar ao painel==--

        // --card1--
        JPanel card1 = new JPanel();
        JButton button1 = new JButton();
        card1.add(new JLabel("Card 1"));
        card1.add(button1);

        // --card2--
        JPanel card2 = new JPanel();
        JButton button2 = new JButton();
        card2.add(new JLabel("Card 2"));
        card2.add(button2);

        // --card3--
        JPanel card3 = new JPanel();
        JButton button3 = new JButton();
        card3.add(new JLabel("Card 3"));
        card3.add(button3);

        // Crie um ouvinte de eventos para o botão que muda de card
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mude para o próximo card
                cl.next(painel);
            }
        };
        // Adicione o ouvinte de eventos ao botão
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);

        // adicionando ao painel principal
        painel.add(card1);
        painel.add(card2);
        painel.add(card3);

        frame.add(painel);
        frame.setTitle("Example CardLayout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(2);
        frame.setBounds(100, 100, 300, 300);
    }
}
