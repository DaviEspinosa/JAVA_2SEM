package web.app.escola_completo.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
// Obrigatóriamente implemento a classe Serializable (serve para transformar esta classe em arquivo binário)
public class Administrador implements Serializable{

    //atributos
    @Id //esta dizendo que o cpf irá ser o primary key no BD
    private String cpf;
    private String nome;
    private String email;
    private String senha;

    //métodos
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


    
}
