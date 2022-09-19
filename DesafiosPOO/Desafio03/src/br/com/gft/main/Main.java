package br.com.gft.main;

import java.util.Scanner;

import br.gft.com.model.Guerreiro;
import br.gft.com.model.Mago;

public class Main {
    public static void main(String[] args) {
        //String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia
        Mago m1 = new Mago("Gandalf", 3, 20, 0, 50, 10, 1);
        Guerreiro g1 = new Guerreiro("Thor", 4, 45, 30, 65, 85, 4);

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o personagem desejado: ");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.printf("Digite: ");
        int escolha = ler.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("~GUERREIRO~");
                g1.imprimirAtributos();
                break;
            case 2:
                System.out.println("~MAGO~");
                m1.imprimirAtributos();
                break;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println("\nAtacar?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.printf("Digite: ");
        int escolha2 = ler.nextInt();

        switch (escolha2) {
            case 1:
                if (escolha == 1) {
                    g1.attack();
                    g1.lvlUp();
                    g1.imprimirAtributos();
                } else if (escolha == 2) {
                    m1.attack();
                    m1.lvlUp();
                    m1.imprimirAtributos();
                } else System.out.println("Opção inválida");

            case 2:
        }
        //m1.lvlUp();

    }
}