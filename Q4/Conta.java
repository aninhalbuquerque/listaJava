package lista_java.Q4;

public class Conta {
    protected int id;
    protected int agencia;
    protected Senha senha;

    Conta(int id_, int agencia_, String letras_, int numeros_){
        id = id_;
        agencia = agencia_;
        senha = new Senha(letras_, numeros_);
    }
    protected void setId(int id_){
        id = id_;
    }
    protected int getId(){
        return id;
    }
    protected void setAgencia(int agencia_){
        agencia = agencia_;
    }
    protected int getAgencia(){
        return agencia;
    }
    protected void setSenhaLetras(String letras_){
        senha.setLetras(letras_);
    }
    protected String getSenhaLetras(){
        return senha.getLetras();
    }
    protected void setSenhaNumeros(int numeros_){
        senha.setNumeros(numeros_);
    }
    protected int getSenhaNumeros(){
        return senha.getNumeros();
    }
}
