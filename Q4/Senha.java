package lista_java.Q4;

public class Senha {
    protected String letras;
    protected int numeros;

    Senha(String letras_, int numeros_){
        letras = letras_;
        numeros = numeros_;
    }

    protected void setLetras(String letras_){
        letras = letras_;
    }
    protected String getLetras(){
        return letras;
    }
    protected void setNumeros(int numeros_){
        numeros = numeros_;
    }
    protected int getNumeros(){
        return numeros;
    }
}
