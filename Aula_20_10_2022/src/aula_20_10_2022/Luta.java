package aula_20_10_2022;
public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds ,ado=0, ade=0;
    private boolean aprovada;

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    public void marcarLuta(Lutador desafiante, Lutador desafiado){
            if(desafiante.equals(desafiado)||(desafiante.getCategoria()!=desafiado.getCategoria())){
                System.out.println("Luta Negada!");
                this.aprovada=false;
            }else{
                System.out.println("Luta Aprovada");
                this.aprovada=true;
            }
    }
    
    public void lutar(int rounds){
        if(aprovada){
            for (int i = rounds ; i >= 0; i--) {
                int A =(int)Math.random()*2;
                    if(A==0){
                       ado++;
                        System.out.println("Vitoria do Desafiante");
                            }if(A==1){
                            ade++;
                            System.out.println("Vitoria do Desafiado");
                            }else{
                            System.out.println("Empate!");
                            }    
            }
            if(ado>ade){
            desafiante.ganharLuta();
            desafiado.perderLuta();
            }
            if(ado<ade){
            desafiante.perderLuta();
            desafiado.ganharLuta();
            }
            if(ado==ade){
            desafiante.empatarLuta();
            desafiado.empatarLuta();
            }
        }
    }
}
