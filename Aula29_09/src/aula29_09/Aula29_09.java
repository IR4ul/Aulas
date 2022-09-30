package aula29_09;
public class Aula29_09 {
    public static void main(String[] args) {
      Funcionario f1 = new Funcionario();
      Gerente g1 = new Gerente();
      
      f1.setNome("Leandro");
      f1.setCargo("Professor");
      f1.setSalario(1000);
        System.out.println(f1.toString());
      
      g1.atualizar(f1,500);
        System.out.println(f1.toString());
      g1.atualizar(f1,"Vendedor");
        System.out.println(f1.toString());
    }  
}
