package br.gft.main;

import br.gft.model.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo("BMW", "Serie 1", "XTM-400", "vermelho", false, 0, 25, 500, 75000);
		
		v1.acelerar(10);
		v1.abastecer(20);
		v1.frear(true, 50);
		v1.pintar("azul");
		v1.ligar(true);
		v1.desligar(true, 0);
	}

}
