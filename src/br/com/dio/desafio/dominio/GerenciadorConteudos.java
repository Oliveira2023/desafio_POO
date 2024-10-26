package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorConteudos {
    public List<Curso> cursos = new ArrayList<>();
    public List<Mentoria> mentorias = new ArrayList<>();


    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void imprimirCursos() {
        System.out.println("Cursos cadastrados:");
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }
    public void imprimirMentorias() {
        System.out.println("Mentorias cadastradas:");
        for (Mentoria mentoria : mentorias) {
            System.out.println(mentoria);
        }
    }
    public void imprimirConteudos() {
        imprimirCursos();
        imprimirMentorias();
    }
}
