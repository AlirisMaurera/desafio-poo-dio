import br.com.alirismaurera.dominio.Bootcamp;
import br.com.alirismaurera.dominio.Curso;
import br.com.alirismaurera.dominio.Dev;
import br.com.alirismaurera.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso POO");
        curso1.setDescricao("Programação Orientada a Objetos");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Collection");
        curso2.setDescricao("Implementado coleções em nosso código");
        curso2.setCargaHoraria(10);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso SpringBoot");
        curso3.setDescricao("Elaboração de um projeto Api");
        curso3.setCargaHoraria(15);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDecricao("Desenvolvimento Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        Dev devAliris = new Dev();
        devAliris.setNome("Aliris");
        devAliris.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Aliris = " + devAliris.getConteudoInscritos() );

        devAliris.progredir();

        System.out.println("\nConteudos Inscritos Aliris = " + devAliris.getConteudoInscritos() );
        System.out.println("\nConteudos Concluídos Aliris = " + devAliris.getConteudoConcluidos());
        System.out.println("\nXP: " + devAliris.calcularTotalXp());

        System.out.println("\n------- **** -------- ***** ------- ******* --------\n");

        Dev devSebastian = new Dev();
        devSebastian.setNome("Sebastian");
        devSebastian.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos Inscritos Sebastian = " + devSebastian.getConteudoInscritos() );

        devSebastian.progredir();
        devSebastian.progredir();
        devSebastian.progredir();

        System.out.println("\nConteudos Inscritos Sebastian = " + devSebastian.getConteudoInscritos() );
        System.out.println("\nConteudos Concluídos Sebastian = " + devSebastian.getConteudoConcluidos());
        System.out.println("\nXP: " + devSebastian.calcularTotalXp());

    }
}
