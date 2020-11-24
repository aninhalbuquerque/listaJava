package lista_java.Q2;

public class Main {
    public static void main(String args[]){
        Texto texto = new Texto("I got a spark in me\nHands up if you can see\nAnd you're a part of me\nHands up if you’re with me\nNow till eternity\nHands up if you believe\nBeen so long and now we’re finally free");

        texto.print();
        System.out.println(texto.qtPalavras());
        System.out.println(texto.qtOcorrencias("Hands"));

        texto.substitui("Hands", "Legs");
        texto.substitui("finally free", "FINALLY FREE");
        texto.print();
    }
}
