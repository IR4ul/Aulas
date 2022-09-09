package ex3.pkg08.pkg09;
import java.util.Scanner;
public class Ex30809 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      int vetorA[] = new int [4]; 
      int vetorB[] = new int [7];
      int vetorC[] = new int [11];
      
      for (int i = 0; i<4;i++){
          System.out.println("Digite o " +(i+1)+ "º valor");
          vetorA[i] = teclado.nextInt();
          teclado.close();
        }
      for (int i = 0; i<7;i++){
          System.out.println("Digite o " +(i+1)+ "° valor");
          vetorB[i] = teclado.nextInt();
          teclado.close();
        }
      for(int i = 0;i<11;i++){
        if(i<4){
          vetorC[i] = vetorA[i];
        }
        else
        vetorC[i] = vetorB[i];
      }
    }
}
