package Model;
public class Tarefas {
    // atributos 
    private String nome ;
    private boolean done;

    public Tarefas(String nome, boolean done) {
        this.nome = nome;
        this.done = false;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isDone() {
        return done;
    }
    public void setDone(boolean done) {
        this.done = done;
    }



    
}
