package projetoindividualamanda.game.item;

public class Pocao extends Item{

    //Atributos
    private String tipo;
    private Integer valorAtribuir;

    //Construtor
    public Pocao(String nome, Integer codigo, Integer valor, String raridade, Integer nivelRaridade, Integer quantidadeItem, String tipo, Integer valorAtribuir) {
        super(nome, codigo, valor, raridade, nivelRaridade, quantidadeItem);
        this.tipo = tipo;
        this.valorAtribuir = valorAtribuir;
    }


    //Getter

    public String getTipo() {
        return tipo;
    }

    public Integer getValorAtribuir() {
        return valorAtribuir;
    }

    //Setter

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValorAtribuir(Integer valorAtribuir) {
        this.valorAtribuir = valorAtribuir;
    }
}
