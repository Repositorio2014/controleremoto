package br.com.controleremoto.entity;

import java.util.Objects;

public abstract class Eletrodomestico {

    private Long id;
    private String nome;
    private boolean ligado = false;

    public Eletrodomestico() {
    }

    public Eletrodomestico(Long id, String nome, boolean ligado) {
        this.id = id;
        this.nome = nome;
        this.ligado = ligado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String toString() {
        return "Eletrodomestico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", ligado=" + ligado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Eletrodomestico that = (Eletrodomestico) o;
        return ligado == that.ligado && Objects.equals(id, that.id) && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, ligado);
    }
}
