package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		
String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();

	float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota1"));
    float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota2"));
    short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite o n�mero total de faltas"));
    float media = (nota1 + nota2) / 2;
    System.out.println("Aluno " + nome + " sua m�dia foi: " + media);
        if (media>=6 && faltas<=20) {
    	System.out.println("Aluno " + nome + " Parabens, voc� est� aprovado!!");
    }else if (media<4 || faltas>20) {
    	System.out.println("Infelizmente  " + nome + " voc� foi reprovado!!!");
    	if (media>=4 && media<=5.9){
        	System.out.println( nome + "  voc� ainda tem chance no exame");	
    }else if (faltas<=20) {
    	System.out.println( nome + " Voc� ainda tem chance!");
    }
    
    
    }
	}

}
//System.out.println("Aluno: " + nome + " Sua m�dia foi : " + media);