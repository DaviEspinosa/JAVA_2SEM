package Exception;

import javax.swing.JOptionPane;

public class TryCatchFinally {

    // teste try catch finally

    String fraseInicial = null;
    String fraseFinal = null;
    fraseInicial = JOptionPane.showInputDialog("Digite uma frase");
    
    if(fraseInicial.equals("")) {
        fraseInicial = null;
    }

    try{
    fraseFinal = fraseInicial.toUpperCase(null);
    }

    catch( Exception e){
        fraseFinal = "Não foi digitado uma frase";
    }

    finally {
        JOptionPane.showInternalMessageDialog(null, fraseFinal);
    }
}

