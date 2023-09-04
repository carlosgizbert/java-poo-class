public class TestaBuscaAlunosNoCurso {

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

        System.out.println("Quem é o aluno com matricula 5617?");
        Aluno alunoBuscado = javaColecoes.buscaMatriculado(5617);
        System.out.println("Aluno buscado: " + alunoBuscado);
    }
}
