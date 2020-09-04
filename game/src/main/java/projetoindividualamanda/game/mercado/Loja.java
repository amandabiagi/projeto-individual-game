package projetoindividualamanda.game.mercado;

import projetoindividualamanda.game.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    //Atributos
    private List<Item> estoque;


    //Construtor
    public Loja() {
        this.estoque = new ArrayList<Item>();
    }

    //Métodos
    public void adicionarItemLoja(Item i){
        estoque.add(i);
    }

    public void exibirItemLoja(){
        System.out.println("Lojinha");
        for (Item i : estoque){
            System.out.println(i);
        }
    }
}