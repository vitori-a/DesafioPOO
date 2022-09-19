package br.gft.com.model;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{
    private List<String> habilidade;
    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    @Override
    public void lvlUp() {
        int level = getLevel() + 1;
        int vida = getVida() + 1;
        int forca = getForca() + 1;

        System.out.println("Level Up: +1");
        System.out.println("+ Vida (" + getVida() + ")");
        System.out.println("+ Força (" + getForca() + ")");
        super.lvlUp();
    }

    public void attack(){
        Random gerador = new Random();

        int attack = gerador.nextInt(300) + (getLevel() * getForca());
        System.out.println("Força de ataque: " + attack);

    }
}
