package projetoindividualamanda.game.controller;

import projetoindividualamanda.game.item.Pocao;
import projetoindividualamanda.game.mercado.LojaBastao;
import projetoindividualamanda.game.mercado.LojaPocao;
import projetoindividualamanda.game.personagem.Heroi;
import projetoindividualamanda.game.personagem.Mago;
import projetoindividualamanda.game.personagem.Vilao;

import java.awt.image.ImageObserver;

public class Teste {

    public static void main(String[] args) {

        Mago mago = new Mago("José","Feminino");

        Pocao pocaoVida = new Pocao("Pocao",100,3,1,"Comum","vida",3);

        Vilao allan = new Vilao("Allan",2,100.0,10.0,10.0,10.0,1.0,10,pocaoVida);
        LojaPocao lojinhaDasMagias = new LojaPocao();

        lojinhaDasMagias.adicionarItemLoja(pocaoVida);
        lojinhaDasMagias.exibirItemLoja();

        mago.comprarItem(pocaoVida,lojinhaDasMagias);


        mago.beberPocao(pocaoVida);

        mago.exibirBag();

        mago.exibirHeroi();

        System.out.println("Lutando");

        mago.lutar(allan);
        mago.lutar(allan);
        mago.lutar(allan);

        mago.exibirBag();

        System.out.println("bebendo 3 poções");
        mago.beberPocao(pocaoVida);
        mago.beberPocao(pocaoVida);
        mago.beberPocao(pocaoVida);

        mago.exibirBag();

        mago.exibirHeroi();

        mago.comprarItem(pocaoVida, lojinhaDasMagias);
        mago.comprarItem(pocaoVida, lojinhaDasMagias);
        mago.comprarItem(pocaoVida, lojinhaDasMagias);

        mago.exibirBag();
        mago.exibirHeroi();


    }
}
