package lista_java.Q5;

public class Main {
    public static void main(String[] args) {
        ColecaoVetor vet = new ColecaoVetor();
        Professor nivan = new Professor("Nivan", "456", "CC", "comp");
        Aluno aninha = new Aluno("Aninha", "135", "135", "EC");
        Aluno day = new Aluno("Day", "246", "246", "EC");

        vet.inserir(nivan);
        vet.inserir(aninha);
        vet.inserir(day);
        String pessoas = vet.pessoasInseridas();
        System.out.println(pessoas);
        System.out.println(vet.tamanhoColecaoNaoNull());

    }
    
}