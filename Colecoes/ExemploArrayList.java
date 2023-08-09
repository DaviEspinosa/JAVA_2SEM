package Colecoes;

import java.util.*;


import javax.swing.JOptionPane;

public class ExemploArrayList{

    public void teste(){

        ArrayList<String> carros = new ArrayList<>();
        

        carros.add("Fusca");
        carros.add("Brasília");
        carros.add("Chevette");
        carros.add("Monza");
        carros.add("Monza");
        
        System.out.println(carros);
        //Ordenando a Lista(.sort(Collections))
        Collections.sort(carros);
        System.out.println(carros);
        
        //percorrer a lista (for)
        for (int i = 0; i < carros.size(); i++) { //size() para medir uma classe 
           System.out.println(carros.get(i));
        }

        //percorrer a lista (for-each)
        for (String s : carros) {
            System.out.println(s);
            
        }
        carros.clear();
        System.out.println(carros);
    }

    public void exercicio1(){
        
        ArrayList<Integer> num = new ArrayList();

        for (int i = 0; i < 5; i++) {
            num.add(Integer.parseInt(JOptionPane.showInputDialog(("Digite um numero"))));
           
            System.out.println(num);
            Collections.sort(num);
            
        }
    }
}