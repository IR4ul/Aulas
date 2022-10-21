package aula_20_10_2022;
public class Bala {
    private double posicaoX;
    private double posicaoY;
    int quantidade;

    public double getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(double posicaoX) {
        this.posicaoX = posicaoX;
    }

    public double getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(double posicaoY) {
        this.posicaoY = posicaoY;
    }
    
    public Bala(double x, double y){
        this.posicaoX=x;
        this.posicaoY=y;
    }
}
