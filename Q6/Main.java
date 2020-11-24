package lista_java.Q6;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expr = input.nextLine();
        String arvore, valor;
        Check check = new Check(expr);
        if(check.getTipo() == 2){
            System.out.println("Eh ope ternario");
            ExprOpTernario calculadora = new ExprOpTernario(expr);
            valor = calculadora.avaliar(calculadora.getExpr());
            arvore = calculadora.imprimirArvore(calculadora.getExpr());
        }else if(check.getTipo() == 1){
            System.out.println("Eh logica");
            ExprLogica calculadora = new ExprLogica(expr);
            valor = calculadora.avaliar(calculadora.getExpr());
            arvore = calculadora.imprimirArvore(calculadora.getExpr());
        } else{
            System.out.println("Eh aritmetica");
            ExprAritmetica calculadora = new ExprAritmetica(expr);
            valor = calculadora.avaliar(calculadora.getExpr());
            arvore = calculadora.imprimirArvore(calculadora.getExpr());
        }
        System.out.println(valor);
        System.out.println(arvore);
        input.close();
    }
}