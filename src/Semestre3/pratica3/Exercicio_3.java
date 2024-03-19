package pratica3;
/*Exerc�cio 3) Considere um sistema que ir� gerenciar uma biblioteca p�blica. Crie ao menos duas
classes para representar dois conjuntos de objetos distintos que possam existir dentro desse
contexto. Para cada classe, � necess�rio que ao menos elas possuam cinco atributos relevantes
ao contexto que est�o aplicadas. Em rela��o aos m�todos, � necess�rio que elas possuam ao
menos dois m�todos cada.*/

import java.util.LinkedList;

public class Exercicio_3 {

}

final class Biblioteca {
	
	private LinkedList<String> livros = new LinkedList<String>();
	private LinkedList<Leitor> leitores = new LinkedList<Leitor>();
	private int totalLivros = livros.size();
	private int livrosEmprestado;
	private int livrosDisponiveis = totalLivros - livrosEmprestado;
	
	void adicionarLivro(String livro) {
		livros.add(livro);
	}
	
	boolean verificarDisponibilidade(String livro) {
		return livro.contains(livro);
	}

	public int getLivrosEmprestado() {
		return livrosEmprestado;
	}

	public void livroEmprestado(String livro) {
		adicionarLivro(livro);
		this.livrosEmprestado++;
	}
	
	public void livroDevolvido(String livro) {
		adicionarLivro(livro);
		this.livrosEmprestado--;
	}
	
	public int getLivrosDisponiveis() {
		return livrosDisponiveis;
	}
	
	boolean verificarCadastro(Leitor leitor) {
		return leitores.contains(leitor);
	}
	
}

class Leitor {
	private int totLivrosEmprest;
	private String CPF;
	private String nome;
	private String livroAtualEmprestado;
	private Biblioteca biblioteca;
	
	Leitor (String CPF, String nome){
		this.CPF = CPF;
		this.nome = nome;
		this.totLivrosEmprest = 0;
		this.livroAtualEmprestado = "";
	}
	
	void empresta(String livro) {
		if (biblioteca.verificarCadastro(this)) {
			switch (getLivroAtualEmprest()) {
				case "":
					if (biblioteca.verificarDisponibilidade(livro)) {
						System.out.println("Livro emprestado!");
						setLivroAtualEmprest(livro);
						this.totLivrosEmprest++;
						biblioteca.livroEmprestado(livro);
					} else {
						System.out.println("Livro n�o dispon�vel");
					}
					break;
				default:
					System.out.println("J� tem um livro emprestado, n�o pode emprestar outro!");
			}
		} else {
			System.out.println("N�o Cadastrado");
		}

	}
	
	void devolverLivro() {
		if (biblioteca.verificarCadastro(this)) {
			if (getLivroAtualEmprest() == "") {
				System.out.println("N�o h� livros para devolver");
			} else {
				biblioteca.livroDevolvido(getLivroAtualEmprest());
				setLivroAtualEmprest("");
			}
		} else {
			System.out.println("N�o cadastrado");
		}
	}

	public int getTotLivrosEmprest() {
		return totLivrosEmprest;
	}

	public String getCPF() {
		return CPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLivroAtualEmprest() {
		return livroAtualEmprestado;
	}

	public void setLivroAtualEmprest(String livroAtualEmprestado) {
		this.livroAtualEmprestado = livroAtualEmprestado;
	}
}
