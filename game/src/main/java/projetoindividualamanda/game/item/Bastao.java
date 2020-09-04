package projetoindividualamanda.game.item;

public class Bastao extends Item{

    //Atributo
    private Double valorAtribuir;
    private Integer velocidadeAtaque;

    public Bastao(String nome, Integer codigo, Integer valor, Integer espaco, String raridade, Double valorAtribuir, Integer velocidadeAtaque) {
        super(nome, codigo, valor, espaco, raridade);
        this.valorAtribuir = valorAtribuir;
        this.velocidadeAtaque = velocidadeAtaque;
    }
}
