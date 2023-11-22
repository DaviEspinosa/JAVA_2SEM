package Controller;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Cliente;

public class ClienteControl{
    //atributos
    public List<Cliente> cliente;
    private DefaultTableModel tableModel;
    private JTable table; //onde os dados serão exibidos

    //metodo cancelar
    public void cancelar(String nome, String endereco, String numero, String cpf) {
    }
    
        //metodo cadastrar 
    public void cadastrar(String nome, String endereco, String numero, String cpf){
        new ClientesDAO().cadastrar(nome, endereco, numero, cpf);
        atualizarTabela();
    }

    private void atualizarTabela(){
        tableModel.setRowCount(0);//esta função limpa a tabela
        cliente = new ClientesDAO().listarTodos();
    }
        
    
    }

