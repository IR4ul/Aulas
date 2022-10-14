package aula.pkg13_10_;
public class ContaEspecial extends ContaCorrente {
    //entends é usado para Herança
    
    //@override é usado para sobresecrever um metodo
    @Override
    public void sacar(double valor){
        //Super é um "this" para acessar em outras classes 
         double testar = valor*1.001;
     if(testar <=super.getSaldo()){
         super.setSaldo(super.getSaldo()-testar);
         System.out.println("Saque efetuado!");
     }else System.out.println("Saldo Insuficiente");
    }
}
