package aula29_09;
public class Gerente {
    private String nome;
    
    
    public void setNome(String nome){
    this.nome = nome;
    }
    
    public String getNome(){
    return nome;
    }
    
    public void atualizar(Funcionario aux,String cargo){
    aux.setCargo(cargo);
    }
    public void atualizar(Funcionario aux,double salario){
    aux.setSalario(salario);
    }
}
