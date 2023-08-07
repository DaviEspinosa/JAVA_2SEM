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

        // tratando as exceptions
        boolean calcular = true;
        int n1 = 0, n2 = 0;
        while (calcular) {
            try {
                // recebendo os dados
                boolean n1ok = true;
                while (n1ok) {
                    try {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Nº inteiro"));
                        n1ok = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro - valor digitado n~ é inteiro");
                    }
                }
                boolean n2ok = true;
                while (n2ok) {
                    try {
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro Nº inteiro"));
                        n2ok = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro - valor digitado n~ é inteiro");
                    }
                }
                // mostrando o resultado
                // escolher o tipo de conta
                String operacao[] = { "Adição", "Subtração", "Multiplicação", "Divisão", "Sair" };
                int acao = JOptionPane.showOptionDialog(null, "Escolha a Operação", "Calculadora",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.CANCEL_OPTION, null, operacao, operacao[0]);

                if (acao == 0) {
                    JOptionPane.showMessageDialog(null, "O Resultado é "
                            + (n1 + n2));
                }
                 else if (acao == 1) {
                    JOptionPane.showMessageDialog(null, "O Resultado é "
                            + (n1 - n2));
                } 
                else if (acao == 2) {
                    JOptionPane.showMessageDialog(null, "O Resultado é "
                            + (n1 * n2));
                }
                 else if (acao == 3) {
                    JOptionPane.showMessageDialog(null, "O Resultado é "
                            + (n1 / n2));
                } 
                else {
                    calcular = false;
                }
            } catch (NumberFormatException erro1) {
                JOptionPane.showMessageDialog(null, "Erro - valor digitadno não é inteiro");
            } catch (ArithmeticException erro2) {
                JOptionPane.showMessageDialog(null, "Erro - não dividirás por Zero");
            } catch (Exception erro3) {
                JOptionPane.showMessageDialog(null, "Erro - ");
            }
        }
    }
}