import java.util.ArrayList;

public class Aluno extends Pessoa{
    List<Int> notas = new ArrayList<Int>();

    public List<Int> getNotas() {
        return notas;
    }

    public void setNotas(List<Int> notas) {
        this.notas = notas;
    }
    @Override
    public void adicionar(Int nota) {
        notas.add(nota);
    }
    @Override
    public void excluir(Int notaInput) {
        int index = -1;
        for (ArrayList nota : notas) {
            index++;
            if (nota == notaInput) {
                notas.remove(index);
            }
        }
    }
    @Override
    public int pesquisar(int index) {
        return notas[index];
    }
}
