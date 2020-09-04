package projetoindividualamanda.game.personagem;

import projetoindividualamanda.game.item.Item;
import projetoindividualamanda.game.item.Pocao;

import java.util.List;

public class Heroi extends Personagem {

    //Atributos
    private String sexo;
    private Item recurso;
    private Double xpMeta;
    private Integer saquinhoOuro;
    private List<Item> bag;

    public Heroi(String nome, String sexo) {
        super(nome, 1, 0.0, 10.0, 10.0, 2.0, 1.0);
        this.sexo = sexo;
        this.recurso = null;
        this.xpMeta = 100.0;
        this.saquinhoOuro = 0;
        this.bag = bag;
    }

    //Método
    public void atributosLevel() {
        setVidaMaxima(getVidaMaxima() * 0.2);
        setVida(getVida() * 0.3);
        setDanoBase(getDanoBase() * 0.1);
        setDefesa(getDefesa() * 0.03);
        setXpMeta(getXpMeta() * 0.9);
    }

    public void levelUp(){
        if(getXp()  >= getXpMeta()){
            setLevel(getLevel() + 1);
            atributosLevel();
        }
    }

    public void adicionarItemBag(Item item){
        bag.add(item);
        item.setQuantidadeItem(item.getQuantidadeItem() + 1);
    }

    public void comprarItem(Item item){
        if (getSaquinhoOuro() >= item.getValor()){
            adicionarItemBag(item);
            setSaquinhoOuro(getSaquinhoOuro() - item.getValor());
        }else{
            System.out.println("Sem Gold.");
        }
    }

    public void atribuirPocao(Pocao pocao){
        if ((pocao.getValorAtribuir() + getVida()) <= getVidaMaxima()) {
            System.out.println("\nglup... glup...\n");
            setVida(getVida() + pocao.getValorAtribuir());
            pocao.setQuantidadeItem(pocao.getQuantidadeItem() -1);

        }else if (pocao.getValorAtribuir() + getVida() > getVidaMaxima()){
            System.out.println("\nglup... glup...\n");
            setVida(getVidaMaxima());
            pocao.setQuantidadeItem(pocao.getQuantidadeItem() -1);
        }
    }

    public void beberPocao(Pocao pocao){
        for (int cont = 0; cont < getBag().size() ; cont ++){
            if (pocao instanceof Pocao){
                atribuirPocao(pocao);
                bag.remove(pocao);
                cont = getBag().size();
                return;
            }
        }
    }

    public Double porcentagemVida(){
        return ((getVida()/getVidaMaxima()) * 100);
    }

    public List<Item> exibirBag(){
        return bag;
    }

    @Override
    public void getAtacar(Heroi heroi, Vilao vilao) {
        vilao.setVida(((vilao.getVida() - heroi.getDanoBase()) + vilao.getDefesa()));
    }

    //Getter
    public String getSexo() {
        return sexo;
    }

    public Double getXpMeta() {
        return xpMeta;
    }

    public Integer getSaquinhoOuro() {
        return saquinhoOuro;
    }

    public List<Item> getBag() {
        return bag;
    }

    public Item getRecurso() {
        return recurso;
    }

    //Setter
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setXpMeta(Double xpMeta) {
        this.xpMeta = xpMeta;
    }

    public void setSaquinhoOuro(Integer saquinhoOuro) {
        this.saquinhoOuro = saquinhoOuro;
    }

    public void setBag(List<Item> bag) {
        this.bag = bag;
    }

    public void setRecurso(Item recurso) {
        this.recurso = recurso;
    }
}
