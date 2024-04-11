package web_app.gerenciamento_escola.Model;

import java.io.Serializable;

import jakarta.persistence.Id;

// Classe para adm já cadastrado irá fazer a 
//autenticação do que o usuário cadastrou com 
//o que já está cadastrado nesta tabela
public class VerificacaoAdmModel implements Serializable {
    //atributos
    @Id
    String cpf;
    String senha;

    //métodos

    // obter Cpf
    public String getCpf(){
        return cpf;
    }
    //definir Cpf
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    //obter senha
    public String getSenha(){
        return senha;
    }
    //definir senha
    public void setSenha(String senha){
        this.senha = senha;
    }
}
