package Model;

public class Cliente {
    
    //Atributos
    private String nome;
    private String endereco;
    private String numero;
    private String cpf;

    //construtor
        public Cliente(String nome, String endereco, String numero, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.cpf = cpf;
    }

    //getters and setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

}
