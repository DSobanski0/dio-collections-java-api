package set.operacoesBasicas.conjuntoDePalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        conjuntoLinguagens.adicionarPalavra("Palavra 1");
        conjuntoLinguagens.adicionarPalavra("Palavra 2");
        conjuntoLinguagens.adicionarPalavra("Palavra 3");
        conjuntoLinguagens.adicionarPalavra("Palavra 4");
        conjuntoLinguagens.adicionarPalavra("Palavra 4");
        conjuntoLinguagens.adicionarPalavra("Palavra 6");

        conjuntoLinguagens.exibirPalavrasUnicas();

        conjuntoLinguagens.removerPalavra("Palavra 4");
        conjuntoLinguagens.exibirPalavrasUnicas();

        conjuntoLinguagens.removerPalavra("Palavra 8");

        System.out.println("A Palavra 2 está no conjunto? " + conjuntoLinguagens.verificarPalavra("Palavra 2"));
        System.out.println("A Palavra 4 está no conjunto? " + conjuntoLinguagens.verificarPalavra("Palavra 4"));

        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
