package repeticao;

import javax.swing.JOptionPane;

public class ExercicioGeral {

	public static void main(String[] args) {
		/* Monte uma aplicação que solicite a idade e o nome das pessoas
		 * Ao terminar (o usuário respondeu que não quer continuar), 
		 * A aplicação deverá exibir:
		 * a pessoa mais velha(nome),
		 *  a pessoa mais nova(nome),
		 *  a quantidade de pessoas maiores de idade
		 *  a media entre as idades que foram digitadas
		 * 
		 */

		String nome = "";
		int idade = 0;
		char pergunta=0;
		int qtdeMaiores=0;
		int totalIdades=0;
		int qtdePessoas=0;
		String nomeJovem="";
		String nomeExperiente="";
		int idadeJovem=0;
		int idadeExperiente=0;
		
			do {
			nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
			totalIdades= totalIdades+idade;
			qtdePessoas++;
			
			if (qtdePessoas==1) {
				nomeExperiente=nome;
				idadeExperiente=idade;
				nomeJovem=nome;
				idadeJovem=idade;
			}else {
			
		if (idade>idadeExperiente) {
			nomeExperiente = nome;
			idadeExperiente = idade;
			
		}
		{if (idade<idadeJovem) {
			nomeJovem=nome;
			idadeJovem=idade;
		}
			pergunta = JOptionPane.showInputDialog("Digite S para continur").toUpperCase().charAt(0);
			}while(pergunta=='S');
						
			System.out.println("Nome..: " + nome);
			System.out.println("Idade.: " + idade);
			if (idade >17) {
				qtdeMaiores++;
			}
			
			
			 
			System.out.println("Qtde de Pessoas maiores de idade: " + qtdeMaiores);
			System.out.println("Média de idade: " + (totalIdades/qtdePessoas));
			System.out.println(nomeExperiente + " é o mais experiente com " + idadeExperiente +  " anos");
			System.out.println(nomeJovem + " é o mais jovem com " + idadeJovem+ " anos");
			}
			}
	
}
}
