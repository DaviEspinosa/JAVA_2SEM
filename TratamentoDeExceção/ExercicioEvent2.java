package TratamentoDeExceção;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ExercicioEvent2 {

    JFrame frame = new JFrame();

    public ExercicioEvent2() {

        JPanel mainPanel = new JPanel(new GridLayout(4, 1));
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        // Paineis

        // painel1
        JLabel letra = new JLabel("Letra:");
        JLabel resultLetra = new JLabel();
        panel1.add(letra);
        panel1.add(resultLetra);
        // painel2
        JLabel digiteLabel = new JLabel("Digite um Texto:");
        JTextField digiteInput = new JTextField(10);
        panel2.add(digiteLabel);
        panel2.add(digiteInput);
        // painel3
        JLabel resultado = new JLabel();
        panel3.add(resultado);

        // mainPanel
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);
        mainPanel.add(panel4);

        digiteInput.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                char typedKey = e.getKeyChar();
                letra.setText("" + typedKey);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
            }

        });

        // set do frame
        frame.add(mainPanel);
        frame.setTitle("Digite um Texto");
        frame.setDefaultCloseOperation(2);
        frame.setBounds(100, 100, 400, 400);
        frame.setVisible(true);
    }

}
// turin.com