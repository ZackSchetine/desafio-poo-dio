import dio.desafio.dominio.Bootcamp;
import dio.desafio.dominio.Curso;
import dio.desafio.dominio.Dev;
import dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição do curso Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("descrição da mentoria Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Dev-01");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos " +dev1.getNome()+ ": " +dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("\nConteúdos inscritos " +dev1.getNome()+ ": " +dev1.getConteudosInscritos());
        System.out.println("\nConteúdos concluídos " +dev1.getNome()+ ": " +dev1.getConteudosConcluidos());
        System.out.println("XP = " +dev1.calcularTotalXp());

        System.out.println("----------");

        Dev dev2 = new Dev();
        dev2.setNome("Dev-02");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos " +dev2.getNome()+ ": " +dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("\nConteúdos inscritos " +dev2.getNome()+ ": " +dev2.getConteudosInscritos());
        System.out.println("\nConteúdos concluídos " +dev2.getNome()+ ": " +dev2.getConteudosConcluidos());
        System.out.println("XP = " +dev2.calcularTotalXp());
    }
}
