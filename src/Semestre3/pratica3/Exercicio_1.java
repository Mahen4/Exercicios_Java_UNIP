package pratica3;

/*Exerc�cio 1) Considere um sistema que ir� gerenciar uma loja de venda de carros. Crie ao menos 
duas classes para representar dois conjuntos de objetos distintos que possam existir dentro desse 
contexto. Para cada classe, � necess�rio que ao menos elas possuam seis atributos relevantes ao 
contexto que est�o aplicadas. Em rela��o aos m�todos, � necess�rio que elas possuam ao 
menos dois m�todos cada.*/

public class Exercicio_1 {

	Carro Carro1 = new Carro("KAJ0I81", "Wolksvagem", "Gol", 30000, 5, true, true);
	
	Funcionario Funcionario1 = new Funcionario("123.456.789-01", "Jo�o", 30, "Aux. Administrativo", "Administra��o", true);
	
}


class Carro{
	
	String placa;
	String fabricante;
	String modelo;
	int quilometragem;
	int tanque;
	boolean completo;
	boolean flex;
	
	public Carro(String placa, String fabricante, String modelo, int quilometragem, int tanque, boolean completo,
		boolean flex) {
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.quilometragem = quilometragem;
		this.tanque = tanque;
		this.completo = completo;
		this.flex = flex;
	}
	
	void andarDeCarro(int KM) {
		
		quilometragem += KM;
		
	}
	
	void abastecerAlcool(int litros) {
		
		if(flex == true) {
			tanque += litros;
		}
		
	}
	
}

class Funcionario{
	
	String cpf;
	String nome;
	int idade;
	String cargo;
	String setor;
	boolean terceirizado;
	
	public Funcionario(String cpf, String nome, int idade, String cargo, String setor, boolean terceirizado) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.setor = setor;
		this.terceirizado = terceirizado;
	}

	void moverSetor(String novoSetor){
		setor = novoSetor;
	}
	
	void promocao(String novoCargo){
		cargo = novoCargo;
	}
	
}