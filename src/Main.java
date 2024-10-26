import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        GerenciadorConteudos gerenciadorConteudos = new GerenciadorConteudos();

        Curso curso1 = new Curso("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);
        gerenciadorConteudos.adicionarCurso(curso1);

        Curso curso2 = new Curso("JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(4);
        gerenciadorConteudos.adicionarCurso(curso2);

        Curso curso3 = new Curso("JavaScript");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());
        gerenciadorConteudos.adicionarMentoria(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição do BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootCamp);

        Dev devJoao = new Dev("João");
        devJoao.inscreverBootcamp(bootCamp);

        System.out.println("Conteúdos inscritos de Camila:");
        System.out.println(devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Camila:");
        System.out.println(devCamila.getConteudosConcluidos());

        devCamila.progredir();

//        System.out.println("Camila progredindo");
//        System.out.println("Conteúdos inscritos de Camila:");
//        System.out.println(devCamila.getConteudosInscritos());
//        System.out.println("Conteúdos concluídos de Camila:");
//        System.out.println(devCamila.getConteudosConcluidos());
//        System.out.println("XP de Camila: " + devCamila.calcularTotalXp());

//        System.out.println("Conteúdos inscritos de João:");
//        System.out.println(devJoao.getConteudosInscritos());
//        System.out.println("Conteúdos concluídos de João:");
//        System.out.println(devJoao.getConteudosConcluidos());
//        System.out.println("XP de Camila: " + devJoao.calcularTotalXp());

        devJoao.progredir();
//        System.out.println("João progredindo");
//        System.out.println("Conteúdos inscritos de João:");
//        System.out.println(devJoao.getConteudosInscritos());
//        System.out.println("Conteúdos concluídos de João:");
//        System.out.println(devJoao.getConteudosConcluidos());

        Dev devMaria = new Dev("João");
        devMaria.inscreverBootcamp(bootCamp);
//        System.out.println("Conteúdos inscritos de Maria:");
//        System.out.println(devMaria.getConteudosInscritos());
//
//        System.out.println("-------------------");
        Dev.listaDev();
        Curso.imprimirCursos();


    }
}