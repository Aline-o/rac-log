package jogo2;

public class Text {

    public void intro() {
        System.out.println("\n####################\n"
                + "Bem-vindo ao jogo!!!\n"
                + "####################\n");
        //  + "\nQual o seu nome?\n> ";
    }

    public void op1(int x, int y) {
        System.out.printf("1- Resolva a seguinte operação\n  %d + %d \n> ", x, y);
    }

    public void op2(int x, int y) {
        System.out.printf("2- Resolva a seguinte operação\n  %d - %d  \n> ", x, y);
    }

    public void op3(int x, int y, int z) {
        System.out.printf("3- Resolva a seguinte operação\n  %d - %d * %d  \n> ", x, y, z);
    }

    public void op4(int x) {
        System.out.printf("4- Resolva a seguinte operação\n  %d ^ 2  \n> ", x);
    }

    public void op5(int x) {
        System.out.printf("5- Resolva a seguinte operação\n  %d ^ 6 / %d ^ 3  \n> ", x, x);
    }

    public void op6(int x, int y, int z) {
        System.out.printf("6- Resolva a seguinte operação\n  -%d * %d + %d - %d * %d \n> ", x, x, y, z, z);
    }

    public void op7() {
        System.out.printf("7- Resolva a seguinte operação\n  sen(pi/2) (rad)  \n> ");
    }

    public void op8(int x, int y) {
        System.out.printf("8- Resolva a seguinte operação\n  cos(pi) - %d * sen(pi/2) + %d (rad)  \n> ", x, y);
    }

    public void op9(int x, int y, int z) {
        System.out.printf("9- Resolva a seguinte operação\n  - %d + (%d^24 / %d^23) - %d * %d + %d^2 / 2 + %d - %d + %d^2  \n> ", z, z, z, y, y, x, z, z, y);
    }

    public void op10(int x, int y, int z) {
        System.out.printf("10- Resolva a seguinte operação\n  tan(pi/4) - %d + (%d^78 * %d^-76) + sen(pi) - (%d^52 / %d^2 / %d^49) + cos(pi) + 2 * %d  \n> ", y, x, x, z, z, z, y);
    }

    public void prologo() {
        System.out.println(" Em tempos remotos, havia um poderoso feiticeiro chamado Logarim. "
                + "Ele e seus ajudantes estavam tentando criar novas espécies de animais através da magia, "
                + "mas em vez disso, criaram uma besta horrenda, "
                + "totalmente selvagem e sedenta por sangue. Milhares de dentes afiados, 100m de altura, "
                + "escamas duras como aço, essa era a aparência "
                + "da criatura que tinha como único hobbie a destruição. Os aprendizes de "
                + "Logarim conseguiram selar o monstro e o planeta Githobbie nunca mais se esquecerá "
                + "do dia em que cidades inteiras foram dizimadas pela criatura conhecida hoje como Belta.\n "
                + " Mas isso é só um conto infantil, não é mesmo? :)\n");
    }

    public void cap1() {
        System.out.println(" Aufa e Ehpol estavam prontos para mais uma aventura nas profundezas do oceano, "
                + "mas dessa vez, usariam o novo feitiço que aprenderam na academia para respirar em baixo d'agua. "
                + "Mergulharam e se separaram como de costume, super empolgados, pois dessa vez conseguiriam ir mais fundo. "
                + "A caverna Lamda, situada na cidade de Javes, nunca antes explorada por mais ninguém além deles, "
                + "era um prato cheio para os curiosos e valentes irmãos.\n Aufa encontrou um túnel e adentrou sem pensar duas vezes. "
                + "Era difícil enxergar, mas a luz que emanava da magia já bastava para ver o que estava a frente. "
                + "O túnel acabou e ele encontrou uma espécie de sala subterrânea, não achou nada além de algas velhas. "
                + "Decepcionado, nadou de volta para a terra firme, tal qual foi sua surpresa quando viu "
                + "que estava acontecendo um terremoto. Olhou para trás e viu algo emergindo ao longe. "
                + "De início parecia uma rocha, mas conforme foi saindo da água, sua silhueta foi tomando forma. "
                + "Era uma criatura gigante que parecia mais com... Belta!? Não era só uma lenda? Para seu desespero, "
                + "quando a criatura estava perto o suficiente para ver os mínimos detalhes "
                + "de seu corpo horrendo, viu seu irmão entre as garras do monstro. "
                + "Ficou surpreso quando o temível Belta... guardou seu irmão em uma espécie de bolso na barriga?\n "
                + "Os jovens sempre sonharam em viver uma empolgante e perigosa aventura, parece que o momento chegou, "
                + "mas não estava sendo tão divertido quanto eles imaginavam que seria. ");
    }

    public void intro2() {
        System.out.println("\nA proteção mágica nas escamas de Belta pode ser quebrada a partir de golpes em lugares "
                + "específicos e no momento certo. Use a matemática para ajudar "
                + "Aufa a atacá-lo nos lugares em que o escudo está mais vulnerável em cada partida.\n");
    }

