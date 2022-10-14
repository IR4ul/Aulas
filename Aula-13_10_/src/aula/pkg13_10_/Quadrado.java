package aula.pkg13_10_;
public class Quadrado extends FiguraGeometrica {
    
    
private double lado;

public double getLado(){
    return this.lado;
}

public Quadrado(String nome,double lado){
    super(nome);
    this.lado = lado;
    
}
@Override
public double calcularArea(){
    return lado*lado;
}
}
