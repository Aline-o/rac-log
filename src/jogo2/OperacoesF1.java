package jogo2;

import java.util.Random;

public class OperacoesF1 extends Acao{

    private int x = random(); //usa a o metodo random
    private int y = random(); //usa a o metodo random
    private int z = random(); //usa a o metodo random

    public Text getTxt() {
        return txt;
    }

//encapsulamento
    //carrega o construtor da classe Player
    public void setTxt(Text txt) {
        this.txt = txt;
    }

    public Player getUser() {
        return user;
    }
    public void setUser(Player user) {
        this.user = user;
    }

    public int getResp() {
        return resp;
    }
    public void setResp(int resp) {
        this.resp = resp;
    }

    public int getResu() {
        return resu;
    }
    public void setResu(int resu) {
        this.resu = resu;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = random(); //gera um novo x aleatorio
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = random(); //gera um novo y aleatorio
    }

    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = random(); //gera um novo z aleatorio
    }

//fases do jogo contendo uma função diferente em cada um
    public void fase1() {
        //armazena o resultado da função em "resu"
        resu = x + y;
        acoes();
        geraRandom();
    }

    public void fase2() {
        resu = x - y;
        acoes();
        geraRandom();
    }

    public void fase3() {
        resu = x - (y * z);
        acoes();
        geraRandom();
    }

    public void fase4() {
        resu = x * x;
        acoes();
        geraRandom();
    }

    public void fase5() {
        resu = x * x * x;
        acoes();
        geraRandom();
    }

    public void fase6() {
        resu = -x * x + y - z * z;
        acoes();
        geraRandom();
    }

    public void fase7() {
        resu = 1;
        acoes();
        geraRandom();
    }

    public void fase8() {
        resu = -x - 1 + y;
        acoes();
        geraRandom();
    }

    public void fase9() {
        resu = (z * z) / 2;
        acoes();
        geraRandom();
    }

    public void fase10() {
        resu = (x * x) + y - z;
        acoes();
        geraRandom();
    }

   
    public void geraRandom(){
        setX(0); //gera um novo x aleatorio
        setY(0); //gera um novo y aleatorio
        setZ(0); //gera um novo z aleatorio
    }

//gera um numero aleatorio
    public static int random() {
        Random r = new Random();

        int x = 1 + r.nextInt(50); //inteiro de 1 ate 50 
        return x;
    }

}
