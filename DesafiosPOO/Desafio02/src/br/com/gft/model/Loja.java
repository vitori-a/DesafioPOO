package br.com.gft.model;

import java.util.List;

public class Loja {
	private String nome;
	private String cnpj;
	private List<Livro>livros;
	private List<Videogame> videoGames;
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<Videogame> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<Videogame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<Videogame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public List<Livro> listaLivros(){

        System.out.println("-------------------------------------------------------------------------");

        for (Livro l : livros) {
            System.out.println("Título: " + l.getNome() + ", preço: " + l.getPreco() + ", quantidade: " + l.getQtd() + " em estoque");
        }
        return livros;
    }
	

	public List<Videogame> listaVideoGame(){

        System.out.println("-------------------------------------------------------------------------");

        for (Videogame v : videoGames) {
            System.out.println("Video-game: " + v.getModelo() + ", preço: " + v.getPreco() + ", quantidade: " + v.getQtd() + " em estoque");
        }
        return videoGames;
    }
	
	public double calculaPatrimonio(){

        // Valor total de Livros
        double valorLivros = listaLivros().stream().mapToDouble(Livro::getPreco).sum();
        double qtdLivros = livros.stream().mapToDouble(Livro :: getQtd).sum();
        double totalLivro = valorLivros * qtdLivros;

        // Valor total de Games
        double valorGames = listaVideoGame().stream().mapToDouble(Videogame::getPreco).sum();
        double qtdGames = videoGames.stream().mapToDouble(Videogame::getQtd).sum();
        double totalGames = valorGames * qtdGames;

        // Valor total do patrimonio
        double patrimonio = totalGames + totalLivro;

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("O patrimonio da loja Americanas é de " + patrimonio);
        return patrimonio;
    }
}
