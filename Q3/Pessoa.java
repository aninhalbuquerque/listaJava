package lista_java.Q3;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String grauEscolar;
    protected identidades idGenero;
    protected String orientacaoSexual;
    protected String sexoBiologico;

    Pessoa(){
        nome = "Elisa";
        idade = 18;
        grauEscolar = "Ensino Medio Completo";
        idGenero = identidades.cisgenero;
        orientacaoSexual = "musica da xuxa: bibibibi";
        sexoBiologico = "feminino";
    }

    Pessoa(String nome_, int idade_, String grauEscolar_, identidades idGenero_, String orientacaoSexual_, String sexoBiologico_){
        nome = nome_;
        idade = idade_;
        grauEscolar = grauEscolar_;
        idGenero = idGenero_;
        orientacaoSexual = orientacaoSexual_;
        sexoBiologico = sexoBiologico_;
    }

    void setNome(String nome_){
        nome = nome_;
    }
    String getNome(){
        return nome;
    }
    void setIdade(int idade_){
        idade = idade_;
    }
    int getIdade(){
        return idade;
    }
    String getGrauEscolar(){
        return grauEscolar;
    }
    void setGrauEscolar(String grauEscolar_){
        grauEscolar = grauEscolar_;
    }
    identidades getIdGenero(){
        return idGenero;
    }
    String getOrientacaoSexual(){
        return orientacaoSexual;
    }
    String getSexoBiologico(){
        return sexoBiologico;
    }

    void dormir(){
        System.out.println(nome + " esta dormindo");
    }
    void cagar(){
        System.out.println(nome + " esta cagando");
    }
    void comer(){
        System.out.println(nome + " esta comendo");
    }
    void estudar(){
        System.out.println(nome + " esta estudando");
    }
    void viver(){
        System.out.println(nome + " esta vivendo");
    }
    void sobreviver(){
        System.out.println(nome + " esta sobrevivendo");
    } 
    void trabalhar(){
        System.out.println(nome + " esta trabalhando");
    }
}
