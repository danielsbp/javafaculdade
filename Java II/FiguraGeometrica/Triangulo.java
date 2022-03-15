public class Triangulo implements FiguraGeometrica{
    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getLadoA() {
        return ladoA;
    }
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }
    public int getLadoB() {
        return ladoB;
    }
    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    public int getLadoC() {
        return ladoC;
    }
    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public String getNomeFigura() {
        return "Triângulo";
    }

    @Override
    public double getArea() {
        return (this.getBase()*this.getAltura())/2;
    }

    @Override
    public double getPerimetro() {
        return Double.parseDouble(this.getLadoA() + this.getLadoB() + this.getLadoC());
    }

}
