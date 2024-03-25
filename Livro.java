package br.edu.ifsp.cmp.tads.ex03;

public class Livro {
	
	public String Titulo;
	public String Autor;
	public int AnoDePublicacao;
	
	public Livro(String Titulo, String Autor, int AnoDePublicacao) {
		this.Titulo = Titulo;
		this.Autor = Autor;
		this.AnoDePublicacao = AnoDePublicacao;
	}
	
	public void imprimirDetalhes() {
		System.out.println("Titulo: " + Titulo);
		System.out.println("Autor: " + Autor);
		System.out.println("Ano de publicação: " + AnoDePublicacao);
	}

}
