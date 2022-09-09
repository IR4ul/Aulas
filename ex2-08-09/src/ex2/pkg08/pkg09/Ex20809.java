package ex2.pkg08.pkg09;
import java.util.Scanner;
public class Ex20809 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
      int numeros[] = new int [8]; //Vetor com os indices determinados
      int multiplos[] = new int [8];
      //Laço de repetição para atribuir valores para cada indice 
      for (int i = 0; i<8;i++){
          System.out.println("Digite o " +(i+1)+ " valor");
          numeros[i] = teclado.nextInt();
          multiplos[i] = numeros[i]*3;
    }
      
     
      for(int i = 0; i<=8;i++){
          System.out.println(multiplos[i]);
      }
      teclado.close();
        System.out.println("FIM");
    }
}
