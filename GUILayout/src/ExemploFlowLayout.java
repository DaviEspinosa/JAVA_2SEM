import java.awt.*;
import javax.swing.*;

public class ExemploFlowLayout {
    public ExemploFlowLayout() {
        JFrame janela1 = new JFrame("Janela 1");

        FlowLayout flow = new FlowLayout();
        janela1.setLayout(flow);
        //criando componentes
        JLabel texto1 = new JLabel("Informe o n° de botões: ");
        JTextField painel1 = new JTextField("Insira n° de colunas", 25);
        JButton botao1 = new JButton("Enviar");
        //adicionar os componentes
        janela1.add(texto1);
        janela1.add(painel1);
        janela1.add(botao1);

        //set Frame
        janela1.setDefaultCloseOperation(2);
        janela1.pack();
        janela1.setVisible(true);

    }
}
