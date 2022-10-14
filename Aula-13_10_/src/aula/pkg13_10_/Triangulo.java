package aula.pkg13_10_;
public class Triangulo extends FiguraGeometrica {
    private double base,altura;
    
    private double getBase(){
        return this.base;
    }
    private double getAltura(){
        return this.altura;
    }
    public Triangulo(String nome ,double base,double altura){
            super(nome);
            this.base=base;
            this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return this.base*this.altura/2;
    }
    
}
