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

        professor.setNome("Isaque");
        professor.setCpf("1234");
        professor.setDataNascimento("29/06/1989");

        System.out.println("");

        System.out.println("Professor: " + professor.getNome());
        System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
        System.out.println("CPF: "+aluno.getCpf());
        // Adicionar do professor adiciona turmas
        professor.adicionar("3ªA");
        professor.adicionar("2ªB");
        professor.adicionar("1ªD");

        System.out.println("Turmas do professor: " + professor.getNome() + ": " + professor.getTurmas());
    }
}
