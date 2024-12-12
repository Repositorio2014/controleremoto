package br.com.controleremoto;

import br.com.controleremoto.controller.ControleArCondicionadoImpl;
import br.com.controleremoto.controller.ControleTelevisaoImpl;
import br.com.controleremoto.entity.ArCondicionado;
import br.com.controleremoto.entity.Eletrodomestico;
import br.com.controleremoto.entity.Televisao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControleremotoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleremotoApplication.class, args);

		ControleTelevisaoImpl tvImpl = new ControleTelevisaoImpl();
		ControleArCondicionadoImpl arImpl = new ControleArCondicionadoImpl();

		Eletrodomestico tv = new Televisao(1L, "Semptoshiba", true, 8, 3);
		Eletrodomestico ar = new ArCondicionado(2L, "Elgin 1200 btus", true, 8,1);

		if(tv.isLigado() == false){
			System.out.println("Aparelho de Tv desligado!");

		}else {
			System.out.println("==========================Televisao============================");
			System.out.println("O aparelho " + tv.getNome() + " esta " + tvImpl.ligarDesligar(tv) + "!");
			System.out.println(tvImpl.mudarCanal((Televisao) tv));
			System.out.println(tvImpl.aumentarVolume((Televisao) tv));
			System.out.println(tvImpl.baixarVolume((Televisao) tv));
			System.out.println(tv.toString());
			System.out.println("===============================================================");
		}

		if(ar.isLigado() == false){
			System.out.println("Ar-Condicionado desligado!");

		}else {
			System.out.println("==========================Ar-Condicionado======================");
			System.out.println("O Ar-Condicionado " + ar.getNome() + " esta " + arImpl.ligarDesligar(ar) + "!");
			System.out.println(arImpl.aumentarTemperatura((ArCondicionado) ar));
			System.out.println(arImpl.baixarTemperatura((ArCondicionado) ar));
			System.out.println(ar.toString());
			System.out.println("===============================================================");
		}

	}

}
