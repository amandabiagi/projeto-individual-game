package projetoindividualamanda.game.mercado;

import projetoindividualamanda.game.item.Arma;
import projetoindividualamanda.game.item.Item;
import projetoindividualamanda.game.item.Pocao;

import java.util.ArrayList;
import java.util.List;

public class LojaArma extends Loja{

    //Atributos
    private List<Arma> estoque = new ArrayList<>();

    @Override
    public void adicionarItemLoja(Item i) {
        super.adicionarItemLoja(i);
    }


    @Override
    public void exibirItemLoja() {
        super.exibirItemLoja();
    }


}
