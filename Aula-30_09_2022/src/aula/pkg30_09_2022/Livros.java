package aula.pkg30_09_2022;
public class Livros {
    String autor;
    String titulo;
    int paginas;  
    double preco;
    
    public String toString(){
        return "Autor: " + autor+
                "\nTitulo: " + titulo +
                "\nPaginas: " + paginas +
                "\nPreço: " + preco;
    }
}
