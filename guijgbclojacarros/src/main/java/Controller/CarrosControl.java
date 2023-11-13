package Controller;

import Model.Carros;

public class CarrosControl {
    //atributos
    private <List>Carros

    private void atualizarTabela(){//este metodo serve para adicionar os itens na tabela
        tableModel.setRowCount(0); //função do table model para limpar a tabela
        carros = new CarrosDAO().listarTodos();
        
        for (  Carros carro :carros ) {
            tableModel.addRow(new Object[]{carro.getMarca(), carro.getModelo(),carro.getAno(),carro.getPlaca(),carro.getValor()})
        } 
    }

    //metodo cadastrar
    public void cadastrar (String marca, String modelo, String ano, String placa,String valor){
        new CarrosDAO().cadastrar(marca,modelo,ano,placa,valor);
        atualizarTabela();
    }

    //metodo apagar
    public void apagar (String placa){
        new CarrosDAO().apagar(placa);
        atualizarTabela();
    }

    //metodo Aualizar pela Placa
    public void atualizar(String marca, String modelo, String ano, String placa,String valor){

    }
}
