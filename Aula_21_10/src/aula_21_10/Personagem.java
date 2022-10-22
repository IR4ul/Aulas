package aula_21_10;

import java.util.Random;

public class Personagem {

    //atributos
    String nome;

    int energia, fome, sono, comida;

//metodos - estao publicos por padrao
        void getStatus() {
            System.out.println("Energia: " + this.energia + "\nFome: " + this.fome + "\nSono: " + this.sono);
        }

        void setStatus(int energia, int fome, int sono) {
            this.energia = energia;
            this.fome = fome;
            this.sono = sono;
        }

        //comportamentos
        void cacar() {
            if (this.energia > 2) {
                this.energia -= 2;
                this.fome += 1;
                this.fome += 1;    
                if(random()==true)
                    System.out.println("Você achou 1 comida");
                    comida++; }else{
                System.out.println("Não pode cacar!");
            }

        }

        void comer() {
            if (this.fome > 1) {
                if(comida>=1)
                this.fome = 0;
                this.energia -= 1;
                this.sono += 2;
                this.comida--;
                } else {
                System.out.println("Não dá pra comer comer!");
            }
        }

        void dormir() {
            if (this.sono > 3) {
                this.sono = 0;
                this.energia += 10;
                this.fome += 2;
            } else {
                System.out.println("Não precisa dormir!");
            }
        }

        private boolean random() {
            Random random = new Random();
            return random.nextBoolean();

        }

        void sono(){
            if(this.sono>7){
                dormir();
                System.out.println("Voce desmaiou de sono");
            }
        }    
        boolean isVivo(){
                if(fome==10 && sono>7){
                    return true;
                    }else{
                    return false;
                }
            }

        //construtor - publico e void por padrao
        Personagem(String nome) {
            this.nome = nome;
        }
}

