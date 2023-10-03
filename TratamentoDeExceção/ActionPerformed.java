package TratamentoDeExceção;

import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ActionPerformed {

    public ActionPerformed() {
        JFrame frame = new JFrame();

        // Painel Principal
        JPanel mainPanel = new JPanel();

        // criando entrada de dados
        JLabel nomeLabel = new JLabel("Nome:");
        JLabel sobrenomeLabel = new JLabel("Sobrenome:");
        JTextField nomeInput = new JTextField(10);
        JTextField sobrenomeInput = new JTextField(10);

        mainPanel.add(nomeLabel);
        mainPanel.add(nomeInput);
        mainPanel.add(sobrenomeLabel);
        mainPanel.add(sobrenomeInput);
        mainPanel.setLayout(new FlowLayout());
        JLabel resultado = new JLabel();
        // evento
        JButton butConcatenar = new JButton("OK");

        butConcatenar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                resultado.setText(nomeInput.getText()+" "+sobrenomeInput.getText());
                nomeInput.setText("");
                sobrenomeInput.setText("");
                // String nome = nomeInput.getText();
                // String sobrenome = sobrenomeInput.getText();
                // String concatenar = nome + sobrenome;
                // JLabel resultado = new JLabel(concatenar);
                // mainPanel.add(resultado);
            }

        });

  
        mainPanel.add(butConcatenar);

        // set do frame
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(2);
        frame.setVisible(true);
        frame.setBounds(100, 100, 400, 400);
    }
}
