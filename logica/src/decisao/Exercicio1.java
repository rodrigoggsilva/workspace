package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		String nomeCliente = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
		String regiao = JOptionPane.showInputDialog("Digite a regi�o que voc� mora").toUpperCase();
		short tempoFidelidade = Short.parseShort(JOptionPane.showInputDialog("Digite o tempo de fidelidade em anos"));
		float valorInvestido = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor investido: "));
		float valorAtual=0;

		if (regiao.equals("SUL") || regiao.equals("SUDESTE")) {
			tempoFidelidade = (short) (tempoFidelidade * 1.20);
		}
		if (valorInvestido<1000) {
			valorAtual = valorInvestido * (float) 1.015;
		}else if (valorInvestido>5000) {
			valorAtual = valorInvestido * (float) 1.03;
		}else {
			valorAtual = valorInvestido * (float) 1.02;
		}
		if (tempoFidelidade>5) {
			valorAtual = valorAtual * (float) 1.01;
		}
		System.out.println("Cliente: " + nomeCliente + " da regiao: " + regiao);
		System.out.println("Valor atual: " + valorAtual);
		System.out.printf("Valor atual: %.2f\n", valorAtual);
		System.out.println("Diferen�a: " + (valorAtual - valorInvestido));



	}

}
