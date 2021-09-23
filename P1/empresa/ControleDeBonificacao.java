// Inicia a classe ControleDeBonificacao
public class ControleDeBonificacao {
    // Declaração do atributo "totalDeBonus" como numero flutuante do tipo double e privado
	private double totalDebonus;
	// Cria um método público chamado getTotalDeBonus() que basicamente retorna o valor do atributo "totalDeBonus" da classe.
    public double getTotalDeBonus() {
		return this.totalDebonus;
	}
	// Cria um método público com o nome CalculaTotalDeBonus que recebe um objeto do tipo Funcionario como parametro
	public double calculaTotalDeBonus(Funcionario f) {
        // Atribui ao totalDeBonus o valor dele mesmo somado à bonificação do funcionário "f"
		return this.totalDebonus = this.totalDebonus + f.bonifica();
	}
}