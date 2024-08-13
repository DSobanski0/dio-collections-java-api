package set.operacoesBasicas.conjuntoDeConvidados;

import java.util.Objects;

public class Convidado {

    private int codigo;
    private String nome;

    public Convidado(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigo() == convidado.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
