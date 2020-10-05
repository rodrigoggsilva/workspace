package variaveis;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		// String � do tipo refer�ncia
		String email = JOptionPane.showInputDialog("Email");
		System.out.println("Original: " + email);
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Existe @?" + email.contains("@"));
		System.out.println("Qtde Caracteres:" + email.length());
		System.out.println("Do 2� ao 4�: " + email.substring(1,4));
		System.out.println("A partir do 2�: " + email.substring(1));
		System.out.println("Usuario: " + email.substring(email.indexOf("@")));
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1));
		System.out.println("Servidor principal: " + email.substring(email.indexOf("@")+1,email.indexOf(".")));
		System.out.println("Metade: " + email.substring(0, email.length() / 2));
		System.out.println("Compara��o Com Case Sensitive: " + (email.equals("abc@xpto.com.br")));
		System.out.println("Compara��o Sem Case Sensitive: " + (email.equalsIgnoreCase("abc@xpto.com.br")));
		
			
		
		
		
		

	}

}
