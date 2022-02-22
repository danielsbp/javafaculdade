public class Principal {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        empregado.setNome("Daniel");
        empregado.setEndereco("Rua Quadrado, Pompeia-SP");
        empregado.setTelefone("46357467");
        empregado.setSalario(15000);

        Empregado empregado2 = new Empregado();

        empregado2.setNome("João");
        empregado2.setEndereco("Marilia");
        empregado2.setTelefone("5436346");
        empregado2.setSalario(1000.9);
        System.out.println(empregado.getNome());
    }
} 
