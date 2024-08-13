package set.ordenacao.listaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(long matricula, String nome, double media) {
        alunos.add(new Aluno(matricula, nome, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoRemovido = null;
        for (Aluno aluno : alunos) {
            if(aluno.getMatricula() == matricula) {
                alunoRemovido = aluno;
            }
        }
        alunos.remove(alunoRemovido);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        return new TreeSet<>(alunos);
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorPreco = new TreeSet<>(new ComparatorPorMedia());
        alunosPorPreco.addAll(alunos);
        return alunosPorPreco;
    }

    public void exibirAlunos() {
        System.out.println(alunos);
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno(123456L, "João", 7.5);
        gerenciadorAlunos.adicionarAluno(123457L, "Maria", 9.0);
        gerenciadorAlunos.adicionarAluno(123458L, "Carlos", 5.0);
        gerenciadorAlunos.adicionarAluno(123459L, "Ana", 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunos);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println(gerenciadorAlunos.alunos);

        // Exibindo alunos ordenados por nome
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        // Exibindo alunos ordenados por nota
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
