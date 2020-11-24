package lista_java.Q5;

public class Professor extends Pessoa{
    protected String formacao;
    protected String area;

    Professor(String nome_, String cpf_, String formacao_, String area_){
        super(nome_, cpf_);
        formacao = formacao_;
        area = area_;
    }

    protected void setNome(String nome_){
        nome = nome_;
    }
    protected void setCpf(String cpf_){
        cpf = cpf_;
    }
    protected void setFormacao(String formacao_){
        formacao = formacao_;
    }
    protected String getFormacao(){
        return formacao;
    }
    protected void setArea(String area_){
        area = area_;
    }
    protected String getArea(){
        return area;
    }
}
