package exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Diarias"));
		float taxa = 0;
		if (diarias>15) {
			taxa= (float) 5.5;
			
		}else if (diarias<15) {
			taxa = 8;
			
		}else {
			taxa=6;
		}
		float valor = 80 + taxa;
		System.out.println("Total: " + (valor*diarias));
		


}

}



