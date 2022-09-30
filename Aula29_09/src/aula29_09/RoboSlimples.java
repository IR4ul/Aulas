package aula29_09;
public class RoboSlimples {
    //robo que anda pra alguma direção
    
    //atributo
    private char direcao;
    
    //metodo
    public void setDirecao(char letra){
        if(letra == 'n'||letra =='s'||letra =='l'||letra =='o' ) {
        this.direcao = letra; 
        }
        else{
        this.direcao = 'n';
        }
    }
}
