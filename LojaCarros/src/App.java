import java.util.*;

import javax.swing.JOptionPane;

public class App extends Carros {

    public static void main(String[] args) throws Exception {
        // class Carros - Atributos e método
        // podemos manipular está classe no App
        // depois criar List<Carros> listaCarros = new ArrayList()

        // dentro do App:
        // 1- cadastrar novo carro
        // 2- listar carros cadastrdos
        // 3- colsultar carros cadastrados
        // 4- apagar um carro cadastrado

        List<Carros> listaCarros = new ArrayList<>();
        boolean correto = true;

        while (correto) {

            int acao = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar \n 2-Listar \n 3-Consultar \n 4-Excluir"));
            if (acao == 1) {

                // 1 - Cadastrar novo carro
                Carros c = new Carros();
                c.setMarca(JOptionPane.showInputDialog("Informe a Marca do seu Carro"));
                c.setModelo(JOptionPane.showInputDialog("Informe a Modelo do seu Carro"));
                c.setAno(JOptionPane.showInputDialog("Informe o Ano do seu Carro"));
                c.setCor(JOptionPane.showInputDialog("Informe a Cor do seu Carro"));
                listaCarros.add(c);

            }
            else if (acao == 2) {
                //listar todos os carros cadastrados
                String listar = "";
                for (Carros carros : listaCarros) {
                    listar+=carros.getMarca()+" "+carros.getModelo();
                }
                JOptionPane.showMessageDialog(null,listar  );
            }

        }

    }

}
