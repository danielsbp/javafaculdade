public class Filme {
    // Declaração do atributo "codigo" como inteiro e privado
	private int codigo;
    // Declaração do atributo "nome" como inteiro e privado
	private String nome;
    // Declaração do atributo "valor" como numero flutuante do tipo double e privado
	private double valor;
    // Declaração do atributo "disponivel" como booleano e privado
	private boolean disponivel;

    // Cria um método público chamado getCodigo que basicamente retorna o valor do atributo "codigo" da classe.
	public int getCodigo() {
		return codigo;
	}
    // Cria um método público chamado setCodigo com um parametro de nome codigo que será usado para atribuir um valor ao atributo "codigo" na classe.
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

    // Cria um método público chamado getNome que basicamente retorna o valor do atributo "nome" da classe.
	public String getNome() {
		return nome;
	}

    // Cria um método público chamado setNome com um parametro de nome codigo que será usado para atribuir um valor ao atributo "codigo" na classe.
	public void setNome(String nome) {
		this.nome = nome;
	}
    // Cria um método público chamado getValor que basicamente retorna o valor do atributo "valor" da classe.
	public double getValor() {
		return valor;
	}

    // Cria um método público chamado setValor com um parametro de nome valor que será usado para atribuir um valor ao atributo "valor" na classe.
	public void setValor(double valor) {
		this.valor = valor;
	}

    // Cria um método público chamado isDisponivel que basicamente retorna o valor do atributo "disponivel" da classe
	public boolean isDisponivel() {
		return disponivel;
	}

    // Cria um método público chamado setDisponivel com um parametro de nome valor que será usado para atribuir um valor ao atributo "disponivel" na classe.
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

    // Cria um método publico que retorna vazio chamado retirar()
	public void retirar() {
		if(disponivel == true) {
			disponivel = false;
		}else{
			throw new RuntimeException("Este filme não está disponível para locação!");
		}
				
	}
    
    // Cria um método publico que retorna vazio chamado devolver()
	public void devolver() {
        // Atribui valor true à variavel booleana "disponivel"
		disponivel = true;
	}
	
    
    // Cria um método publico que retorna vazio chamado mostra()
	public void mostra(){
        //Print para mostrar o código do filme ao usuário:
		System.out.println("Código do filme:" + this.codigo);
        //Print para mostrar o nome do filme ao usuário:
		System.out.println("Nome do filme:" + this.nome);
        //Print para mostrar o valor do empréstimo do filme ao usuário:
		System.out.println("Valor: R$" + this.valor);	
        //Print para mostrar a disponibilidade de empréstimo do filme ao usuário:	
		System.out.println("Disponível:" + this.disponivel);
	}
	

}
