package GUISerializacao;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String name;
    private int idade;

    public Usuario(String nome, int idade) {
        this.name = nome;
        this.idade = idade;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
