package web_app.gerenciamento_escola.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProfessorModel implements Serializable{
    //atributos
    @Id
    String cpf;
    String professor;
    String disciplina;
    String senha;
    String tel;
    String turma;

    //metodos
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    
}
