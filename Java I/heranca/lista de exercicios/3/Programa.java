public class Programa {
    public static void main(String args[]) {
        Administrador adm = new Administrador();
        adm.setAjudaDeCusto(3000);
        adm.setSalarioBase(10000);
        adm.setImposto(400);

        double salario = adm.calcularSalario();

        System.out.println("Salário: "+ salario);
    }
}
