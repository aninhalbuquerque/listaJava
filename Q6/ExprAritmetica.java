package lista_java.Q6;

public class ExprAritmetica implements Expression {
    private String expr;
    ExprAritmetica(String expr_){
        expr = expr_;
    }

    void setExpr(String expr_){
        expr = expr_;
    }
    String getExpr(){
        return expr;
    }

    public String toString(String expr){
        return expr;
    }

    public String avaliar(String expr) {
        int tam = expr.length();
        for(int i=tam-1;i>=0;i--){
            if(expr.charAt(i) == '-'){
                String x1 = avaliar(expr.substring(0, i));
                String x2 = avaliar(expr.substring(i+1, tam));
                double x = Double.valueOf(x1) - Double.valueOf(x2);
                String y = String.valueOf(x);
                return y;
            }
        }
        for(int i=tam-1;i>=0;i--){
            if(expr.charAt(i) == '+'){
                String x1 = avaliar(expr.substring(0, i));
                String x2 = avaliar(expr.substring(i+1, tam));
                double x = Double.valueOf(x1) + Double.valueOf(x2);
                String y = String.valueOf(x);
                return y;
            }
        }
        for(int i=tam-1;i>=0;i--){
            if(expr.charAt(i) == '*'){
                String x1 = avaliar(expr.substring(0, i));
                String x2 = avaliar(expr.substring(i+1, tam));
                double x = Double.valueOf(x1) * Double.valueOf(x2);
                String y = String.valueOf(x);
                return y;
            }
        }
        for(int i=tam-1;i>=0;i--){
            if(expr.charAt(i) == '/'){
                String x1 = avaliar(expr.substring(0, i));
                String x2 = avaliar(expr.substring(i+1, tam));
                double x = Double.valueOf(x1) / Double.valueOf(x2);
                String y = String.valueOf(x);
                return y;
            }
        }
        return expr;
    }

    public String imprimirArvore(String expr) {
        int tam = expr.length();
        for(int i=tam-1;i>=0;i--){
            if(expr.charAt(i) == '-'){
                return "(" + imprimirArvore(expr.substring(0, i)) + "-" +  imprimirArvore(expr.substring(i+1, tam)) + ")";
            }
        }
        for(int i=tam-1;i>=0;i--){
            if(expr.charAt(i) == '+'){
                return "(" + imprimirArvore(expr.substring(0, i)) + "+" +  imprimirArvore(expr.substring(i+1, tam)) + ")";
            }
        }
        for(int i=tam-1;i>=0;i--){
            if(expr.charAt(i) == '*'){
                return "(" + imprimirArvore(expr.substring(0, i)) + "*" +  imprimirArvore(expr.substring(i+1, tam)) + ")";
            }
        }
        for(int i=tam-1;i>=0;i--){
            if(expr.charAt(i) == '/'){
                return "(" + imprimirArvore(expr.substring(0, i)) + "/" +  imprimirArvore(expr.substring(i+1, tam)) + ")";
            }
        }
        return "(" + expr + ")";
    }
}
