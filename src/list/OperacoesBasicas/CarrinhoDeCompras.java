package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome,Double preco, Integer quantidade){
        itemList.add(new Item(nome,preco,quantidade));
    }
    public void removeItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item i: itemList ) {
            if(i.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }
    public Double calcularValor(){
        Double valorTotal = 0.00;
        for (Item i: itemList ) {
            valorTotal += i.getPreco();
        }
        return valorTotal;
    }
    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Feijão", 12.99,1);
        carrinhoDeCompras.adicionarItem("Macarrão", 6.99,2);
        carrinhoDeCompras.adicionarItem("Feijão", 12.99,1);
        carrinhoDeCompras.adicionarItem("Uva", 18.99,1);

        System.out.println();
        carrinhoDeCompras.exibirItens();

        System.out.printf("O valor total da sua lista é= %.2f\n",carrinhoDeCompras.calcularValor());

        carrinhoDeCompras.removeItem("Feijão");
        System.out.println();
        carrinhoDeCompras.exibirItens();
        System.out.printf("O novo valor total da sua lista é= %.2f\n",carrinhoDeCompras.calcularValor()) ;

    }

}