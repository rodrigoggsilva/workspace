package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite as faltas: "));
		if (faltas>20) {
			System.out.println("Reprovado or falta");
		}else  {

			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota2"));

			float media = (nota1 + nota2) / 2;
			System.out.println("Aluno " + nome + " sua m�dia foi: " + media);
			if (media>=6) {
				System.out.println("Aluno " + nome + " Parabens, voc� est� aprovado!!");
			}else if (media<4) {
				System.out.println("Infelizmente  " + nome + " voc� foi reprovado!!!");

			}else {
				System.out.println( nome + " Voc� ainda tem chance!");
			} // Fechando o ultimo else


		} // Fechando o primeiro else
	} //Fecha o m�todo

}// Fecha a classe
//System.out.println("Aluno: " + nome + " Sua m�dia foi : " + media);
//short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite o n�mero total de faltas"));