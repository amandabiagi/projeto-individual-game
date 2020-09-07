package projetoindividualamanda.game.item;

public class Bastao extends Item{

    //Atributo

    private Integer velocidadeAtaque;

    public Bastao(String nome, Integer codigo, Integer valorAtribuir, Integer valor, Integer espaco, String raridade, Integer velocidadeAtaque) {
        super(nome, codigo, valorAtribuir, valor, espaco, raridade);
        this.velocidadeAtaque = velocidadeAtaque;
    }
}
