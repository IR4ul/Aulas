package aula.pkg30_09_2022;

public class Livros {

    String autor;
    String titulo;
    int paginas;
    double preco;

    public String toString() {
        return "Autor: " + autor
                + "\nTitulo: " + titulo
                + "\nPaginas: " + paginas
                + "\nPreço: " + preco;
    }

    Livros(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;

    }

    void printarNaTela() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        // %.2f para mostrar arpenas duas casas decimais 
        System.out.printf("\nPreço: R$ %.2f" + preco);

    }

    boolean setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
            return true;
        } else {
            return false;
        }
    }
}
