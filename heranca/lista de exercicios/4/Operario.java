public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public void setValorProducao(double valorProducao){
        this.valorProducao = valorProducao;
    }
    public double getValorProducao(){
        return this.valorProducao; 
    }

    public void setComissao() {
        this.comissao = (this.valorProducao/100)*10;
    }
    public double getComissao(){
        return this.comissao;
    }

    public double calcularSalario() {
        return getComissao() + getSalarioBase() - getImposto();
    }
}
