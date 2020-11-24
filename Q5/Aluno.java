package lista_java.Q5;

public class Aluno extends Pessoa {
    protected String matricula;
    protected String curso;

    Aluno(String nome_, String cpf_, String matricula_, String curso_){
        super(nome_, cpf_);
        matricula = matricula_;
        curso = curso_;
    }

    protected void setNome(String nome_){
        nome = nome_;
    }
    protected void setCpf(String cpf_){
        cpf = cpf_;
    }

    protected void setMatricula(String matricula_){
        matricula = matricula_;
    }
    protected String getMatricula(){
        return matricula;
    }
    protected void setCurso(String curso_){
        curso = curso_;
    }
    protected String getCurso(){
        return curso;
    }
}

interface Colecao{
    void inserir(Pessoa pep);
    int tamanhoColecaoNaoNull();
}

class ColecaoVetor implements Colecao{
    protected Pessoa[] dados = new Pessoa[5];
    
    public void inserir(Pessoa pep) {
        for(int i=0;i<5;i++){
            if(dados[i] == null){
                dados[i] = pep;
                break;
            }
        }
    }
    public int tamanhoColecaoNaoNull(){
        for(int i=0;i<5;i++){
            if(dados[i] == null){
                return (5-i);
            }
        }
        return 0;
    }

    String pessoasInseridas(){
        String pessoas = "";
        for(int i=0;i<5;i++){
            if(dados[i] == null) break;
            if(i > 0) pessoas += ",";
            pessoas += dados[i].getNome();
        }
        return pessoas;
    }
}
