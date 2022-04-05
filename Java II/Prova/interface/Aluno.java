
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    List<Integer> notas = new ArrayList<Integer>();

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public void adicionar(int nota) {
        notas.add(nota);
    }
    public void excluir(int notaInput) {
        int index = -1;
        for (int nota : notas) {
            index++;
            if (nota == notaInput) {
                notas.remove(index);
            }
        }
    }
    public int pesquisar(int index) {
        return notas.get(index);
    }
}
