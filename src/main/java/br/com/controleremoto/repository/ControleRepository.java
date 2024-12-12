package br.com.controleremoto.repository;

import br.com.controleremoto.entity.Eletrodomestico;

public interface ControleRepository {

    String ligarDesligar(Eletrodomestico eletrodomestico);

}
