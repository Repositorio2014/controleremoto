package br.com.controleremoto.repository;

import br.com.controleremoto.entity.ArCondicionado;

public interface ControleArCondicionadoRepository extends ControleRepository{

    String baixarTemperatura(ArCondicionado ar);
    String aumentarTemperatura(ArCondicionado ar);
}
