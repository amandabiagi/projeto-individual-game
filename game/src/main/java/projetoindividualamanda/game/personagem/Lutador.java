package projetoindividualamanda.game.personagem;

import projetoindividualamanda.game.item.Item;

import java.util.List;

public class Lutador extends Heroi{

    //Atributos
    private Double danoFisico;

    //Construtor
    public Lutador(String nome, String sexo) {
        super(nome,sexo,"Lutador");
        this.danoFisico = 3.0;
    }

    //Método


    @Override
    public Double calcularDano() {
        return danoFisico + getDanoFisico();
    }

    //Getter
    public Double getDanoFisico() {
        return danoFisico;
    }

    //Setter
    public void setDanoFisico(Double danoFisico) {
        this.danoFisico = danoFisico;
    }
}
