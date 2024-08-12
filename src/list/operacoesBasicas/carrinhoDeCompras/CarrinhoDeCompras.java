package list.operacoesBasicas.carrinhoDeCompras;

import list.operacoesBasicas.listaDeTarefas.ListaTarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itens.add(item);
    }

    public void removerItem(String nome) {
        itens = itens.stream().filter(item -> !item.getNome().equalsIgnoreCase(nome)).collect(Collectors.toList());
    }

    public Double calcularValorTotal() {
        Double valorTotal = 0.0;
        for (Item item : itens) {
            valorTotal += item.getQuantidade() * item.getPreco();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.adicionarItem("Item 1", 3.0, 2);
        carrinhoDeCompras.adicionarItem("Item 1", 3.0, 1);
        carrinhoDeCompras.adicionarItem("Item 2", 10.0, 3);
        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Item 1");
        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();
    }
}
