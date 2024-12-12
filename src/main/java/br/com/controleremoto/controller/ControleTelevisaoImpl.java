package br.com.controleremoto.controller;

import br.com.controleremoto.entity.Eletrodomestico;
import br.com.controleremoto.entity.Televisao;
import br.com.controleremoto.repository.ControleTvRepository;

public class ControleTelevisaoImpl implements ControleTvRepository {

    private String retorno = "";

    @Override
    public String ligarDesligar(Eletrodomestico eletro) {
        return this.retorno = eletro.isLigado() != false ? "Ligado" : "Desligado";
    }


    @Override
    public String mudarCanal(Televisao tv) {
        return this.retorno = "O canal mudou para " + tv.getCanal() + ".";
    }

    @Override
    public String aumentarVolume(Televisao tv) {
        return this.retorno = "O volume aumentou para " + tv.getVolume() + ".";
    }

    @Override
    public String baixarVolume(Televisao tv) {
        return this.retorno = "O volume baixou para " + this.alterairVolume(tv.getVolume()) + ".";
    }

    private int alterairVolume(int volume){
        return volume -= volume;
    }
}
