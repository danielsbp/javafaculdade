// Cria uma classe abstrata chamada Funcionario
public abstract class Funcionario {
    // Cria um atributo do tipo String e protegido na classe Funcionario com o nome "nome"
	protected String nome;
    // Cria um atributo do tipo String e protegido na classe Funcionario com o nome "departamento"
	protected String departamento;
    // Cria um atributo do tipo Double e protegido na classe Funcionario com o nome "salario"
	protected double salario;
    // Cria um atributo do tipo String e protegido na classe Funcionario com o nome "dataDeEntrada"
	protected String dataDeEntrada;
    // Cria um atributo do tipo String e protegido na classe Funcionario com o nome "rg"
	protected String rg;
    // Cria um atributo do tipo Boolean e protegido na classe Funcionario com o nome "estaNaEmpresa"
	protected boolean estaNaEmpresa;
	
    // Getter do atributo "nome"
	public String getNome() {
		return nome;
	}
    
    // Setter do atributo "nome"
	public void setNome(String nome) {
		this.nome = nome;
	}
    
    // Getter do atributo "departamento"
	public String getDepartamento() {
		return departamento;
	}

    // Setter do atributo "departamento"
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

    
    // Getter do atributo "salario"
	public double getSalario() {
		return salario;
	}
    
    // Setter do atributo "salario"
	public void setSalario(double salario) {
		this.salario = salario;
	}
    
    // Getter do atributo "dataDeEntrada"
	public String getDataDeEntrada() {
		return dataDeEntrada;
	}

    // Setter do atributo "dataDeEntrada"
	public void setDataDeEntrada(String dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
    
    // Getter do atributo "rg"
	public String getRg() {
		return rg;
	}
    
    // Setter do atributo "rg"
	public void setRg(String rg) {
		this.rg = rg;
	}

    
    // Getter do atributo "estaNaEmpresa"
	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}
    
    // Setter do atributo "estaNaEmpresa"
	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}
	
    
    // Criação de um método público de retorno vazio que diminui 6% do valor passado como parametro para ele.
	public void calculaSalario(double valor) {
		this.salario = valor - (valor * 0.06);
	}

    // Criação de um método público de retorno vazio que diminui 6% do 1º valor passado como parametro para ele e aumenta de acordo com o segundo valor passado como parametro.
	
    public void calculaSalario(double valor, double horaExtra) {
		double valorHorasExtra = (valor/30) / 8 * horaExtra;
		this.salario = valor - (valor*0.06) + valorHorasExtra;
	}
    // Criação de um método público que retorna o salário do funcionário menos 6%.
	public double  calculaSalario() {
		return this.salario = this.salario - (this.salario * 0.06);
	}

    // Criação de um método público que retorna o salário do funcionário mais 10%.
	public double bonifica(){
		return this.salario * 0.10;
	}
	
    // Demite o funcionario passando o valor false para o atributo estaNaEmpresa
	public void demite() {
		estaNaEmpresa = false;
	}

    // Calcula o ganho anual fazendo o salário vezes 12.
	public double calculaGanhoAnual() {
		return salario * 12;
	}	
}