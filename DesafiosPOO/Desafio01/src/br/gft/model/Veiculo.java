package br.gft.model;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private boolean isLigado;
	private float km;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;

	public Veiculo(String marca, String modelo, String placa, String cor, boolean isLigado, float km,
			int litrosCombustivel, int velocidade, double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.isLigado = isLigado;
		this.km = km;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
	}
	
	public void acelerar(int velocidade) {
		velocidade = velocidade + 20;
		System.out.println("A velocidade é igual a " + velocidade);
	}
	
	public void abastecer(int combustivel) {
		int litrosComnustivel = combustivel;
        if(combustivel <= 60){
            System.out.println("Dentro do limite estabelecido!");
        } else {
            System.out.println("Limite do tanque não pode ultrapassar 60 litros!!");
        }
	}
	
	public void frear(boolean isLigado, int velocidade) {

        if(isLigado == false){
            System.out.println("Veículo parado!");

        } else if (velocidade >= 20){
            velocidade = velocidade - 20;
            System.out.println("Freando veiculo! Velocidade: " + velocidade);
        } else {
            velocidade = velocidade - velocidade;
            System.out.println("Freando veiculo! Velocidade: " + velocidade);
        }

    }
	
	public void pintar(String cor) {
        System.out.println("Cor do carro: " + cor);
    }
	
	public void ligar(boolean isLigado) {
		if(isLigado == true) {
			System.out.println("Carro já se encontra ligado");
		} else {
			System.out.println("Ligando carro");
		}
	}
	
	public void desligar(boolean isLigado, int velocidade) {
        if(isLigado == true && velocidade > 0) {
            System.out.println("O veiculo não pode ser deligado, pois a velocidade é maior que 0");
        } else if (isLigado == true && velocidade == 0){
            System.out.println("Desligando veiculo");
        } else {
            System.out.println("Veiculo se encontra desligado");
        }
	}
}
