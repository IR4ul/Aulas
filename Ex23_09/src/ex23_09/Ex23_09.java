package ex23_09;
import java.util.Scanner;
import java.util.Random;
public class Ex23_09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random dado = new Random();
        
        
        double carteira;
        System.out.println("------------==------------");
        System.out.println("Digite o quanto Voce quer apostar");
        System.out.println("------------==------------");
        carteira = teclado.nextDouble();
        
        
        int dado1 = dado.nextInt(6);
        int dado2 = dado.nextInt(6);
        System.out.println("------------==------------");
        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println("------------==------------");        
        int soma = dado1 + dado2;
        
        for (int i=0;;i++){
            
            dado1 = dado.nextInt(6);
            dado2 = dado.nextInt(6);
            System.out.println("------------==------------");
            System.out.println("Valor dado 1: "+dado1);
            System.out.println("Valor dado 2: "+dado2);
            System.out.println("------------==------------");
            soma = dado1 + dado2;
            
            
            if(soma== 7 || soma ==2){
                System.out.println("------------==------------");
                System.out.println("Valor dado 1: "+dado1);
                System.out.println("Valor dado 2: "+dado2);
                System.out.println("Voçê ganhou!!");
                carteira = carteira*2;
                System.out.println("Seu saldo é"+ carteira);
                System.out.println("------------==------------");
            break;
            }

            if(soma == 10 ){
                System.out.println("------------==------------");
                System.out.println("Valor dado 1: "+dado1);
                System.out.println("Valor dado 2: "+dado2);
                System.out.println("Voçê Perdeu !!");
                carteira = 0;
                System.out.println("Seu saldo é"+ carteira);
                System.out.println("------------==------------");
            break;
            }

            if(soma == 6){
                System.out.println("------------==------------");    
                System.out.println("Valor dado 1: "+dado1);
                System.out.println("Valor dado 2: "+dado2);
                System.out.println("Voçê Empatou!");
                System.out.println("Seu saldo é"+ carteira);
                System.out.println("------------==------------");
            break;
            }

            else{
                System.out.println("------------==------------");
                System.out.println("Valor dado 1: "+dado1);
                System.out.println("Valor dado 2: "+dado2);
                System.out.println("------------==------------");
            }
        }       
    }   
}
