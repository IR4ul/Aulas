package exaula08.pkg09;
import java.util.Scanner;
public class ExAula0809 {

    
  public static void main(String[] args) {
      
  
      Scanner teclado = new Scanner(System.in);
      int numeros[] = new int [10]; //Vetor com os indices determinados
      int indice = 0;
      //Laço de repetição para atribuir valores para cada indice 
      for (int i = 0; i<10;i++){
          System.out.println("Digite o " +(i+1)+ " valor");
          numeros[i] = teclado.nextInt();
      }
       int menorNum = numeros[0];
      for (int i = 0; i < 10 ; i++){
          if(numeros[i] < menorNum){
              menorNum = numeros[i];
              indice = i;
          }
      }

      System.out.println("O menor numero e : " +menorNum + " e o indice é " + indice);
    
    }

}