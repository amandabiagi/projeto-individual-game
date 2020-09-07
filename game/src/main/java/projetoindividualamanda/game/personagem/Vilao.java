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

    public Vilao(String nome, Integer level, Double xp, Double vida, Double vidaMaxima, Double danoBase, Double defesa, Integer ouro, Item itemDrop) {
        super(nome, level, xp, vida, vidaMaxima, danoBase, defesa);
        this.xp = xp;
        this.ouro = ouro;
        this.ouroDrop = 0 ;
        this.itemDrop = itemDrop;
    }

    //Métodos
    @Override
    public Double calcularDano() {
        return getDanoBase() + (getItemDrop().getValorAtribuir() - (getItemDrop().getValorAtribuir() + 0.30));
    }

    public void quantOuro(){
        Random geradorMoeda = new Random();
        ouroDrop = geradorMoeda.nextInt(ouro);
        setOuroDrop(ouroDrop);
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
