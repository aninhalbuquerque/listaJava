package lista_java.Q6;

public class Check {
    private String expr;
    private int tipo = -1;
    Check(String expr_){
        expr = expr_;
        calc();
    }

    String getExpr(){
        return expr;
    }
    int getTipo(){
        return tipo;
    }

    void calc(){
        int tam = expr.length();
        for(int i=0;i<tam;i++){
            if(expr.charAt(i) == '?') tipo = 2;
        }
        if(tipo != -1) return;
        for(int i=0;i<tam;i++){
            if(expr.charAt(i) == '>') tipo = 1;
            if(expr.charAt(i) == '<') tipo = 1;
            if(expr.charAt(i) == '=') tipo = 1;
            if(expr.charAt(i) == '!') tipo = 1;
            if(tipo != -1) return;
        }
        tipo = 0;
    }
}
