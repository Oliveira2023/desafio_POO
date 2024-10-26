package br.com.dio.desafio.dominio;

import java.util.Objects;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10.0;

    private String titulo;
    private String descricao;

    public abstract double calcularXP();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conteudo conteudo)) return false;
        return Objects.equals(getTitulo(), conteudo.getTitulo());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getTitulo());
    }
}
