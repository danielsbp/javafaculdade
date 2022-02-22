// Inicializa a classe Programa
public class Programa {
    // Cria o método principal da classe Programa o declarando como publico, estático, com retorno vazio e com nome main, além de utilizar a classe String no formato de vetor e a variavel main como parametros.
	public static void main(String[] args) {
        // Instancia o objeto "j" com a classe Filme
		Filme f = new Filme();
        // Utiliza o método setter do atributo "codigo" do objeto 'f' para atribuir a ele o valor de 123
		f.setCodigo(123);
        // Utiliza o método setter do atributo "nome" do objeto 'f' para atribuir a ele o valor de "A Era do Gelo"
		f.setNome("A Era do Gelo");
		 // Utiliza o método setter do atributo "valor" do objeto 'f' para atribuir a ele o valor de 2.5
        f.setValor(2.50);
        // Executa o método devolver() do objeto "f"
		f.devolver();
		
        // Executa o método mostra() do objeto "f"
		f.mostra();
		
        // Executa o método retirar() do objeto "f"
		f.retirar();
		
        // Executa o método mostra() do objeto "f"
		f.mostra();
		
        // Abertura de uma estrutura try-catch para o tratamento de um possível erro do método retirar() do objeto "f"
		try {
            // Executa o método retirar() do objeto "f"
			f.retirar();
		}
        // Caso aconteça um erro na execução da linha de cima, o bloco de código catch é chamado com o argumento do objeto de erro que ocorreu
        catch (RuntimeException e) {
            // Mostra o erro para o programador
			System.out.println(e.getMessage());
		}
		
		
	}
}
