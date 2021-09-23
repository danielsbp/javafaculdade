// Cria uma classe chamada Gerente herdando os atributos e métodos da classe Funcionario
public class Gerente extends Funcionario{
	// Declaração do atributo "totalDeBonus" como String e privado
    private String login;
	// Declaração do atributo "totalDeBonus" como String e privado
	private String senha;
	
    // Cria um método público chamado getLogin() que basicamente retorna o valor do atributo "login" da classe.
	public String getLogin() {
		return login;
	}
    // Cria um método público chamado setLogin com um parametro de nome login que será usado para atribuir um valor ao atributo "login" na classe.
	public void setLogin(String login) {
		this.login = login;
	}

    // Cria um método público chamado getSenha() que basicamente retorna o valor do atributo "senha" da classe.
	public String getSenha() {
		return senha;
	}
    // Cria um método público chamado setSenha com um parametro de nome senha que será usado para atribuir um valor ao atributo "senha" na classe.
	public void setSenha(String senha) {
		this.senha = senha;
	}
	// Cria um método publico chamado bonifica() que retorna o salário vezes 0.15, ou 15% do salário.	
	public double bonifica(){
		return this.salario * 0.15;
	}
	
	// Cria o método público sem retorno de valores com o nome autentica() que recebe dois valores de parâmtetros (login, senha)
	public void autentica(String login, String senha) {
        // Verifica se o login e senha passados como argumento são iguais ao login e senha do gerente.
		if((this.login == login) && (this.senha == senha)) {
            // Se sim, acesso permitido
			System.out.println("Acesso Permitido!");
		}else{
            // Se não, sem acesso.
			System.out.println("Acesso Negado!");
		}
	}
}
