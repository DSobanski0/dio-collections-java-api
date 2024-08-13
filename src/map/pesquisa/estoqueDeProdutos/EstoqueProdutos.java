package map.pesquisa.estoqueDeProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(produtosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0.0;
        if(!produtosMap.isEmpty()) {
            for (Produto produto : produtosMap.values()) {
                valorTotal += produto.getPreco() * produto.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!produtosMap.isEmpty()) {
            for (Produto produto : produtosMap.values()) {
                if(produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                    maiorPreco = produto.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!produtosMap.isEmpty()) {
            for (Produto produto : produtosMap.values()) {
                if(produto.getPreco() < menorPreco) {
                    produtoMaisBarato = produto;
                    menorPreco = produto.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaisCaro = null;
        double menorPreco = Double.MIN_VALUE;
        if(!produtosMap.isEmpty()) {
            for (Produto produto : produtosMap.values()) {
                if(produto.getPreco() * produto.getQuantidade() > menorPreco) {
                    produtoMaisCaro = produto;
                    menorPreco = produto.getPreco() * produto.getQuantidade();
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
