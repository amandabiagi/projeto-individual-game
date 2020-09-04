package projetoindividualamanda.game.item;

import java.util.Random;

public abstract class Item {

    //Atributos
    private String nome;
    private Integer codigo;
    private Integer valor;
    private Integer espaco;
    private String raridade;
    private Integer nivelRaridade;
    private Integer quantidadeItem;
    private Integer contador;

    //Construtor
    public Item(String nome, Integer codigo, Integer valor, Integer espaco, String raridade) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.espaco = espaco;
        this.raridade = raridade;
        this.quantidadeItem = 0;
        this.contador = 0;
    }

    //Métodos
    public void chancesDeConquista(){
        Random sortearRaridade = new Random();
        nivelRaridade = sortearRaridade.nextInt(100);
    }

    //ToString
    @Override
    public String toString() {
        return  "\nValor: " + valor +
                "\nQt: " + quantidadeItem;
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

    public Integer getEspaco() {
        return espaco;
    }

    public Integer getContador() {
        return contador;
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

    public void setEspaco(Integer espaco) {
        this.espaco = espaco;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }
}
