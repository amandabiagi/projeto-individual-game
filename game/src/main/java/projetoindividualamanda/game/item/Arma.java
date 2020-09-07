package projetoindividualamanda.game.item;

public class Arma extends Item{

    //Atributo
    private Integer velocidadeAtaque;

    public Arma(String nome, Integer codigo, Integer valorAtribuir, Integer valor, Integer espaco, String raridade, Integer velocidadeAtaque) {
        super(nome, codigo, valorAtribuir, valor, espaco, raridade);
        this.velocidadeAtaque = velocidadeAtaque;
    }

    public Integer getVelocidadeAtaque() {
        return velocidadeAtaque;
    }

    public void setVelocidadeAtaque(Integer velocidadeAtaque) {
        this.velocidadeAtaque = velocidadeAtaque;
    }
}
