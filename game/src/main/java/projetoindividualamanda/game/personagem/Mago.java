package projetoindividualamanda.game.personagem;

public class Mago extends Heroi{

    //Atributo
    private Double danoMagico;

    //Construtor
    public Mago(String nome, String sexo) {
        super(nome,sexo,"Mago");
        this.danoMagico = 3.0;
    }

    //Método


    @Override
    public Double calcularDano() {
        return getDanoBase() + getDanoMagico();
    }

    //ToString


    @Override
    public String toString() {
        return "Mago{" +
                "danoMagico=" + danoMagico +
                '}';
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
