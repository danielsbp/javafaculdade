import java.util.ArrayList;

public class Professor extends Pessoa{
    List<String> turmas = new ArrayList<String>();
    @Override
    public void adicionar(String turma) {
        notas.add(nota);
    }
    @Override
    public void excluir(String turmasInput) {
        int index = -1;
        for (ArrayList turma : turmas) {
            index++;
            if (turma == turmaInput) {
                turmas.remove(index);
            }
        }
    }
    @Override
    public int pesquisar(int index) {
        return turmas[index];
    }
}
