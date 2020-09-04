package projetoindividualamanda.game.item;

import java.util.Random;

public abstract class Item {

    //Atributos
    private String nome;
    private Integer codigo;
    private Integer valor;
    private String raridade;
    private Integer nivelRaridade;
    private Integer quantidadeItem;

    //Construtor
    public Item(String nome, Integer codigo, Integer valor, String raridade, Integer nivelRaridade, Integer quantidadeItem) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.raridade = raridade;
        this.nivelRaridade = nivelRaridade;
        this.quantidadeItem = quantidadeItem;
    }

    //Métodos
    public void chancesDeConquista(){
        Random sortearRaridade = new Random();
        nivelRaridade = sortearRaridade.nextInt(100);
    }

    //ToString


    @Override
    public String toString() {
        return  "Nome: " + nome +
                "Código: " + codigo +
                "Valor: " + valor;
    }

    //Getter
    public String getNome() {
        return nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getValor() {
        return valor;
    }

    public Integer getNivelRaridade() {
        return nivelRaridade;
    }

    public Integer getQuantidadeItem() {
        return quantidadeItem;
    }

    public String getRaridade() {
        return raridade;
    }

    //Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void setNivelRaridade(Integer nivelRaridade) {
        this.nivelRaridade = nivelRaridade;
    }

    public void setQuantidadeItem(Integer quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }
}
