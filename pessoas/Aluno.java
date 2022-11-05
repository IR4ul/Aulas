package pessoas;
import java.util.ArrayList;

public class Aluno extends Pessoa {
    int matricula;
    ArrayList<String> cursos = new ArrayList<>();

    
    public Aluno (String nome){
        // super e para atribuir o nome para a classe mãe/superclasse
        super(nome);
    }
    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }
    
    public ArrayList<String> getCursos(){
        this
    }
}
