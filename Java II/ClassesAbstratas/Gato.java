public class Gato {
    public String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String amamentar() {
        return "Amamentando gato...";
    }

    @Override
    public String emitirSom() {
        return "MIAAAAAAAAAAAAAAAAAAAAAAAAAAAAU!";
    }

}
