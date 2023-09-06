import java.awt.*;//Chamando tudo 

public class AWTFrameExemplo extends Frame{
    //Construtor
    public AWTFrameExemplo() {
        super("Minha Primeira Janela AWT");//Para importar da Super classe
        this.setSize(400, 400);
        this.setVisible(true);
        this.setResizable(false);
        
    }
    
}
