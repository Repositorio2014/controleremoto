package br.com.controleremoto.controller;

import br.com.controleremoto.entity.ArCondicionado;
import br.com.controleremoto.entity.Eletrodomestico;
import br.com.controleremoto.repository.ControleArCondicionadoRepository;

public class ControleArCondicionadoImpl implements ControleArCondicionadoRepository {

    private String retorno = "";

    @Override
    public String baixarTemperatura(ArCondicionado ar) {
        return this.retorno = "O volume baixou para " + this.calculoBaixarTemperatura(ar.getTemperatura()) + "graus C.";
    }

    @Override
    public String aumentarTemperatura(ArCondicionado ar) {
        return this.retorno = "O volume aumentou para " + this.calculoAumentarTemperatura(ar.getTemperatura()) + "graus C.";
    }

    @Override
    public String ligarDesligar(Eletrodomestico eletro) {
        return this.retorno = eletro.isLigado() != false ? "Ligado" : "Desligado";
    }

    private int calculoAumentarTemperatura(int temp){
        return temp += temp;
    }

    private int calculoBaixarTemperatura(int temp){
        return temp -= temp;
    }
}
