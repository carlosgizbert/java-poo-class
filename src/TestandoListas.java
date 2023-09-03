import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de liwtas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        for (String aula: aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é:" + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula: " + aulas.get(i));
        }

        System.out.println(aulas.size());

        // LAMBDA FUNCTION
        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Foreach lindo, aula:" + aula);
        });

        // CLASSE PARA MANIPULAR LISTAS
        aulas.add("Aumentando nosso conhecimento");
        System.out.println("Aulas antes da ordenação: " + aulas);
        Collections.sort(aulas);
        System.out.println("Aulas depois da ordenação: " + aulas);

    }

}
