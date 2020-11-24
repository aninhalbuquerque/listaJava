package lista_java.Q1;

public abstract class Livro {
    private String titulo;
    private String autor;

    void setTitulo(String titulo_){
        titulo = titulo_;
    }
    void setAutor(String autor_){
        autor = autor_;
    }
    String getTitulo(){
        return titulo;
    }
    String getAutor(){
        return autor;
    }
}
