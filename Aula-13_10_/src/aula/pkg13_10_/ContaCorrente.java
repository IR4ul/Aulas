package aula.pkg13_10_;
public class ContaCorrente {
 //Atributos
    
 private int numero;
 private double saldo;
 
 
 //Metodos Acessores
 
 public void SetNumero(int numero){
    this.numero=numero;
 }
 
 public int getNumero(){
    return this.numero;
 }
 
 public void setSaldo(double saldo){
     this.saldo=saldo;
 }
 
 public double getSaldo(){
     return this.saldo;
 }
 
 //Comportamentos
 public void depositar(double valor){
     this.saldo+=valor;
 }
 
 public void sacar(double valor){
     double testar = valor*1.005;
     if(testar <=this.saldo){
         this.saldo-=testar;
         System.out.println("Saque efetuado!");
     }else System.out.println("Saldo Insuficiente");
 }
 
 
 
}
