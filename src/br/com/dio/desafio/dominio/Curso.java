package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso extends Conteudo {
    private int cargaHoraria;
    private static List<Curso> cursos = new ArrayList<>();

    public Curso(String titulo) {
        if (cursoCadastrado(titulo)) {
            System.out.println("Curso já cadastrado.");
        }else {
            setTitulo(titulo);
            cursos.add(this);
        }
    }
    public boolean cursoCadastrado(String titulo) {
        return cursos.stream()
                .anyMatch(curso -> curso.getTitulo().equals(titulo));
    }

    public static void imprimirCursos() {
        System.out.println("Cursos cadastrados:");
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "{Curso='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
