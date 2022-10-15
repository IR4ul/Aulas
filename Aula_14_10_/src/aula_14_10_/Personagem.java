package aula_14_10_;
public class Personagem {
    String nome;
    int energia, fome, sono;
    /*
    public String getNome() {
        return nome;
    }
    public int getEnergia() {
        return energia;
    }
    public int getFome() {
        return fome;
    }
    public int getSono() {
        return sono;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public void setFome(int fome) {
        this.fome = fome;
    }
    public void setSono(int sono) {
        this.sono = sono;
    }
    */
    
    public Personagem(String nome){
        this.nome = nome;
    }
    
    public void getStatus(){
        System.out.println("Energia: " + energia + " Fome: " + fome + " Sono: " + sono);
    }
    
    public void cacar(){
        if(this.energia>2){
            this.energia -= 2;
            this.sono += 1;
            this.fome +=1;
            System.out.println("Está caçando ");
        }else{
            System.out.println("Seu Personagem está cansado!");
        }
    }
    
    public void comer(){
        if(this.fome>1){
            this.fome =0;
            this.sono+=2;
            this.energia-=1;
            System.out.println("Está comendo");
        }else{
            System.out.println("Você Não está com Fome");
        }
    }
    
    public void dormir(){
        if(this.sono>3){
        this.sono=0;
        this.energia+=10;
        this.fome+=2;
        System.out.println("A mimir");
        }else{
            System.out.println("Você não está com sono");
        }
    }
}
    
