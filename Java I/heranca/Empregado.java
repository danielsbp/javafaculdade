public class Empregado extends Pessoa {
    private int codigoSetor;
    public int getCodigoSetor(){
        return codigoSetor;
    }
    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor = codigoSetor;
    }

    private double salarioBase;
    public double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    private double imposto;
    public double getImposto() {
        return imposto;
    }
    public void setImposto(double imposto){
        this.imposto = imposto;
    }

}