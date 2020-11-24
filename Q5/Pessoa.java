package lista_java.Q5;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;

    Pessoa(String nome_, String cpf_){
        nome = nome_;
        cpf = cpf_;
    }

    protected abstract void setNome(String nome_);

    protected String getNome(){
        return nome;
    }

    protected abstract void setCpf(String cpf_);

    protected String getCpf(){
        return cpf;
    }
}
