package projetoindividualamanda.game.item;

public class Pocao extends Item{

    //Atributos
    private String tipo;
    private Integer valorAtribuir;

    //Construtor
    public Pocao(String nome, Integer codigo, Integer valor, Integer espaco, String raridade, String tipo, Integer valorAtribuir) {
        super(nome, codigo, valor, espaco, raridade);
        this.tipo = tipo;
        this.valorAtribuir = valorAtribuir;
    }

    //ToString


    @Override
    public String toString() {
        return "\nPocao" +
                "\nTipo: " + tipo +
                "\nValor atribuir: " + valorAtribuir +
                super.toString();
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
