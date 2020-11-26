package lista_java.Q6;

public class ExprOpTernario implements Expression{
    private String expr;
    ExprOpTernario(String expr_){
        expr = expr_;
    }

    void setExpr(String expr_){
        expr = expr_;
    }
    String getExpr(){
        return expr;
    }
    public String toString(){
        return "Expressao de Operador Ternario";
    }
    public String avaliar(String expr){
        int tam = expr.length();
        int pos1 = -1, pos2 = -1;
        int aux = 0;
        for(int i=0;i<tam;i++){
            if(expr.charAt(i) == '?') {
                if(pos1 == -1) pos1 = i;
                aux++;
            } 
            if(expr.charAt(i) == ':'){
                aux--;
                if(aux == 0){
                    pos2 = i;
                    break;
                }
            }
            //System.out.println("i = " + String.valueOf(i) + " aux = " + String.valueOf(aux));
        }
        //System.out.println("pos1 = " + String.valueOf(pos1) + " pos2 = " + String.valueOf(pos2));
        String exp1 = expr.substring(0, pos1);
        String exp2 = expr.substring(pos1+1, pos2);
        String exp3 = expr.substring(pos2+1, tam);

        ExprLogica calc1 = new ExprLogica(exp1);
        String resp = "";

        String e1 = calc1.avaliar(calc1.getExpr());
        if(Boolean.valueOf(e1)){
            Check check = new Check(exp2);
            if(check.getTipo() == 2){
                ExprOpTernario calc2 = new ExprOpTernario(exp2);
                resp = calc2.avaliar(calc2.getExpr());
            }if(check.getTipo() == 1){
                ExprLogica calc2 = new ExprLogica(exp2);
                resp = calc2.avaliar(calc2.getExpr());
            }if(check.getTipo() == 0){
                ExprAritmetica calc2 = new ExprAritmetica(exp2);
                resp = calc2.avaliar(calc2.getExpr());
            }
        } else{
            Check check = new Check(exp3);
            if(check.getTipo() == 2){
                ExprOpTernario calc3 = new ExprOpTernario(exp3);
                resp = calc3.avaliar(calc3.getExpr());
            }if(check.getTipo() == 1){
                ExprLogica calc3 = new ExprLogica(exp3);
                resp = calc3.avaliar(calc3.getExpr());
            }if(check.getTipo() == 0){
                ExprAritmetica calc3 = new ExprAritmetica(exp3);
                resp = calc3.avaliar(calc3.getExpr());
            }
        }
        return resp;
    }
    public String imprimirArvore(String expr){
        int tam = expr.length();
        int pos1 = -1, pos2 = -1;
        int aux = 0;
        for(int i=0;i<tam;i++){
            if(expr.charAt(i) == '?') {
                if(pos1 == -1) pos1 = i;
                aux++;
            } 
            if(expr.charAt(i) == ':'){
                aux--;
                if(aux == 0){
                    pos2 = i;
                    break;
                }
            }
            //System.out.println("i = " + String.valueOf(i) + " aux = " + String.valueOf(aux));
        }
        String exp1 = expr.substring(0, pos1);
        String exp2 = expr.substring(pos1+1, pos2);
        String exp3 = expr.substring(pos2+1, tam);

        //ExprAritmetica calcAri = new ExprAritmetica();
        ExprLogica calc1 = new ExprLogica(exp1);
        //ExprOpTernario calcTer = new ExprOpTernario();
        String resp = calc1.imprimirArvore(calc1.getExpr()) + "?";

        Check check2 = new Check(exp2);
        if(check2.getTipo() == 2){
            ExprOpTernario calc2 = new ExprOpTernario(exp2);
            resp += "(" + calc2.imprimirArvore(calc2.getExpr()) + "):";
        }if(check2.getTipo() == 1) {
            ExprLogica calc2 = new ExprLogica(exp2);
            resp += "(" + calc2.imprimirArvore(calc2.getExpr()) + "):";
        }if(check2.getTipo() == 0) {
            ExprAritmetica calc2 = new ExprAritmetica(exp2);
            resp += "(" + calc2.imprimirArvore(calc2.getExpr()) + "):";
        }

        Check check3 = new Check(exp3);
        if(check3.getTipo() == 2){
            ExprOpTernario calc3 = new ExprOpTernario(exp3);
            resp += "(" + calc3.imprimirArvore(calc3.getExpr()) + ")";
        }if(check3.getTipo() == 1) {
            ExprLogica calc3 = new ExprLogica(exp3);
            resp += "(" + calc3.imprimirArvore(calc3.getExpr()) + ")";
        }if(check3.getTipo() == 0) {
            ExprAritmetica calc3 = new ExprAritmetica(exp3);
            resp += "(" + calc3.imprimirArvore(calc3.getExpr()) + ")";
        }

        return resp;
    }
}
