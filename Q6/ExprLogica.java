package lista_java.Q6;

public class ExprLogica implements Expression{
    private String expr;
    ExprLogica(String expr_){
        expr = expr_;
    }

    void setExpr(String expr_){
        expr = expr_;
    }
    String getExpr(){
        return expr;
    }
    public String toString(){
        return "Expressao Logica";
    }
    public String avaliar(String expr){
        int tam = expr.length();
        for(int i=0;i<tam;i++){
            if(expr.charAt(i) == '>'){
                int pos = i+1;
                if(expr.charAt(i+1) == '=') pos++;
                ExprAritmetica calc = new ExprAritmetica(expr.substring(0, i));
                String x1 = calc.avaliar(calc.getExpr());
                calc.setExpr(expr.substring(pos, tam));
                String x2 = calc.avaliar(calc.getExpr());
                double y1 = Double.valueOf(x1);
                double y2 = Double.valueOf(x2);
                return String.valueOf(y1 >= y2);

            }
            if(expr.charAt(i) == '<'){
                int pos = i+1;
                if(expr.charAt(i+1) == '=') pos++;
                ExprAritmetica calc = new ExprAritmetica(expr.substring(0, i));
                String x1 = calc.avaliar(calc.getExpr());
                calc.setExpr(expr.substring(pos, tam));
                String x2 = calc.avaliar(calc.getExpr());
                double y1 = Double.valueOf(x1);
                double y2 = Double.valueOf(x2);
                return String.valueOf(y1 <= y2);
            }                     
            if(expr.charAt(i) == '='){
                ExprAritmetica calc = new ExprAritmetica(expr.substring(0, i));
                String x1 = calc.avaliar(calc.getExpr());
                calc.setExpr(expr.substring(i+2, tam));
                String x2 = calc.avaliar(calc.getExpr());
                double y1 = Double.valueOf(x1);
                double y2 = Double.valueOf(x2);
                return String.valueOf(y1 == y2);
            }
            if(expr.charAt(i) == '!'){
                ExprAritmetica calc = new ExprAritmetica(expr.substring(0, i));
                String x1 = calc.avaliar(calc.getExpr());
                calc.setExpr(expr.substring(i+2, tam));
                String x2 = calc.avaliar(calc.getExpr());
                double y1 = Double.valueOf(x1);
                double y2 = Double.valueOf(x2);
                return String.valueOf(y1 != y2);
            }
        }

        return expr;
    }
    public String imprimirArvore(String expr){
        int tam = expr.length();
        for(int i=0;i<tam;i++){
            if(expr.charAt(i) == '>'){
                int pos = i+1;
                if(expr.charAt(i+1) == '=') pos++;
                ExprAritmetica calc = new ExprAritmetica(expr.substring(0, i));
                String x1 = calc.imprimirArvore(calc.getExpr());
                calc.setExpr(expr.substring(pos, tam));
                String x2 = calc.imprimirArvore(calc.getExpr());
                if(expr.charAt(i+1) == '=') return "(" + x1 + ">=" + x2 + ")";
                return "(" + x1 + ">" + x2 + ")";

            }
            if(expr.charAt(i) == '<'){
                int pos = i+1;
                if(expr.charAt(i+1) == '=') pos++;
                ExprAritmetica calc = new ExprAritmetica(expr.substring(0, i));
                String x1 = calc.imprimirArvore(calc.getExpr());
                calc.setExpr(expr.substring(pos, tam));
                String x2 = calc.imprimirArvore(calc.getExpr());
                if(expr.charAt(i+1) == '=') return "(" + x1 + "<=" + x2 + ")";
                return "(" + x1 + "<" + x2 + ")";
            }                     
            if(expr.charAt(i) == '='){
                ExprAritmetica calc = new ExprAritmetica(expr.substring(0, i));
                String x1 = calc.imprimirArvore(calc.getExpr());
                calc.setExpr(expr.substring(i+2, tam));
                String x2 = calc.imprimirArvore(calc.getExpr());
                return "(" + x1 + "==" + x2 + ")";
            }
            if(expr.charAt(i) == '!'){
                ExprAritmetica calc = new ExprAritmetica(expr.substring(0, i));
                String x1 = calc.imprimirArvore(calc.getExpr());
                calc.setExpr(expr.substring(i+2, tam));
                String x2 = calc.imprimirArvore(calc.getExpr());
                return "(" + x1 + "!=" + x2 + ")";
            }
        }
        return expr;
    }
}
