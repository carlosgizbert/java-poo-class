import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções di java", "Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);

        aulas.add(new Aula("Trabalhando com ArrayList", 21));

        System.out.println(aulas);

        javaColecoes.adiciona(new Aula("Aula adicionada", 14));

        System.out.println(aulas);
    }
}
