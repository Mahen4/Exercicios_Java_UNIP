package pratica3;
/*Exerc�cio 2) Considere um sistema que ir� gerenciar uma cl�nica m�dica particular. Crie ao 
menos tr�s classes para representar dois conjuntos de objetos distintos que possam existir dentro 
desse contexto. Para cada classe, � necess�rio que ao menos elas possuam cinco atributos 
relevantes ao contexto que est�o aplicadas. Em rela��o aos m�todos, � necess�rio que elas 
possuam ao menos tr�s m�todos cada*/

import java.util.Scanner;
import java.util.LinkedList;

public class Exercicio_2 {

}

class Clinica {
	
	LinkedList<Paciente> fila = new LinkedList<Paciente>();
	
	void atendimentoEmergencia(Paciente paciente) {
		fila.addFirst(paciente);
	}
	
	void filaEspera(Paciente paciente) {
		fila.add(paciente);
	}
	
	Paciente proximoPaciente() {
		return fila.getFirst();
	}
	
	void atendimentoRealizado() {
		fila.poll();
	}
	
}

class Paciente{
	
	String cpf;
	String nome;
	String sintomas;
	boolean diagnosticado;
	boolean estadoDeEmergencia;
	
	public Paciente(String cpf, String nome, String possiveisSintomas) {
		this.cpf = cpf;
		this.nome = nome;
		this.sintomas = possiveisSintomas;
		this.diagnosticado = false;
		this.estadoDeEmergencia = false;
	}
	
	void triagem(String sintomas) {
		this.sintomas = sintomas;
		this.diagnosticado = true;
	}
	
	void emergencia() {
		this.estadoDeEmergencia = true;
	}
	
}

class Medico{
	
	String cpf;
	String nome;
	String especializacao;
	int salario;
	boolean plantao;
	Clinica clinica;
	
	public Medico (String cpf, String nome, String especializacao, int salario) {
		this.cpf = cpf;
		this.nome = nome;
		this.especializacao = especializacao;
		this.salario = salario;
		this.plantao = false;
	}
	
	void emPlantao() {
		this.plantao = true;
	}
	
	void encerrarPlantao() {
		this.plantao = false;
	}
	
	void Consulta() {
		System.out.println("Verificando sintomas");
		System.out.println("Conversando/explicando para o paciente");
		System.out.println("Preescrevendo indica��es");
		System.out.println("Sanando duvidas restantes");
	}
	
	String checarSintomas() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Os sintomas s�o:");
		String sintomas = sc.nextLine();
		sc.close();
		return sintomas;
	}
	
	void atenderCliente() {
		Paciente paciente = clinica.proximoPaciente();
		if (!paciente.diagnosticado) {
			paciente.triagem(checarSintomas());
		}
		Consulta();
		clinica.atendimentoRealizado();
	}
	
}

class Atendente{
	
	String cpf;
	String nome;
	int salario;
	int agendamentosRealizados;
	int atendimentosRealizados;
	Clinica clinica;
	
	public Atendente (String cpf, String nome, int salario, Clinica clinica) {
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
		this.clinica = clinica;
		this.agendamentosRealizados = 0;
		this.atendimentosRealizados = 0;
	}
	
	void atenderPaciente(Paciente paciente) {
		
		if (paciente.estadoDeEmergencia) {
			clinica.atendimentoEmergencia(paciente);
		} else {
			clinica.filaEspera(paciente);			
		}
	}
	
	void marcarConsulta() {
		this.agendamentosRealizados += 1;
	}
	
}