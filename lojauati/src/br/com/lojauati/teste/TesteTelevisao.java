package br.com.lojauati.teste;

import br.com.lojauati.modelo.Televisao;

public class TesteTelevisao {

	public static void main(String[] args) {
		Televisao tv = new Televisao();
		tv.mudarCanal(50);
		System.out.println(tv.exibirTudo());
		tv.ligar();
		System.out.println(tv.exibirTudo());
			tv.mudarCanal(45);
			System.out.println(tv.exibirTudo());
			tv.aumentarVolume();
			tv.aumentarVolume();
			tv.aumentarVolume();
			tv.aumentarVolume();
			tv.aumentarVolume();
			tv.aumentarVolume();
			System.out.println(tv.exibirTudo());
	}

}
