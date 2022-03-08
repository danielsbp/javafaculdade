public class Cachorro extends Mamifero{
    public String tamanho;
    public String raca;

    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String amamentar() {
        return "Amamentando cachorro...";
    }

    @Override
    public String emitirSom() {
        return "AU AU!";
    }

}
