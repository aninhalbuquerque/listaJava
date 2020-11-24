package lista_java.Q1;

public class Main {
    public static void main(String args[]){
        LivroLivraria liv = new LivroLivraria("Capitaes da Areia", "Jorge Amado", 15.6, 5);
        LivroBiblioteca bib = new LivroBiblioteca("Harry Potter", "cancelada");

        System.out.println(bib.getAutor());
        System.out.println(liv.getTitulo());

        liv.venda();
        System.out.println(liv.getQtEstoque());

        bib.emprestar("Aninha", 11);
        System.out.println(bib.getMulta(200));

        bib.devolver();
        System.out.println(bib.getMulta(200));

    }
}