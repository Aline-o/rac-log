package jogo1;

import java.util.Scanner;
//import java.util.Random;

/**
 *
 * @author Aline, Joao
 */
public class JOGO1 {

    public static void main(String[] args) {

        Fases fase = new Fases();
        Scanner input = new Scanner(System.in);
        Text txt = new Text();

        txt.prologo(); // Apresentação do Belta
        txt.intro(); //boas-vindas do jogo
        
        txt.cap1(); //historia inicial, do mergulho
        txt.intro2(); //introducao de como jogar, "ajude Aufa com a matematica"
        fase.user.lifeTxt(); //mostra a vida inicial de todos
        do {
            txt.op1(fase.getX(), fase.getY()); //joga x e y aleatorios no texto, nao gera um novo
            fase.setResp(input.nextInt()); //le o teclado
            fase.fase1(); //chama a fase 1
        } while (fase.getResp() != fase.getResu());
        txt.cap2(); //incentivo para continuar jogando

        do {
            txt.op2(fase.getX(), fase.getY()); //operação 2
            fase.setResp(input.nextInt());
            fase.fase2();
        } while (fase.getResp() != fase.getResu());
        txt.cap3();// grrr

        do {
            txt.op3(fase.getX(), fase.getY(), fase.getZ());
            fase.setResp(input.nextInt());
            fase.fase3();
        } while (fase.getResp() != fase.getResu());
        txt.cap4(); // ficando bravo

        do {
            txt.op4(fase.getX());
            fase.setResp(input.nextInt());
            fase.fase4();
        } while (fase.getResp() != fase.getResu());
        txt.cap5(); //falha em usar o feitico

        do {
            txt.op5(fase.getX());
            fase.setResp(input.nextInt());
            fase.fase5();
        } while (fase.getResp() != fase.getResu());
        txt.cap6(); // puff puff

        do {
            txt.op6(fase.getX(), fase.getY(), fase.getZ());
            fase.setResp(input.nextInt());
            fase.fase6();
        } while (fase.getResp() != fase.getResu());
        txt.cap7(); //berserk

        do {
            txt.op7();
            fase.setResp(input.nextInt());
            fase.fase7();
        } while (fase.getResp() != fase.getResu());
        txt.cap8(); //quebra escudo, sela

        do {
            txt.op8(fase.getX(), fase.getY());
            fase.setResp(input.nextInt());
            fase.fase8();
        } while (fase.getResp() != fase.getResu());
        txt.cap9(); //incentivo de novo, mais um pouco

        do {
            txt.op9(fase.getX(), fase.getY(), fase.getZ());
            fase.setResp(input.nextInt());
            fase.fase9();
        } while (fase.getResp() != fase.getResu());
        txt.cap10(); //berro do monstro, ta quase selando

        do {
            txt.op10(fase.getX(), fase.getY(), fase.getZ());
            fase.setResp(input.nextInt());
            fase.fase10();
        } while (fase.getResp() != fase.getResu());
        txt.cap11(); //desfecho
    }

}
