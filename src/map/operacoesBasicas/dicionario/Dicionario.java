package map.operacoesBasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> palavras;

    public Dicionario() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String descricao) {
        palavras.put(palavra, descricao);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(palavras);
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPorNome = null;
        if (!palavras.isEmpty()) {
            palavraPorNome = palavras.get(palavra);
        }
        return palavraPorNome;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
