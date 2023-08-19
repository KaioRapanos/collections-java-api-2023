package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos
    private Map<Long,Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        estoqueProdutos.put(codigo,new Produto(nome,preco,quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutos);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p: estoqueProdutos.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()) {
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }

        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1l,"Produto A",5.0,10);
        estoque.adicionarProduto(2l,"Produto B",10,5);
        estoque.adicionarProduto(3l,"Produto C",15,2);
        estoque.adicionarProduto(4l,"Produto D",20.00,2);
        estoque.adicionarProduto(5l,"Produto E",0.00,0);

        estoque.exibirProdutos();

        System.out.println("Valor Total do estoque: R$"+estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: R$"+estoque.obterProdutoMaisCaro());
    }
}
