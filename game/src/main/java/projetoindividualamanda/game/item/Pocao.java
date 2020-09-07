package projetoindividualamanda.game.item;

public class Pocao extends Item {

    //Atributos
    private String tipo;


    //Construtor
    public Pocao(String nome, Integer codigo, Integer valor, Integer espaco, String raridade, String tipo, Integer valorAtribuir) {
        super(nome, codigo, valorAtribuir, valor, espaco, raridade);
        this.tipo = tipo;
    }

    //ToString


    @Override
    public String toString() {
        return "\nPocao" +
                "\nTipo: " + tipo +
                super.toString();
    }

    //Getter
    public String getTipo() {
        return tipo;
    }


    //Setter
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
