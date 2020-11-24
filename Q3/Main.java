package lista_java.Q3;

public class Main {
    public static void main(String[] args) {
        Pessoa pep = new Pessoa();
        Pessoa pep2 = new Pessoa("Marco", 23, "Ensino Superior Completo", identidades.transgenero, "hetero", "feminino");
        System.out.println(pep.getNome());
        System.out.println(pep2.getIdGenero());

        pep.comer();
        pep2.cagar();
        pep.dormir();
    }
}
