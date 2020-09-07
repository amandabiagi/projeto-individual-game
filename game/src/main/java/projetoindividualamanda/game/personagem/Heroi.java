package projetoindividualamanda.game.personagem;

import projetoindividualamanda.game.item.Item;
import projetoindividualamanda.game.item.Pocao;
import projetoindividualamanda.game.mercado.Loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Heroi extends Personagem {


    //Atributos
    private String sexo;
    private Item recurso;
    private Double xpMeta;
    private Integer saquinhoOuro;
    private Boolean sorte;
    private String classe;
    private List<Item> bag;

    public Heroi(String nome, String sexo, String classe) {
        super(nome, 1, 0.0, 10.0, 10.0, 1.0, 1.0);
        this.sexo = sexo;
        this.recurso = null;
        this.xpMeta = 100.0;
        this.saquinhoOuro = 0;
        this.sorte = false;
        this.bag = new ArrayList<>();
    }

    //Método


    @Override
    public Double calcularDano() {
        return getDanoBase();
    }

    public void vitoria(Vilao vilao){
        setXp(getXp() + vilao.getXp());
        levelUp();
        vilao.quantOuro();
        setSaquinhoOuro(getSaquinhoOuro() + vilao.getOuroDrop());
        vilao.getItemDrop().chancesDeConquista();

        if (vilao.getItemDrop().getRaridade() == "Comum" && vilao.getItemDrop().getNivelRaridade() <= 50) {
            adicionarItemBag(vilao.getItemDrop());
        } else if (vilao.getItemDrop().getRaridade() == "Raro" && vilao.getItemDrop().getNivelRaridade() > 50 && vilao.getItemDrop().getNivelRaridade() <= 85) {
            adicionarItemBag(vilao.getItemDrop());
        } else if(vilao.getItemDrop().getRaridade() == "Epico" && vilao.getItemDrop().getNivelRaridade() > 85 && vilao.getItemDrop().getNivelRaridade() <= 100){
            adicionarItemBag(vilao.getItemDrop());
        }
    }

    public void atributosLevel() {
        setVidaMaxima(getVidaMaxima() * 1.2);
        setVida(getVida() * 1.3);
        setDanoBase(getDanoBase() * 1.9);
        setDefesa(getDefesa() * 1.03);
        setXpMeta(getXpMeta() * 1.9);
    }

    public void levelUp(){
        if(getXp()  >= getXpMeta()){
            setLevel(getLevel() + 1);
            atributosLevel();
        }
    }

    public void adicionarItemBag(Item item){
        item.setQuantidadeItem(item.getQuantidadeItem() + 1);
        bag.add(item);
    }

    public void comprarItem(Item item, Loja loja){
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
                //cont = getBag().size();
                return;
            }
        }
        System.out.println("Sem poção");
    }

    public Double porcentagemVida(){
        return ((getVida()/getVidaMaxima()) * 100);
    }

    public void exibirBag(){
        System.out.println("\nBAG");
        for (Item item : bag) {
            if (item.getContador() == 0) {
                item.setContador(1);
            }
        }
        for (Item item : bag){
            if (bag.isEmpty()) {
                System.out.println("BAG vazia");
            }else {
                if (item.getContador() == 1) {
                    System.out.println(item.getNome() + " Quantidade: " + item.getQuantidadeItem());
                    item.setContador(0);
                }
            }
        }
    }

    public void exibirHeroi(){
        System.out.println(String.format("%s lvl:%d \nDano base: %.2f Defesa: %.2f \nVida: %.2f%s \nGold: %d",
                getNome(),getLevel(),getDanoBase(),getDefesa(),porcentagemVida(),"%",getSaquinhoOuro()));
    }

    public void sortear(){
        Integer numero = 0;
        Random sortear = new Random();
        numero = sortear.nextInt(100);
        if (numero <= 50) {
            sorte = true;
        }
    }

    public void lutar(Vilao vilao){
        sortear();
        do {
            if (sorte) {
                vilao.setVida(((vilao.getVida() -  calcularDano()) + vilao.getDefesa()));
            }else {
                setVida(((getVida() - vilao.calcularDano()) + getDefesa()));
            }
        }while (getVida() <= 0 || vilao.getVida() <= 0);
        if (getVida() > 0){
            vitoria(vilao);
        }
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

    public Boolean getSorte() {
        return sorte;
    }

    public String getClasse() {
        return classe;
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

    public void setSorte(Boolean sorte) {
        this.sorte = sorte;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setRecurso(Item recurso) {
        this.recurso = recurso;
    }

}
