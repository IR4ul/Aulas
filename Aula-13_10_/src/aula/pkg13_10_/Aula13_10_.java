package aula.pkg13_10_;
public class Aula13_10_ {
    public static void main(String[] args) {
     //EX 1
     /* 
     ContaCorrente cc = new ContaCorrente();
     ContaEspecial ce = new ContaEspecial();
     
     cc.depositar(100);
     System.out.println(cc.getSaldo());
     cc.sacar(90);
     System.out.println(cc.getSaldo());
     ce.depositar(100);
     System.out.println(ce.getSaldo());
     ce.sacar(90);
     System.out.println(ce.getSaldo());
     */
     
     //EX2
     Circulo c = new Circulo("Circulo",10);
     Quadrado q = new Quadrado("Quadrado",10);
     Triangulo t = new Triangulo("Triangulo",10,10);
     
     
     System.out.println(c.getNome() +" : "+ c.calcularArea());
     System.out.println(q.getNome() +" : "+ q.calcularArea());
     System.out.println(t.getNome() +" : "+ t.calcularArea());
       
    }
    
}