    public void cap2() {
        System.out.println(" Aufa: E não é que tá funcionando mesmo? Vamos continuar e salvar Ehpol, conto contigo!\n");
    }

    public void cap3() {
        System.out.println(" Belta: Grrrrrrrr...\n");
    }

    public void cap4() {
        System.out.println(" Aufa: Parece que o monstro está ficando bravo! É melhor nos apressarmos e acabar logo com isso!\n");
    }

    public void cap5() {
        System.out.println(" Aufa: Já sei, vou usar um feitiço para atordoá-lo.\n"
                + " * feitiço falhou *\n"
                + " Aufa: Mas que diabos...\n"
                + " Belta: GRRRRRRRRRR\n");
    }

    public void cap6() {
        System.out.println(" Aufa: * puff *\t* puff *\n");
    }

    public void cap7() {
        System.out.println(" Belta: ROOOAAAAAAAAAAARR\n"
                + " Ehpol: O que está acontecendo?\n"
                + " Aufa: Ele está entrando em modo Bersek! Se segura que o bixo vai pegar!\n");
    }

    public void cap8() {
        System.out.println(" Aufa: Conseguimos quebrar o escudo! Agora vamos selá-lo!\n"
                + " Belta: GRRRRRRRRRRRRRR\n"
                + " Ehpol: Parece que vocês não foram os únicos que perceberam isso! Cuidado!\n");
    }

    public void cap9() {
        System.out.println(" Ehpol: Está dando certo, ele está diminuindo! Continue assim, mais um pouco e vencemos!\n");
    }

    public void cap10() {
        System.out.println(" Belta: ROAAAAAAAAAAAAAARRRRRRR... GRRRRRRRRRRRRRR... RAAAAAAAUUUUUURRRRRRR...\n"
                + " Aufa: AAHHHHH ELE ESTÁ FAZENDO MUITO BARULHO!\n"
                + " Ehpol: NÃO DESISTA, O SELO ESTÁ QUASE COMPLETO!!!\n"
                + " Belta: ROOOOOOOOOOAAAAAAAARRRRRR!!!\n");
    }

    public void cap11() {
        System.out.println(" Aufa: Finalmente conseguimos... Ufa!\n"
                + " Ehpol: Sim...\n"
                + " Aufa: Agora que ta mais tranquilo, posso perguntar. Você jogou algum feitiço nele?\n"
                + " Ehpol: Sim, joguei o de Bloqueio Mental para que ele não me visse como um inimigo...\n"
                + " Aufa: Isso explica porque você sobreviveu no fundo do oceano e o porque do meu feitiço de Confusão Mental não ter funcionado.\n"
                + " Ehpol: Lei do Overide, nenhum ser consegue receber dois feitiços do mesmo tipo... Sim...\n"
                + " Aufa: O que foi, irmão? Não parece muito bem.\n"
                + " Ehpol: Estou com um pouco de pena dele...\n"
                + " Aufa: Você sabe o que ele fez no passado, não é mesmo? Destruiu cidades inteiras e tivemos muitas perdas.\n"
                + " Ehpol: Sim... Mas ele é um animal irracional. Apesar do tamanho, ele não sabia o que estava fazendo.\n"
                + " Aufa: Irmão... Está escrito nos registros que ele é fruto de um experimento mal-sucedido e que por isso "
                + "ele não possui algumas funções cerebrais que todos os outros animais tem, e dentre elas a compaixão.\n"
                + " Ehpol: Se ele não tem compaixão, por que o feitiço mental funcionou e ele me colocou na bolsa para me defender?\n"
                + " Aufa: ...\n"
                + " Ehpol: De qualquer forma, vamos devolvê-lo ao oceano. Dessa vez vamos colocà-lo mais fundo e "
                + "conjurar um feitiço de proteção e um de camuflagem para que ninguém mais o encontre.\n"
                + " Aufa: Sim, é o melhor a se fazer.\n"
                + "   Daquele dia em diante, Ehpol parou de mergulhar e começou a se dedicar mais no estudo de novos feitiços. "
                + "Aufa continua sua vida de exploração marítima, mas em outros lugares já explorados anteriormente.");
    }

    public void dano() {
        System.out.println("\n Belta: GRRRRAAAUUUURRRR\n Aufa: AI!\n# VOCE PERDEU UMA VIDA #");
    }

    public void ex1() {
        System.out.println("Um morador de uma região metropolitana tem 50% de\n"
                + "probabilidade de atrasar-se para o trabalho quando chove\n"
                + "na região; caso não chova, sua probabilidade de atraso é\n"
                + "de 25%. Para um determinado dia, o serviço de\n"
                + "meteorologia estima em 30% a probabilidade da\n"
                + "ocorrência de chuva nessa região.\n"
                + "Qual é a probabilidade de esse morador se atrasar para o\n"
                + "serviço no dia para o qual foi dada a estimativa de chuva?\n"
                + "a) 0,075\n"
                + "b) 0,150\n"
                + "c) 0,325\n"
                + "d) 0,600\n"
                + "e) 0,800\n"
                + "> ");

    }
}
