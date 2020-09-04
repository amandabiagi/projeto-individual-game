package projetoindividualamanda.game.personagem;

import projetoindividualamanda.game.item.Item;

import java.lang.reflect.Constructor;
import java.util.Random;

public class Vilao extends Personagem{

    //Atributos
    private Double xp;
    private Integer ouro;
    private Integer ouroDrop;
    private Item itemDrop;

    public Vilao(String nome, Integer level, Double xp, Double vida, Double vidaMaxima, Double danoBase, Double defesa, Double xp1, Integer ouro, Integer ouroDrop, Item itemDrop) {
        super(nome, level, xp, vida, vidaMaxima, danoBase, defesa);
        this.xp = xp1;
        this.ouro = ouro;
        this.ouroDrop = ouroDrop;
        this.itemDrop = itemDrop;
    }

    //Métodos
    public void quantOuro(){
        Random geradorMoeda = new Random();
        ouroDrop = geradorMoeda.nextInt(ouro);
        setOuroDrop(ouroDrop);
    }

    public void derrota(Heroi heroi, Vilao vilao){
        heroi.setXp(heroi.getXp() + vilao.getXp());
        heroi.levelUp();
        vilao.quantOuro();
        heroi.setSaquinhoOuro(heroi.getSaquinhoOuro() + vilao.getOuroDrop());
        vilao.getItemDrop().chancesDeConquista();

        if (vilao.getItemDrop().getRaridade() == "Comum" && vilao.getItemDrop().getNivelRaridade() <= 50) {
            heroi.adicionarItemBag(vilao.getItemDrop());
        } else if (vilao.getItemDrop().getRaridade() == "Raro" && vilao.getItemDrop().getNivelRaridade() > 50 && vilao.getItemDrop().getNivelRaridade() <= 85) {
            heroi.adicionarItemBag(vilao.getItemDrop());
        } else if(vilao.getItemDrop().getRaridade() == "Epico" && vilao.getItemDrop().getNivelRaridade() > 85 && vilao.getItemDrop().getNivelRaridade() <= 100){
            heroi.adicionarItemBag(vilao.getItemDrop());
        }
    }

    @Override
    public void getAtacar(Heroi heroi, Vilao vilao) {
        heroi.setVida(((heroi.getVida() - vilao.getDanoBase()) + heroi.getDefesa()));
    }


    //Getter
    public Double getXp() {
        return xp;
    }

    public Integer getOuro() {
        return ouro;
    }

    public Integer getOuroDrop() {
        return ouroDrop;
    }

    public Item getItemDrop() {
        return itemDrop;
    }

    //Setter
    public void setXp(Double xp) {
        this.xp = xp;
    }

    public void setOuro(Integer ouro) {
        this.ouro = ouro;
    }

    public void setOuroDrop(Integer ouroDrop) {
        this.ouroDrop = ouroDrop;
    }

    public void setItemDrop(Item itemDrop) {
        this.itemDrop = itemDrop;
    }
}
