package br.com.controleremoto.repository;

import br.com.controleremoto.entity.Eletrodomestico;
import br.com.controleremoto.entity.Televisao;

public interface ControleTvRepository extends ControleRepository{

    String mudarCanal(Televisao tv);
    String aumentarVolume(Televisao tv);
    String baixarVolume(Televisao tv);
}
