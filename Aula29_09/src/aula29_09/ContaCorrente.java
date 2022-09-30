package aula29_09;
public class ContaCorrente {
    //atributos
    private int numero;
    private double saldo;
    private String nome;
    
    //metodos
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
    return numero;
    }
    
    public void setSaldo(double saldo){
    this.saldo= saldo; 
    }
    
    public double getSaldo(){
    return saldo;
    }
    
    public void setNome(String nome){
    this.nome = nome;
    }
    
    public String getNome(){
    return nome;
    }
    
    public void Depositar(double valor){
    saldo +=valor*1.1;
    }
    
    
    
    
}
