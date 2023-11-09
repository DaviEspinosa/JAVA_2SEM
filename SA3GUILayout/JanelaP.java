package SA3GUILayout;

import javax.swing.JFrame;

public class JanelaP extends JFrame{
    public JanelaP() {
        super("Projeto");
        //add JtabbedPane a janela Principal
        this.add(new JanelaAbas());
        //set Frame
        this.pack();
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
    }

    // private void add(JanelaAbas janelaAbas) {
    // }
    
}