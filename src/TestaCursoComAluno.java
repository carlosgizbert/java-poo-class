import java.util.List;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções di java", "Paulo Silveira");
        javaColecoes.adiciona(new Aula("Trabalhando com arraylist", 15));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme SIlveira", 5617);
        Aluno a3 = new Aluno("Mauricio aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos alunos: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println("Aluno: " + aluno);
        });

        System.out.println("O aluno " + a1.getNome() + " está matriculado?");
        javaColecoes.estaMatriculado(a1);

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("Esse turini está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("O a1 é equals ao Turini?");
        System.out.println(a1.equals(turini));
    }
}
