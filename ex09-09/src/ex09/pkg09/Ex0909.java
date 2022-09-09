//FAzer um programa em que o usuario entra com dois numeros reais e devolve ao usuario o resto de divisão destes dois numeros.Não pode usar %
package ex09.pkg09;
import java.util.Scanner;
public class Ex0909 { 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numeroUm = 0;
        double numeroDois = 0;
        double resultado = numeroUm/numeroDois;
        double resto;

        //edir os numeros para o usuario 
        System.out.println("Digite o dividendo");
        numeroUm = teclado.nextDouble();
        
        System.out.println("Digite o divisor");
        numeroDois = teclado.nextDouble();
        
        // Formula para descobrir o resto e printar na tela 
        resto = numeroUm - numeroDois * (int)(numeroUm / numeroDois);
        System.out.println("O resultado é " + resultado  + " é o resto é " + resto);
        
        
       
    }
    
}
