package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Email").toLowerCase();
		
			while (email.contains("@")==false) {
			email = JOptionPane.showInputDialog("Email novamente").toLowerCase();
			
			String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
			while (nome.length()<5 || nome.length()>15) {
		}
System.out.println(email);
System.out.println("Nome :");
	}
	}
}
