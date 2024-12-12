package br.com.controleremoto.entity;

import java.util.Objects;

public class Televisao extends Eletrodomestico{

    private int volume;
    private int canal = 1;

    public Televisao(Long id, String nome, boolean ligado, int volume, int canal) {
        super(id, nome, ligado);
        this.volume = volume;
        this.canal = canal;
    }

    public Televisao() {
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "Id=" + this.getId() +
                ", Nome=" + this.getNome() +
                ", volume=" + volume +
                ", canal=" + canal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Televisao televisao = (Televisao) o;
        return volume == televisao.volume && canal == televisao.canal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), volume, canal);
    }
}
