package Challenge;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame{
    
    private JButton cadastrarButton;
    private JButton consultarButton;

    public Frame() {
        this.setDefaultCloseOperation(2);
        this.setBounds(200, 200, 300, 300);

        JPanel panel = new JPanel();
        panel.add(cadastrarButton);
        panel.add(consultarButton);
        panel.setPreferredSize(new Dimension(200,200));
        panel.setBackground(new Color(21, 29, 59));

        this.add(panel, BorderLayout.CENTER);

    }

    public void run(){
        this.setVisible(true);
    }
}
