package web_app.gerenciamento_escola.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
// Obrigatóriamente implemento a classe Serializable (serve para transformar esta classe em arquivo binário)
public class AdmModel implements Serializable {
    
    // atributos
    @Id //esta dizendo que o cpf será primary key no banco de dados
    String cpf;
    String nome;
    String email;
    String senha;

    //métodos getters and setters
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

}
