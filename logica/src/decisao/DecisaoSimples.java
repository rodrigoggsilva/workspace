package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
	float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota1"));
    float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota2"));
    float media = (nota1 + nota2) / 2;
    System.out.println("Aluno: " + nome + " Sua m�dia foi : " + media);
    if (media>=6) {
    	System.out.println("Parabens " + nome + " voc� est� aprovado!!!");
    }
    if (media<=5) {
    	System.out.println("N�o foi dessa vez " + nome + " voc� est� Ferrado!!!");
    }
    if (media<4) {
    	System.out.println("Infelizmente  " + nome + " Voc� foi reprovado!!!!!!");
    }
    if (media>=4 && media<=5.9){
    	System.out.println( nome + "  voc� ainda tem chance no exame");
    
    	
    }
	}

}
