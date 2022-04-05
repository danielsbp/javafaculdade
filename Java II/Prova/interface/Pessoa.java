public abstract class Pessoa implements IPessoa{
    //List<String> testList = new ArrayList<String>();

    public String nome;
    public String cpf;
    public String dataNascimento;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public boolean adicionar() {
        return true;
    }

    public boolean excluir() {
        return true;
    }

    public int pesquisar() {
        return 0;
    }
    
}