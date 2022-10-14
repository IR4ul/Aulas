package aula.pkg13_10_;
public abstract class FiguraGeometrica {
    //atributo
    private String nome;
    
    //metodo acessor
     public String getNome(){
         return this.nome;
     }
     
    //construtor 
     public FiguraGeometrica(String nome){
     this.nome=nome;
     }
     
    //abstract é usado para classes abstratas (obviamente) e tabem para comportamentos.
    public abstract double calcularArea();
    
    
    
    
    
    
    
}
