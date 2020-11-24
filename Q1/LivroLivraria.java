package lista_java.Q1;

public class LivroLivraria extends Livro{
    private double valor;
    private int qtEstoque;

    LivroLivraria(String titulo_, String autor_, double valor_, int qtEstoque_){
        setTitulo(titulo_);
        setAutor(autor_);
        setValor(valor_);
        setQtEstoque(qtEstoque_);
    }

    void setValor(double valor_){
        valor = valor_;
    }
    void setQtEstoque(int qtEstoque_){
        qtEstoque = qtEstoque_;
    }
    double getValor(){
        return valor;
    }
    int getQtEstoque(){
        return qtEstoque;
    }

    void aumentaEstoque(int qt){
        qtEstoque += qt;
    }
    boolean venda(){
        if(qtEstoque > 0){
            qtEstoque--;
            return true;
        }
        return false;
    }
}
