package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    private static final List<Dev> listaDevs = new ArrayList<>();

    public Dev(String nome) {
        if(nomeDublicado(nome)) {
            System.out.printf("Dev %s já cadastrado.\n", nome);
        }else {
            this.nome = nome;
            listaDevs.add(this);
        }
    }
    public boolean nomeDublicado(String nome) {
        for (Dev dev : listaDevs) {
            if (dev.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    public static void listaDev() {
        for (Dev dev : listaDevs) {
            System.out.println(dev.getNome());
        }
    }

    public void inscreverBootcamp(BootCamp bootcamp) {
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está inscrito em nenhum conteúdo no momento.");
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXP) // mapToDouble(conteudo -> conteudo.calcularXP())
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(getNome(), dev.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritos(), getConteudosConcluidos());
    }
}
