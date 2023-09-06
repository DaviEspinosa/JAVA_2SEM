import javax.swing.*;
import java.awt.*;

public class ExemploGridLayout extends JFrame{
    public ExemploGridLayout() {
        super("Janela Principal");
        //add um JPanel
        JPanel painel1 = new JPanel();
        this.add(painel1);
        
        //JFrame seu layout padrao é GridLayout
        //moficicando layout do JPainel seu layout padrao é flow
        GridLayout grid = new GridLayout(4,4);
        painel1.setLayout(grid);
        String valores[] = {"7","8","9","X","4","5","6","-","1","2","3","+","/","0",".","="};
        //add os componenetes ao JPanel
        for (int i = 0; i < valores.length; i++) {
            painel1.add(new JButton(""+valores[i]));
            
        }
        //set do frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);
    }
}
