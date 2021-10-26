public class Administrador extends Empregado {
    private double ajudaDeCusto;
    public double getAjudaDeCusto() {
        return this.ajudaDeCusto;
    }
    public void setAjudaDeCusto(double ajudaDeCusto){
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double calcularSalario(){
        return (this.getSalarioBase()+this.getAjudaDeCusto())-this.getImposto();
    }
}
