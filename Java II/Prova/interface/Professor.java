import java.util.ArrayList;
import java.util.List;
public class Professor extends Pessoa{
    List<String> turmas = new ArrayList<String>();
    
    public void adicionar(String turma) {
        turmas.add(turma);
    }
    
    public List<String> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<String> turmas) {
        this.turmas = turmas;
    }

    public void excluir(String turmaInput) {
        int index = -1;
        for (String turma : turmas) {
            index++;
            if (turma == turmaInput) {
                turmas.remove(index);
            }
        }
    }
    
    public String pesquisar(int index) {
        return turmas.get(index);
    }
}
