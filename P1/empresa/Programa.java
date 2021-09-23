// Inicializa a classe Programa
public class Programa {
    // Cria o método principal da classe Programa o declarando como publico, estático, com retorno vazio e com nome main, além de utilizar a classe String no formato de vetor e a variavel main como parametros.
	public static void main(String[] args) {
		// Instancia o objeto 'v' pela classe Vendedor
		Vendedor v = new Vendedor();
        // "seta" o valor "10/01/2010" no atributo dataDeEntrada do objeto "v"
		v.setDataDeEntrada("10/01/2010");
        // "seta" o valor "Vendas" no atributo departamento do objeto "v"
		v.setDepartamento("Vendas");
        // "seta" o valor "true" no atributo estaNaEmpresa do objeto "v"
		v.setEstaNaEmpresa(true);
        // "seta" o valor "Eduardo" no atributo nome do objeto "v"
		v.setNome("Eduardo");
        // "seta" o valor "45" no atributo rg do objeto "v"
		v.setRg("45");
		//v.calculaSalario();		
		 
		// Instancia o objeto g1 pela classe Gerente
		Gerente g1 = new Gerente();
        // Atribui "vendas" ao atributo departamento do objeto g1
		g1.departamento = "Vendas";
        // Atribui "03/02/1990" ao atributo dataDeEntrada do objeto g1
		g1.dataDeEntrada = "03/02/1990";
        // Atribui "true" ao atributo estaNaEmpresa do objeto g1
		g1.estaNaEmpresa = true;
        // Atribui "Eric" ao atributo nome do objeto g1
		g1.nome = "Eric";		
        // Atribui "48" ao atributo rg do objeto g1
		g1.rg = "48";
        // Atribui "3500.0" ao atributo salario do objeto g1
		g1.salario = 3500.0;
		//g1.calculaSalario();
		
		// Utiliza encapsulamento para setar o valor 'eric' no login e o valor "123" na senha
		g1.setLogin("eric");
		g1.setSenha("123");
		
        // Instancia o objeto supervisor usando a clase Supervisor
		Supervisor supervisor = new Supervisor();
        // Atribui 5000.0 ao atributo salario
		supervisor.salario = 5000.0;
		
        // Cria um objeto chamado controle com a classe ControleDeBonificacao
		ControleDeBonificacao controle = new ControleDeBonificacao();
        // Executa o método calculaTotalDeBonus do objeto controle passando como argumento o objeto "v"
		controle.calculaTotalDeBonus(v);
        // Executa o método calculaTotalDeBonus do objeto controle passando como argumento o objeto "g1"
		controle.calculaTotalDeBonus(g1); 
        // Executa o método calculaTotalDeBonus do objeto controle passando como argumento o objeto "supervisor"
		controle.calculaTotalDeBonus(supervisor);
			
        //Prints dos atributos do objeto "v"
		System.out.println(v.getDataDeEntrada());
		System.out.println(v.getDepartamento());
		System.out.println(v.getNome());
		System.out.println(v.getRg());
		System.out.println(v.getSalario());
		System.out.println(v.isEstaNaEmpresa());
		System.out.println(v.bonifica());
		
		// Enfeite para o software CLI
		System.out.println("//////////////////////////////");
		// Executa o método autentica() do objeto g1 passando como argumento a senha errada
        g1.autentica("eric", "124");
        // Prints para mostrar os valores dos atributos de g1
		System.out.println(g1.getDataDeEntrada());
		System.out.println(g1.getDepartamento());
		System.out.println(g1.getNome());
		System.out.println(g1.getRg());
		System.out.println(g1.getSalario());		
		System.out.println(g1.bonifica());
		
		// Printa o total de bonus.
		System.out.println("Total de bonus: R$" + controle.getTotalDeBonus());
		
		
		
		
		
		
		
		
	}
}

/*





*/

