/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo2;

public class Player {

    private String name;
    private int lifeBot;
    private int lifeP;

    public Player() {
        this.name = "Voce";
        this.lifeBot = 10;
        this.lifeP = 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //setlifeBot decrementa a vida do bot com o valor que vier
    public int getLifeBot() {
        return lifeBot;
    }

    public void setLifeBot(int lifeBot) {
        this.lifeBot -= lifeBot;
    }

    //setlifeP decrementa a vida do usuário com o valor que vier
    public int getLifeP() {
        return lifeP;
    }

    public void setLifeP(int lifeP) {
        this.lifeP -= lifeP;
    }

    //informa a vida do usuário e do bot
    public void lifeTxt() {
        System.out.println("\n# Belta: " + getLifeBot() + " vidas.");
        System.out.println("# " + getName() + ": " + getLifeP() + " vidas.\n");
    }


 
}
