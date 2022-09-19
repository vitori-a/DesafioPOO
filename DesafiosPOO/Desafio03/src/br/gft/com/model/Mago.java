package br.gft.com.model;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem{
    private List<Mago> magia;

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public List<Mago> getMagia() {
        return magia;
    }

    public void setMagia(List<Mago> magia) {
        this.magia = magia;
    }

    @Override
    public void lvlUp() {
        int level = getLevel() + 1;
        int mana = getMana() + 1;
        int inteligencia = getInteligencia() + 1;

        System.out.println("level Up: +1");
        System.out.println("+ Mana (" + getMana() + ")");
        System.out.println("+ Inteligência (" + getInteligencia() + ")");
        super.lvlUp();
    }

    public void attack(){
        Random gerador = new Random();

            int attack = gerador.nextInt(300) + (getLevel() * getInteligencia());
            System.out.println("Força de ataque: " + attack);
    }

    public List<Mago> aprenderMagia(){
        System.out.println("Poderes do mago");

        for (Mago mago: magia){
            System.out.println("Poder: " + mago.getMagia());
        }
        return magia;
    }
}