package projetoindividualamanda.game.controller;

import projetoindividualamanda.game.item.Bastao;
import projetoindividualamanda.game.item.Pocao;
import projetoindividualamanda.game.mercado.LojaBastao;
import projetoindividualamanda.game.mercado.LojaPocao;
import projetoindividualamanda.game.personagem.Heroi;
import projetoindividualamanda.game.personagem.Mago;
import projetoindividualamanda.game.personagem.Vilao;

import java.awt.image.ImageObserver;

public class Teste {

    public static void main(String[] args) {

        Mago magoJose = new Mago("José","Feminino");

        Pocao pocaoVida1 = new Pocao("Pocao",100,3,1,"Comum","vida",3);
        Pocao pocaoVida2 = new Pocao("Pocao",101,5,1,"Comum","vida",6);
        Bastao varinhaDeElcalipto = new Bastao("Varinha de Eucalipto",1000,60,35,7,"comum",5);

        Vilao allan = new Vilao("Allan",1,5.0,10.0,10.0,1.0,1.0,10,pocaoVida1);

        Vilao daniel = new Vilao("Daniel",4,100.0,60.0,10.0,25.0,1.0,20,varinhaDeElcalipto);

        LojaPocao lojinhaDasMagias = new LojaPocao();

        System.out.println("\nAdicionando item na loja");
        lojinhaDasMagias.adicionarItemLoja(pocaoVida1);

        System.out.println("\nexibindo loja");
        lojinhaDasMagias.exibirItemLoja();

        System.out.println("\nMostrando heroi primeira vez");
        magoJose.exibirHeroi();

        System.out.println("\nComprando item primeira vez");
        magoJose.comprarItem(pocaoVida1,lojinhaDasMagias);

        System.out.println("\nBebendo item 1 vez");
        magoJose.beberPocao(pocaoVida1);

        System.out.println("\nexibindo bag 1 vez");
        magoJose.exibirBag();

        System.out.println("\nLutando");
        magoJose.lutar(allan);

        System.out.println("\nPós 1 luta");
        magoJose.exibirHeroi();

        System.out.println("Lutando");
        magoJose.lutar(allan);

        System.out.println("\nPós 2 luta");
        magoJose.exibirHeroi();

        System.out.println("\nLutando");
        magoJose.lutar(daniel);

        System.out.println("\nPós 3 luta");
        magoJose.exibirHeroi();

        magoJose.exibirBag();

        System.out.println("bebendo 3 poções");
        magoJose.beberPocao(pocaoVida1);
        magoJose.beberPocao(pocaoVida1);
        magoJose.beberPocao(pocaoVida1);

        magoJose.exibirBag();

        magoJose.exibirHeroi();

        magoJose.comprarItem(pocaoVida1, lojinhaDasMagias);
        magoJose.comprarItem(pocaoVida1, lojinhaDasMagias);
        magoJose.comprarItem(pocaoVida1, lojinhaDasMagias);

        magoJose.exibirBag();
        magoJose.exibirHeroi();


    }
}
