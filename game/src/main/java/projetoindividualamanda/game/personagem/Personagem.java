package projetoindividualamanda.game.personagem;

import java.util.List;
public abstract class Personagem {

    //Atributos
    private String nome;
    private Integer level;
    private Double xp;
    private Double vida;
    private Double vidaMaxima;
    private Double danoBase;
    private Double defesa;

    public Personagem(String nome, Integer level, Double xp, Double vida, Double vidaMaxima, Double danoBase, Double defesa) {
        this.nome = nome;
        this.level = level;
        this.xp = xp;
        this.vida = vida;
        this.vidaMaxima = vidaMaxima;
        this.danoBase = danoBase;
        this.defesa = defesa;
    }

    //Método
    public abstract void getAtacar(Heroi heroi, Vilao vilao);

    //Getter
    public String getNome() {
        return nome;
    }

    public Integer getLevel() {
        return level;
    }

    public Double getXp() {
        return xp;
    }

    public Double getVida() {
        return vida;
    }

    public Double getVidaMaxima() {
        return vidaMaxima;
    }

    public Double getDanoBase() {
        return danoBase;
    }

    public Double getDefesa() {
        return defesa;
    }


    //Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setXp(Double xp) {
        this.xp = xp;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public void setVidaMaxima(Double vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public void setDanoBase(Double danoBase) {
        this.danoBase = danoBase;
    }

    public void setDefesa(Double defesa) {
        this.defesa = defesa;
    }
}
