/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo2;

/**
 *
 * @author Aluno
 */
public class Acao {
    
        Player user = new Player(); //cria um objeto da classe Player
        Text txt = new Text();
        protected int resp;  //resposta do usuário
        protected int resu; //resultado da conta matemática
    
//chama todos os metodos acima, sao acoes que acontecem em todas as fases    
    public void acoes() {
        decremento(); //chama o método "decremento"
        user.lifeTxt(); //chama uma string informando quantas vidas o usuário e o bot tem
        gameOver(); //verifica se a vida do usuario chegou a zero
    }
    
    //se a vida do usuário chegar a zero, game over
    public void gameOver() {
        if (user.getLifeP() == 0) {
            System.out.printf("G  A  M  E\t O  V  E  R\n");
            System.exit(0);
        }
    }
//se a resposta estiver certa, tira 1 vida do bot. Se estiver errada, tira 1 do usuário 
    public void decremento() {
        if (resp == resu) {
            user.setLifeBot(1);
        } else {
            txt.dano();
            user.setLifeP(1);
        }
    }
}
