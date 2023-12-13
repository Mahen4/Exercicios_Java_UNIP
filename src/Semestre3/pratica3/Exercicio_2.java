package pratica3;
/*Exercício 2) Considere um sistema que irá gerenciar uma clínica médica particular. Crie ao 
menos três classes para representar dois conjuntos de objetos distintos que possam existir dentro 
desse contexto. Para cada classe, é necessário que ao menos elas possuam cinco atributos 
relevantes ao contexto que estão aplicadas. Em relação aos métodos, é necessário que elas 
possuam ao menos três métodos cada*/

public class Exercicio_2 {

}

class Paciente{
	
	String cpf;
	String nome;
	String sintomas;
	boolean diagnosticado;
	boolean estadoDeEmergencia;
	
}

class Medico{
	
	String cpf;
	String nome;
	boolean plantao;
	int salario;
	String especializacao;
	
}

class Atendente{
	
	String cpf;
	String nome;
	boolean ocupado;
	int salario;
	//continuar aqui
	
}