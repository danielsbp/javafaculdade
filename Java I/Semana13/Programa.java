public class Programa {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        Professor p = new Professor();

        //Dados do aluno
        a.setNome("Éric Ruan");
        a.setEndereco("Rua do limão");
        a.setTelefone("14-99988-7766");
        a.setCpf("111.222.333-44");

        //Notas do aluno
        a.setCursos("BigData no Agronegócio");
        a.setNota1(9.0);
        a.setNota2(8.0);
        
        //Prints
        System.out.println("O aluno: ");
        System.out.println(a.getNome());
        System.out.println(a.getEndereco());
    }
}