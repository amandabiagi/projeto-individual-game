package projetoindividualamanda.game.personagem;

import projetoindividualamanda.game.item.Item;

import java.util.List;

public class Lutador extends Heroi{

    //Atributos
    private Double danoFisico;
    private String classe;

    public Lutador(String nome, String sexo) {
        super(nome,sexo);
        this.danoFisico = 3.0;
        this.classe = "Lutador";
    }

    //Método

    //Getter
    public Double getDanoFisico() {
        return danoFisico;
    }

    //Setter
    public void setDanoFisico(Double danoFisico) {
        this.danoFisico = danoFisico;
    }
}
