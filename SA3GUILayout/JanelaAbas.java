package SA3GUILayout;

import javax.swing.JTabbedPane;

public class JanelaAbas  {
    public JanelaAbas() {
        super();
        //add calculadora as abas
        this.add("Calculadora 1",new Calculadora1());
        this.add("Calculadora 2",new Calculadora2());
        this.add("Calculadora 3",new Calculadora3());

    }
}
