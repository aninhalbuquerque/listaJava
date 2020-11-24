package lista_java.Q4;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(123, 456, "aninhaehbonita", 123456);
        System.out.println(conta.getId());
        System.out.println(conta.getSenhaLetras());

        conta.setSenhaLetras("aninhaehlinda");
        System.out.println(conta.getSenhaLetras());
    }
}