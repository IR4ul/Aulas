package aula_14_10_;
import java.util.Scanner;
public class Jogo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do Seu personagem!!");
        Personagem p = new Personagem(teclado.next());
       
        
        p.energia = 3;
        p.fome = 2;
        p.sono= 4;
        
        p.getStatus();
        
        p.cacar();
        p.getStatus();
        p.comer();
        p.getStatus();
        p.dormir();
        p.getStatus();
        
        
    }
    
}
