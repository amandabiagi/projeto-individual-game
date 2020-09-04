package projetoindividualamanda.game.mercado;

import projetoindividualamanda.game.item.Item;
import projetoindividualamanda.game.item.Pocao;

import java.util.ArrayList;
import java.util.List;

public class LojaPocao extends Loja{

    //Atributos
    private List<Pocao> estoque = new ArrayList<>();

    @Override
    public void adicionarItemLoja(Item i) {
        super.adicionarItemLoja(i);
    }

    @Override
    public void exibirItemLoja() {
        super.exibirItemLoja();
    }

    //Getter
    public List<Pocao> getEstoque() {
        return estoque;
    }
}
