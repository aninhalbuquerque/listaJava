package lista_java.Q2;

public class Texto {
    private String txt;

    Texto(String txt_){
        txt = txt_;
    }
    
    String getTxt(){
        return txt;
    }
    void print(){
        System.out.println(txt);
    }

    int qtPalavras(){
        int tam = txt.length();
        int qt = 0;
        boolean flag = false;
        for(int i=0;i<tam;i++){
            char c = txt.charAt(i);
            if(c > 32) flag = true;
            if(c <= 32 && flag){
                flag = false;
                qt++;
            }

            if(i == tam-1 && flag){
                qt++;
            }
        }
        return qt;
    }

    int qtOcorrencias(String palavra){
        int tam = txt.length(), tam2 = palavra.length();
        int qt = 0;
        for(int i=0;i<tam;i++){
            if(i+tam2 > tam) break;
            if(txt.charAt(i) == palavra.charAt(0)){
                boolean achei = true;
                for(int j=1;j<tam2;j++){
                    if(txt.charAt(i+j) != palavra.charAt(j)){
                        achei = false;
                        break;
                    }
                }
                if(achei) qt++;
            }
        }
        return qt;
    }

    void substitui(String palavra, String trad){
        int tam = txt.length(), tam2 = palavra.length();
        String novo = "";
        for(int i=0;i<tam;i++){
            if(i+tam2 > tam) {
                novo = novo + txt.charAt(i);
                continue;
            }
            if(txt.charAt(i) == palavra.charAt(0)){
                boolean achei = true;
                for(int j=1;j<tam2;j++){
                    if(txt.charAt(i+j) != palavra.charAt(j)){
                        achei = false;
                        break;
                    }
                }
                if(achei){
                    novo = novo + trad;
                    i += tam2 - 1;
                } else{
                    novo = novo + txt.charAt(i);
                }
            } else{
                novo = novo + txt.charAt(i);
            }
        }
        txt = novo;
    }
}
