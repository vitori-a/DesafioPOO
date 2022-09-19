package br.com.gft.model;

import br.gft.interfaces.Imposto;

public class Videogame extends Produto implements Imposto {
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	
	public Videogame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
    public double calcularimposto() {
        if(isUsado == true) {
            double imposto = 0.25 * getPreco();
            System.out.println("Imposto PS4 " + getModelo() + " usado, " + imposto);
        } else {
            double imposto = 0.45 * getPreco();
            System.out.println("Imposto PS4 " + getModelo() + ", " + imposto);
        }
        return 0;
    }
	
	
	
}
