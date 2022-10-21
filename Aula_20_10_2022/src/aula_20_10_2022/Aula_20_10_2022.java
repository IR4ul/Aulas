package aula_20_10_2022;
import java.util.Scanner;
public class Aula_20_10_2022 {
    public static void main(String[] args) {
       Canhao cn = new Canhao();
       Bala b1 = new Bala(10,10);
       
       cn.setBala(b1);
       cn.disparar(10,10);
       cn.getAlcanceMaxixo();
       
    }
    
}
