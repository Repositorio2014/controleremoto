package br.com.controleremoto.entity;

import java.util.Objects;

public class ArCondicionado extends Eletrodomestico{

    private int temperatura;
    private int incremento;

    public ArCondicionado(Long id, String nome, boolean ligado, int temperatura, int incremento) {
        super(id, nome, ligado);
        this.temperatura = temperatura;
        this.incremento = incremento;
    }

    public ArCondicionado() {
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    @Override
    public String toString() {
        return "ArCondicionado{" +
                "Id=" + this.getId() +
                ", Nome=" + this.getNome() +
                ", temperatura=" + temperatura +
                ", incremento=" + incremento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ArCondicionado that = (ArCondicionado) o;
        return temperatura == that.temperatura && incremento == that.incremento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temperatura, incremento);
    }
}
