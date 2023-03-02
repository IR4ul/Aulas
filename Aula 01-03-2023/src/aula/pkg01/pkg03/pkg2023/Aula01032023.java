package aula.pkg01.pkg03.pkg2023;
import java.util.Scanner;
public class Aula01032023 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*char gabarito[]=new char[5];
        gabarito[0]='A';
        gabarito[1]='b';
        gabarito[2]='c';
        gabarito[3]='d';
        gabarito[4]='e';
        
        int notaAluno=0;
        System.out.println("Digite a note do aluno");
        notaAluno = entrada.nextInt();
        for (int i = 0; i < 5; i++) {
            
            if (notaAluno == 10){
            System.out.println(gabarito[0])}
            
            if (notaAluno == 8){
            System.out.println(gabarito[1])}
            
            if (notaAluno == 6){
            System.out.println(gabarito[2])}
            
            if (notaAluno == 4){
                System.out.println(gabarito[3])}
            
            if (notaAluno <= 2){
            System.out.println(gabarito[4])}
        }*/
        
        
        double n1[]=new double[15];
        double n2[]=new double[15];
        double notamedia[]= new double[15];
        
        for (int i = 0; i < 15; i++) {
        System.out.println("Digite a Nota N1 do Aluno do "+(i+1)+"º Aluno");
        n1[i]= entrada.nextDouble(); 
        }
        for (int i = 0; i < 15; i++) {
        System.out.println("Digite a Nota N2 do Aluno do "+(i+1)+"º Aluno");
        n2[i]= entrada.nextDouble(); 
        }
        
        for (int i = 0; i < 15; i++) {
            notamedia[i]=0.4*n1[1]+0.6*n2[i];
            System.out.println("A nota do "+(i+1)+"º Aluno é"+notamedia[i]);
        } 
    }  
}
