public class Gerente extends Funcionario {
    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticacao(int senhaInput) {
        if (senhaInput == this.getSenha()) {
            return true;
        }
        else {
            return false;
        }
    }
}
