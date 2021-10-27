public class Programa {
    public static void main(String args[]) {
       Operario op1 = new Operario();
       op1.setSalarioBase(3000);
       op1.setValorProducao(1000);
       op1.setComissao();

       System.out.println("Salário: "+op1.calcularSalario());
    }
}
