package aula.pkg13_10_;
public class Circulo extends FiguraGeometrica {
    private double raio;
    private double area;
    
    public double getRaio(){
        return this.raio;
    }
    
    public Circulo(String nome,double raio){
        super(nome);
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        area = (raio*raio)*Math.PI;
        return area;
        
    }

    


    
    
}
