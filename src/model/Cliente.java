package model;

public class Cliente {

    private int id;
    private String nome;
    private String sexo;
    private String cpf;
    
    public Cliente (){}
    
    public Cliente (String nome, String sexo, String cpf){
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", cpf=" + cpf + '}';
    }
    
   
    
    
    
    
    
}
