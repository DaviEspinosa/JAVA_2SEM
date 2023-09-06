import javax.swing.*;

public class GUISwingJFrameExemplo extends JFrame{
    public GUISwingJFrameExemplo() {
        super("Minha Primeira Janela GUISwing");
        this.setSize(400, 400);//Tamanho
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fecha o programa ao aperta o 
        this.setVisible(true);//Transforma a janela visivel
        //Frame é uma janela do tipo container
    }
}
