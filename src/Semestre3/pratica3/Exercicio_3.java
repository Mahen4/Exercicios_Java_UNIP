package pratica3;
/*Exercício 3) Considere um sistema que irá gerenciar uma biblioteca pública. Crie ao menos duas
classes para representar dois conjuntos de objetos distintos que possam existir dentro desse
contexto. Para cada classe, é necessário que ao menos elas possuam cinco atributos relevantes
ao contexto que estão aplicadas. Em relação aos métodos, é necessário que elas possuam ao
menos dois métodos cada.*/

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
						System.out.println("Livro não disponível");
					}
					break;
				default:
					System.out.println("Já tem um livro emprestado, não pode emprestar outro!");
			}
		} else {
			System.out.println("Não Cadastrado");
		}

	}
	
	void devolverLivro() {
		if (biblioteca.verificarCadastro(this)) {
			if (getLivroAtualEmprest() == "") {
				System.out.println("Não há livros para devolver");
			} else {
				biblioteca.livroDevolvido(getLivroAtualEmprest());
				setLivroAtualEmprest("");
			}
		} else {
			System.out.println("Não cadastrado");
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
