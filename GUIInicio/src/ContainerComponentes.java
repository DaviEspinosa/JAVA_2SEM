import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContainerComponentes extends JFrame {
    int count = 0;
    int count2 = 0;
    public ContainerComponentes() {
        super("Janela Container");
        this.setBounds(500, 500, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Criar um outro cantainer
        JPanel painel1 = new JPanel();
        this.add(painel1);
        JButton botao1 = new JButton("Clique em mim");
        JButton botao2 = new JButton("Menos 1");
        JButton botao3 = new JButton("Mais 1 botao");
        JLabel label1 = new JLabel("Número de cliques");
        painel1.add(botao1);
        painel1.add(botao2);
        painel1.add(label1);
        this.setVisible(true);
        botao1.addActionListener(e -> {
            count++;
            label1.setText("Número de cliques" + count);
        });
        botao2.addActionListener(e -> {
            count--;
            label1.setText("Número de cliques" + count--);
        });
        botao3.addActionListener(e ->{
  JButton botao4;
        botao4 = new JButton();
        // uma função(addActionLister)

    });
    
}
}