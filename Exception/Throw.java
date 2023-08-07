package Exception;

import javax.swing.JOptionPane;

public class Throw {
    public static void main(String[] args) throws Exception {

        boolean loginOk = true;

        while (loginOk) {
            try {
                String usuario = JOptionPane.showInputDialog("Digite o nome do usuário");
                String senha = JOptionPane.showInputDialog("Digite sua senha");
                if (usuario.equals(senha)) {

                    throw new Exception("O usuario não pode ser igual a senha");

                }
                if (senha.length() < 8) {

                    throw new Exception("A senha deve conter no MÍNIMO 8 caracteres");

                }
                loginOk = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage(),"Senha",0);
            }
        }
    }
}
