import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;


public class Calculadora1 extends JPanel {
    public Calculadora1() {
        super();
        this.add(new JLabel("Calculadora 1"));
    }
}

public class Calculadora2 extends JPanel {
    public Calculadora2() {
        super();
        this.add(new JLabel("Calculadora 2"));
    }
}

public class Calculadora3 extends JPanel {
    public Calculadora3() {
        super();
        this.add(new JLabel("Calculadora 3"));
    }
}

public class JanelaAbas extends JTabbedPane {

    public JanelaAbas() {
        // add calculadora as abas
        this.add("Calculadora 1", new Calculadora1());
        this.add("Calculadora 2", new Calculadora2());
        this.add("Calculadora 3", new Calculadora3());

    }

}

public class CardLayoutExercicio2 extends JFrame {

    public CardLayoutExercicio2() {
        super("Projeto");
        // add JtabbedPane a janela Principal
        this.add(new JanelaAbas());
        // set Frame
        this.pack();
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
    }

}


