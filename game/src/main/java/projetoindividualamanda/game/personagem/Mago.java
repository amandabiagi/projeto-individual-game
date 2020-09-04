package projetoindividualamanda.game.personagem;

import projetoindividualamanda.game.item.Item;

import java.util.List;

public class Mago extends Heroi{

    //Atributo
    private Double danoMagico;

    //Construtor
    public Mago(String nome, String sexo) {
        super(nome,sexo,"Mago");
        this.danoMagico = 3.0;
    }

    //Getter
    public Double getDanoMagico() {
        return danoMagico;
    }

    //Setter

    public void setDanoMagico(Double danoMagico) {
        this.danoMagico = danoMagico;
    }
}
