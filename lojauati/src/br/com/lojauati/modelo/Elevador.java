package br.com.lojauati.modelo;

public class Elevador {

	private int qtdePessoas;
	private int capacidadePessoas;
	private int andarAtual;
	private int maiorAndar;
	private int menorAndar;

	
	public Elevador() {}
	public Elevador(int cp, int ma) {
		capacidadePessoas=cp;
		maiorAndar=ma;
	}
	
	public String exibirTudo() {
		return
				"Capacidade m�xima:....." + capacidadePessoas + "\n" +
				"Qtde de Pessoas Atual: " + qtdePessoas + "\n" +
				"Andar Atual..........: " + andarAtual + "\n" +
				"Maior Andar..........: " + maiorAndar + "\n" +
				"Menor Andar..........: " + menorAndar;
	}
	
	
	public void entrar (int entPessoas) {
		int total= qtdePessoas+entPessoas;
		if (total<=capacidadePessoas); {
			qtdePessoas+=entPessoas;
		}
	}

	public void sair (int sairPessoas) {
		if (sairPessoas<=qtdePessoas) {
			qtdePessoas-=sairPessoas;
		}
	}



	public void descer() {
		if (andarAtual>menorAndar) {
			andarAtual--;

		}
	}

	public void subir() {
		if (andarAtual<maiorAndar) {
			andarAtual++;
		}
	}

	public void preencherCapacidadePessoas(int capacPessoas) {
		if (capacPessoas>0) {
			capacidadePessoas=capacPessoas;
		}
	}

	public void preencherMenorAndar(int pMAndar) {
		if (pMAndar<maiorAndar) {
			menorAndar=pMAndar;

		}
	}


	// <modificador> <tipo_retorno> <nome>(<tipo param> <nome param>)
	public void preencherMaiorAndar(int pAndar) {
		if (pAndar>menorAndar) {
			maiorAndar=pAndar;

		}

	}

}