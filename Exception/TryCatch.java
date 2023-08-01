package Exception;

import javax.swing.JOptionPane;

public class TryCatch {

    public static void main(String[] args) {

        int numero1, numero2;

        try {
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número Inteiro"));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número Inteiro"));
            JOptionPane.showMessageDialog(null, "O resultado é" + (numero1 + numero2));
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro, o número não é inteiro");
        }

    }

    public void exercicio2() {

        int numero1, numero2;
        boolean verdade = true;

        while (verdade) {

            try {
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número Inteiro"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número Inteiro"));
                JOptionPane.showMessageDialog(null, "O resultado é" + (numero1 + numero2));

                verdade = false;
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro, o número não é inteiro");
            }
            // realizar operação de acordo com a escolha do usuario, utilizando try catch
        }

    }

    public void exercicio3() {

        int numero1, numero2;
        boolean verdade = true;
        String operações[] = {"Soma" , "Subtração" , "Multiplicação" , "Divisão"};
        int i = JOptionPane.showOptionDialog(null,"Escolha a operação desejada" operações, null, numero1, numero2, null, operações, operações)



        while (verdade) {
            
            try { 
                JOptionPane.showInputDialog(null,"Digite a-Soma / b-Subtração / c-Multiplicação / d-Divisão");
            
                switch (letra) {
                    case "a":

                        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número Inteiro"));
                        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número Inteiro"));
                        JOptionPane.showMessageDialog(null, "O resultado é" + (numero1 + numero2));

                        break;
                
                    default:
                        JOptionPane.showMessageDialog(null, "Erro, o número deve ser inteiro");

                        break;
                }
            }
            catch (Exception e){
        
            }

        }

        

    }

}

