import javax.swing.*;
import java.awt.*;
public class ExemploFlowLayout {
   public ExemploFlowLayout() {
    super();
    JFrame janela1 = new JFrame();
    FlowLayout flow = new FlowLayout();
    janela1.setLayout(flow);
    JLabel texto1 = new JLabel("Informe o número de botões");
    JTextField painel1 = new JTextField("Insira o número de colunas");
    JButton botao1 = new JButton("Enviar");
    janela1.add(texto1);
    janela1.add(painel1);
    janela1.add(botao1);
    botao1.addActionListener(e ->{
int quant = Integer.parseInt(painel1.getText());
for (int i = 0; i < quant; i++) {
   janela1.add(new JButton(""+i+1));
   janela1.pack();
}
    });
    janela1.setDefaultCloseOperation(2);
    janela1.pack();
    janela1.setVisible(true);
   
   } 
}
