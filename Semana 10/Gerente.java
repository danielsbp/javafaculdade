public class Gerente extends Funcionario{
    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonificacao() {
        return this.salario * 0.15;
    }

    public boolean autenticacao(int senha) {
        if(this.senha == senha) {
            System.out.println("Acesso permitido!");
            return true;
        }
        else {
            System.out.println("Acesso negado!");
            return false;
        }
    }
}
