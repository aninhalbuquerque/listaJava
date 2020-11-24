package lista_java.Q1;

public class LivroBiblioteca extends Livro {
    private boolean emprestado;
    private String pessoa;
    private int data;

    LivroBiblioteca(String titulo_, String autor_){
        setTitulo(titulo_);
        setAutor(autor_);
        setEmprestado(false);
        setPessoa("");
        setData(0);
    }

    void setEmprestado(boolean emprestado_){
        emprestado = emprestado_;
    }
    void setPessoa(String pessoa_){
        pessoa = pessoa_;
    }
    void setData(int data_){
        data = data_;
    }
    boolean getEmprestado(){
        return emprestado;
    }
    String getPessoa(){
        return pessoa;
    }
    int getData(){
        return data;
    }

    boolean emprestar(String pessoa_, int data_){
        if(!emprestado){
            setEmprestado(true);
            setPessoa(pessoa_);
            setData(data_);
            return true;
        }
        return false;
    }

    double getMulta(int data_){
        if(!emprestado) return 0.0;
        int dataDevolucao = data + 10;
        if(data_ <= dataDevolucao) return 0.0;
        return 0.5*(data_ - dataDevolucao);
    }

    void devolver(){
        emprestado = false;
        pessoa = "";
        data = 0;
    }
}
