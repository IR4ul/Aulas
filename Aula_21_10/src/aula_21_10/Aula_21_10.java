package aula_21_10;
import java.util.Scanner;
import java.util.Random;
public class Aula_21_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu Nome!!");
        Personagem perso = new Personagem(entrada.next());
       
        String nomeChar, classes,opcao;
        
        boolean status = true;
        
            System.out.println(perso.nome + ", digite o nome do seu seu personagem: ");
            nomeChar = entrada.next();
            while (status){
            System.out.println("Bem vindo, " + nomeChar + " !");

            System.out.print(nomeChar + ", escolha uma das classes: " + "\n1-cacador "+
                                                                        "\n2-comilao "+
                                                                        "\n3-soneca");
            classes = entrada.next();

            switch (classes) {
                case "1":
                    System.out.println("----------------");
                    System.out.println("Cacador escolhido!");
                    System.out.println("----------------");
                    perso.setStatus(10, 0, 0);
                    perso.getStatus();
                    break;
                case "2":
                    System.out.println("----------------");
                    System.out.println("Comilao escolhido!");
                    System.out.println("----------------");
                    perso.setStatus(6, 5, 2);
                    perso.getStatus();
                    break;
                case "3":
                    System.out.println("----------------");
                    System.out.println("Soneca escolhido!");
                    System.out.println("----------------");
                    perso.setStatus(1, 4, 7);
                    perso.getStatus();
                    break;
                default:
                    System.out.println("----------------");
                    System.out.println("Opcao invalida!");
                    System.out.println("----------------");
                }
        }
        while(!status){    
            System.out.println(nomeChar + ", digite o que desejar realizar: "+
                                                                                "\n1-cacar"+ 
                                                                                "\n2-comer"+
                                                                                "\n3-dormir");
            opcao = entrada.next();

            switch (opcao) {
                case "1":
                    perso.cacar();
                    perso.getStatus();
                    break;
                case "2":
                    perso.comer();
                    perso.getStatus();
                    break;
                case "3":
                    perso.dormir();
                    perso.getStatus();
                    break;
                default:
                    System.out.println("----------------");
                    System.out.println("Opcao invalida!");
                    System.out.println("----------------");       
            }
            
            if(perso.fome==10){
                System.out.println("Voce Morreu Otario!!");
                break;
            }
            if(perso.sono==7){
                perso.dormir();
            }
            
            entrada.close();
        }
    }   
}
