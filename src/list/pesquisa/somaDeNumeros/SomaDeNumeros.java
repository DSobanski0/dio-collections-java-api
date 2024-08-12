package list.pesquisa.somaDeNumeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SomaDeNumeros {

    private List<Integer> numeros;

    public SomaDeNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumeros(int numero) {
        numeros.add(numero);
    }

    public Integer calcularSoma() {
        return numeros.stream().reduce(0, Integer::sum);
    }

    public Integer encontrarMaiorNumero() {
        Integer maior = 0;
        for (Integer numero : numeros) {
            if (numero > maior)
                maior = numero;
        }
        return maior;
    }

    public Integer encontrarMenorNumero() {
        Integer menor = Integer.MAX_VALUE;
        for (Integer numero : numeros) {
            if (numero < menor)
                menor = numero;
        }
        return menor;
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }

    public static void main(String[] args) {
        SomaDeNumeros somaDeNumeros = new SomaDeNumeros();

        somaDeNumeros.adicionarNumeros(5);
        somaDeNumeros.adicionarNumeros(10);
        somaDeNumeros.adicionarNumeros(15);
        somaDeNumeros.adicionarNumeros(10);
        System.out.println(somaDeNumeros.calcularSoma());

        System.out.println(somaDeNumeros.encontrarMaiorNumero());
        System.out.println(somaDeNumeros.encontrarMenorNumero());
        somaDeNumeros.exibirNumeros();
    }
}
