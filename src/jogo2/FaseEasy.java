/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class FaseEasy {

    OperacoesF1 faseFacil = new OperacoesF1();
    Scanner input = new Scanner(System.in);
    Text txt = new Text();

    public void facil() {
            fase1();
            fase2();
            fase3();
            fase4();
            fase5();
            fase6();
            fase7();
            fase8();
            fase9();
            fase10();
    }

    public void fase1() {
        PrologoGUI pr = new PrologoGUI();
        //pr.pack();
       // pr.setVisible(false);
        
        
                
        txt.prologo(); // Apresentação do Belta

        txt.cap1(); //historia inicial, do mergulho
        txt.intro2(); //introducao de como jogar, "ajude Aufa com a matematica"
        faseFacil.user.lifeTxt(); //mostra a vida inicial de todos

        do {
            txt.op1(faseFacil.getX(), faseFacil.getY()); //joga x e y aleatorios no texto, nao gera um novo
            faseFacil.setResp(input.nextInt()); //le o teclado
            faseFacil.fase1(); //chama a faseFacil 1
        } while (faseFacil.getResp() != faseFacil.getResu());
        txt.cap2(); //incentivo para continuar jogando
    }

    public void fase2() {
        do {
            txt.op2(faseFacil.getX(), faseFacil.getY()); //operação 2
            faseFacil.setResp(input.nextInt());
            faseFacil.fase2();
        } while (faseFacil.getResp() != faseFacil.getResu());
        txt.cap3();// grrr
    }

    public void fase3() {
        do {
            txt.op3(faseFacil.getX(), faseFacil.getY(), faseFacil.getZ());
            faseFacil.setResp(input.nextInt());
            faseFacil.fase3();
        } while (faseFacil.getResp() != faseFacil.getResu());
        txt.cap4(); // ficando bravo
    }

    public void fase4() {
        do {
            txt.op4(faseFacil.getX());
            faseFacil.setResp(input.nextInt());
            faseFacil.fase4();
        } while (faseFacil.getResp() != faseFacil.getResu());
        txt.cap5(); //falha em usar o feitico
    }

    public void fase5() {
        do {
            txt.op5(faseFacil.getX());
            faseFacil.setResp(input.nextInt());
            faseFacil.fase5();
        } while (faseFacil.getResp() != faseFacil.getResu());
        txt.cap6(); // puff puff
    }

    public void fase6() {
        do {
            txt.op6(faseFacil.getX(), faseFacil.getY(), faseFacil.getZ());
            faseFacil.setResp(input.nextInt());
            faseFacil.fase6();
        } while (faseFacil.getResp() != faseFacil.getResu());
        txt.cap7(); //berserk
    }

    public void fase7() {
        do {
            txt.op7();
            faseFacil.setResp(input.nextInt());
            faseFacil.fase7();
        } while (faseFacil.getResp() != faseFacil.getResu());
        txt.cap8(); //quebra escudo, sela
    }

    public void fase8() {
        do {
            txt.op8(faseFacil.getX(), faseFacil.getY());
            faseFacil.setResp(input.nextInt());
            faseFacil.fase8();
        } while (faseFacil.getResp() != faseFacil.getResu());
        txt.cap9(); //incentivo de novo, mais um pouco
    }

    public void fase9() {
        do {
            txt.op9(faseFacil.getX(), faseFacil.getY(), faseFacil.getZ());
            faseFacil.setResp(input.nextInt());
            faseFacil.fase9();
        } while (faseFacil.getResp() != faseFacil.getResu());
        txt.cap10(); //berro do monstro, ta quase selando
    }

    public void fase10() {
        do {
            txt.op10(faseFacil.getX(), faseFacil.getY(), faseFacil.getZ());
            faseFacil.setResp(input.nextInt());
            faseFacil.fase10();
        } while (faseFacil.getResp() != faseFacil.getResu());
        txt.cap11(); //desfecho
    }

}
