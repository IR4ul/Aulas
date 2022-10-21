package aula_20_10_2022;
import java.util.Scanner;
public class Canhao {
    Scanner entrada = new Scanner(System.in);
    //Bala bala = new Bala();
    private Bala bala;
    double local, posicaoXfinal;
    
   
    
    public void setBala(Bala bala){
        this.bala=bala;
    }
    
    public Bala getBala(){
        return this.bala;
    }
    
    public void disparar(double velocidade, double angulo){
       posicaoXfinal= velocidade * velocidade *(Math.sin(Math.toRadians(angulo)/9.81));
        System.out.println("Bala disparada!!");
    }
    
    public void getAlcanceMaxixo(){
        double local = posicaoXfinal + bala.getPosicaoX();
        System.out.println("O Alcance Máximo foi "+ local);
    }
    
    
    
    
    
}
