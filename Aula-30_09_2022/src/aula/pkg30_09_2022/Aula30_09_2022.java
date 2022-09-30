package aula.pkg30_09_2022;
public class Aula30_09_2022 {


    public static void main(String[] args) {
        
        //Livro 1
        Livros livro1 = new Livros("Java com pelos","Tommy Ramon");
        
        livro1.titulo = "Java com pelos";
        livro1.autor = "Tommy Ramon";
        livro1.paginas = 50;
        livro1.preco = 100.0;
        
        //System.out.print(livro1.toString());
        
        System.out.println("Autor: "+ livro1.autor );
        System.out.println("Titulo: "+ livro1.titulo);
        System.out.println("Paginas: " +livro1.paginas);
        System.out.println("Preço: "+ livro1.preco);
        
        //Livro 2
        Livros livro2 = new Livros("Java com pelos","Tommy Ramon");      
        livro2.titulo = "Java com pelos";
        livro2.autor = "Tommy Ramon";
        livro2.paginas = 50;
        livro2.preco = 100.0;
        
        System.out.println(livro1 == livro2);
        //Resultado dessa comparação dá false ,porque o programa vê que os livros estão em lugares diferentes na memoria e da false mesmo eles sendo iguais.
        
        
        
        Livros livro3 = livro1;
        
        System.out.println(livro3 == livro1);
        // O valor da true , pois agora os dois livros estão no mesmo local da memoria
    }
    
}
