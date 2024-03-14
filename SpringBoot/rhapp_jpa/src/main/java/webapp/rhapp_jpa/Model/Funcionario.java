package webapp.rhapp_jpa.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;;

@Entity
// Serializable grava os dados em bytes, e quem converte para bytes é o jpa
public class Funcionario implements Serializable {

private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy = GenerationType.AUTO)

// Atributos
private long id;
private String nome;
private String email;

//construtor


//getters and setters
public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
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

}
