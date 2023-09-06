import javax.swing.JOptionPane;

public class GUISwingJOptionPaneExemplo  extends JOptionPane{
    
    String informacao = "Minha Primeira Dialog";
    public GUISwingJOptionPaneExemplo() {
        super("Dialog");
        JOptionPane.showMessageDialog(getComponentPopupMenu(), informacao,informacao, 2, icon);
        this.setVisible(true);
        
        }
    }
    

