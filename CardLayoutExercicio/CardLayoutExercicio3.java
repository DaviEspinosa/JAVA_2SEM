package CardLayoutExercicio;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.*;

public class CardLayoutExercicio3 extends JFrame {

    public CardLayoutExercicio3() {
        super("Exercício 3 - CardLayout");
        JPanel mainPanel = new JPanel();
        CardLayout cl = new CardLayout();

        mainPanel.setLayout(cl);
        this.add(mainPanel);

        // Card 1 -Home
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Boas Vindas"));
        JButton but1 = new JButton("Login");
        JButton but2 = new JButton("Cadastro");
        card1.add(but1);
        card1.add(but2);

        // adicionando ao Principal
        mainPanel.add(card1, "Home");

        // Card 2 -Login
        JPanel card2 = new JPanel();
        card2.add(new JLabel("pàgina login"));
        JButton but3 = new JButton("Home");
        JButton but4 = new JButton("Cadastro");
        card2.add(but3);
        card2.add(but4);

        // adicionando ao Principal
        mainPanel.add(card2, "Login");

        // Card 3 -Cadastro
        JPanel card3 = new JPanel();
        card3.add(new JLabel("Página de Cadastro"));
        JButton but5 = new JButton("Home");
        JButton but6 = new JButton("Login");
        card3.add(but5);
        card3.add(but6);

        // adicionando ao Principal
        mainPanel.add(card3, "Cadastro");

        //set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100,320 , 320);
        this.setVisible(true);

        //actionListener dos botões (tratamento de eventos)
        but1.addActionListener(e ->{
            cl.show(mainPanel, but1.getText());
        });
        but2.addActionListener(e ->{
            cl.show(mainPanel, but2.getText());
        });
        but3.addActionListener(e ->{
            cl.show(mainPanel, but3.getText());
        });
        but4.addActionListener(e ->{
            cl.show(mainPanel, but4.getText());
        });
        but5.addActionListener(e ->{
            cl.show(mainPanel, but5.getText());
        });
        but6.addActionListener(e ->{
            cl.show(mainPanel, but6.getText());
        });
    }

}
