package aula_20_10_2022;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates ;
    private double altura,peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(double peso) {
        if(peso<60){
            this.categoria = "Leve";
        }else if(peso<70){
            this.categoria="Medio";
            
        }else{
            this.categoria="Pesado";
        }
        
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public Lutador(String nome,String nacionalidade , int idade,double altura, double peso,int vitorias , int derrotas , int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura=altura;
        this.peso=peso;
        this.vitorias=vitorias;
        this.derrotas=derrotas;
        this.empates=empates;
        setCategoria(peso);
    }
    
    public void apresentar(){
        System.out.print("Nome: "+ nome  + "\n"+
            "Nacionalidade: "+ nacionalidade+ "\n"+
            "Categoria: "+categoria + "\n"+
            "Idade: "+ idade + "\n"+
            "Altura: "+ altura +"\n"+
            "Peso: "+ peso + "\n"+
            "Vitorias: "+ vitorias + "\n"+
            "Derrotas: "+ derrotas + "\n"+
            "Empates: "+ empates + "\n");
    }
    public void ganharLuta(){
        vitorias+=1;
        System.out.println("Ganhou a Luta!");
    }
    
    public void perderLuta(){
        derrotas+=1;
        System.out.println("Perdeu a luta");
    }
    
    public void empatarLuta(){
        empates+=1;
    }
    
    public void status(){
        System.out.print("Nome: " + nome + "\n" +
                "Vitoria: "+ vitorias + "\n" +
                "Derrotas: "+ derrotas+ "\n"+
                "Empates: " + empates + "\n");
    }
   
}
