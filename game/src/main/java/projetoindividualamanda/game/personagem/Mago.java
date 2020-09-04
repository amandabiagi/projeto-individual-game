package projetoindividualamanda.game.personagem;

import projetoindividualamanda.game.item.Item;

import java.util.List;

public class Mago extends Heroi{

    //Atributo
    private Double danoMagico;
    private String classe;

    //Construtor

    public Mago(String nome, String sexo) {
        super(nome,sexo);
        this.danoMagico = 3.0;
        this.classe = "Mago";

    }

    //Método


    //Getter
    public Double getDanoMagico() {
        return danoMagico;
    }

    public String getClasse() {
        return classe;
    }

    //Setter
    public void setDanoBase(Double danoMagico) {
        this.danoMagico = danoMagico;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
