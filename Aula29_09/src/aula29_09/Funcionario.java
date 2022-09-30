package aula29_09;
public class Funcionario {
    private String nome;
    private String cargo;
    private double salario; 
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
    return nome;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    
    }
    public String getCargo(){
    return cargo;
    }
    
    public void setSalario(double salario){
    this.salario = salario;
    }
    
    public String toString(){
        return "Nome:" + this.nome +
                "\nCargo:" + this.cargo +
                "\nSalario: " + this.salario;
    }
    
}
