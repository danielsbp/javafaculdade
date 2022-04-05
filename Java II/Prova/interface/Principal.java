public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        aluno.setNome("João");
        aluno.setDataNascimento("30/03/2002");
        aluno.setCpf("4321");

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
        System.out.println("CPF: "+aluno.getCpf());
        // Adicionar do aluno: Notas
        aluno.adicionar(10);
        aluno.adicionar(9);
        aluno.adicionar(7);

        System.out.println("Notas do aluno " + aluno.getNome() + ": " + aluno.getNotas());
        
    }
}
