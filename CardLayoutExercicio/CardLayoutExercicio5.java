package CardLayoutExercicio;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardLayoutExercicio5 {
    int pontuacao = 0;

    public CardLayoutExercicio5() {
        JFrame frame = new JFrame();

        CardLayout cl = new CardLayout();
        JPanel mainPanel = new JPanel();

        // painel home(card 1)
        JPanel home = new JPanel();
        JButton jogar = new JButton("JOGAR");
        home.add(jogar);

        // paineis quiz e botão proximo..
        JPanel quiz1 = new JPanel();
        JPanel quiz2 = new JPanel();
        JPanel quiz3 = new JPanel();
        JPanel quiz4 = new JPanel();
        JPanel quiz5 = new JPanel();
        JButton proximo = new JButton("Próximo");
        JButton proximo2 = new JButton("Próximo");
        JButton proximo3 = new JButton("Próximo");
        JButton proximo4 = new JButton("Próximo");
        JButton proximo5 = new JButton("Próximo");

        // quiz1
        JLabel perg1 = new JLabel("Cerca de quantos anos a bíblia foi escrita?");
        JTextField resp1 = new JTextField(10);
        quiz1.add(perg1);
        quiz1.add(resp1);
        quiz1.add(proximo);
        // quiz2
        JLabel perg2 = new JLabel("Quantos autores a bíblia tem aproximadamente?");
        JTextField resp2 = new JTextField(10);
        quiz2.add(perg2);
        quiz2.add(resp2);
        quiz2.add(proximo2);
        // quiz3
        JLabel perg3 = new JLabel("Quantas vezes Pedro negou Jesus? ");
        JTextField resp3 = new JTextField(10);
        quiz3.add(perg3);
        quiz3.add(resp3);
        quiz3.add(proximo3);
        // quiz4
        JLabel perg4 = new JLabel("Quantos animais entraram na arca de Moisés");
        JTextField resp4 = new JTextField(10);
        quiz4.add(perg4);
        quiz4.add(resp4);
        quiz4.add(proximo4);
        // quiz5
        JLabel perg5 = new JLabel("Significado da palavra 'Apocalipse'");
        JTextField resp5 = new JTextField(10);
        quiz5.add(perg5);
        quiz5.add(resp5);
        quiz5.add(proximo5);

        // Adicionando cards ao mainPanel
        mainPanel.setLayout(cl);
        mainPanel.add(home, "Start");
        mainPanel.add(quiz1);
        mainPanel.add(quiz2);
        mainPanel.add(quiz3);
        mainPanel.add(quiz4);
        mainPanel.add(quiz5);

        // botão jogar
        jogar.addActionListener(e -> {
            cl.next(mainPanel);
        });
        proximo.addActionListener(e -> {
            if (resp1.getText().toUpperCase().equals("1600")) {
                cl.next(mainPanel);
                pontuacao++;
            }
        });
        proximo2.addActionListener(e -> {
            if (resp2.getText().toUpperCase().equals("40")) {
                cl.next(mainPanel);
                pontuacao++;
            }
        });
        proximo3.addActionListener(e -> {
            if (resp1.getText().toUpperCase().equals("3")) {
                cl.next(mainPanel);
                pontuacao++;
            }
        });
        proximo4.addActionListener(e -> {
            if (resp1.getText().toUpperCase().equals("Moisés?")) {
                cl.next(mainPanel);
                pontuacao++;
            }
        });
        proximo5.addActionListener(e -> {
            if (resp1.getText().toUpperCase().equals("")) {
                cl.next(mainPanel);
                pontuacao++;
            }
        });

        // set do frame
        frame.add(mainPanel);
        frame.setTitle("Quizz");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(2);
        frame.setBounds(100, 100, 300, 300);
    }
}
