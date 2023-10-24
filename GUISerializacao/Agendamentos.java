package GUISerializacao;

import java.io.Serializable;

import javax.swing.JPanel;

public class Agendamentos implements Serializable{
    
    private String data;
    private String hora;
    private Usuario usuario;
    private String descricao;

    public Agendamentos(String data, String hora, Usuario usuario, String descricao) {

        this.data = data;
        this.hora = hora;
        this.usuario = usuario;
        this.descricao = descricao;
        
    }
    
        public String getData() {
            return data;
        }
    
        public void setData(String data) {
            this.data = data;
        }
    
        public String getHora() {
            return hora;
        }
    
        public void setHora(String hora) {
            this.hora = hora;
        }
    
        public Usuario getUsuario() {
            return usuario;
        }
    
        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }
    
        public String getDescricao() {
            return descricao;
        }
    
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
}
