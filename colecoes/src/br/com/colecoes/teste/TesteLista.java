package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		
		// String X[] = new String[2];
		
		//Collection com Generics
		List <String> lista = new ArrayList<String>();
		lista.add("DBA");
		lista.add("DEV");
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("ESTAGIARIO");
		System.out.println(lista);
		System.out.println("Segundo elemento da lista: " + lista.get(4));
		lista.remove(2);
		System.out.println("Lista após eliminar o terceiro elemento: " + lista);
		Collections.sort(lista);
		
		//for (int contador=0;contador<lista.size();contador++) {
		//System.out.println("Cargo: " + lista.get(contador));
		//}
		
		for (String cargo : lista) {
			System.out.println("Cargo: " + cargo);
		}
	}

}
