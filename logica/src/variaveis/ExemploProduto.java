package variaveis;

import javax.swing.JOptionPane;

public class ExemploProduto {

	public static void main(String[] args) {
		// Solicitar os dados:
		// nome do produto
		// quantidade
		// valor
		// Exibir o total e o nome do produto
		// Exibir o total com 10¢ de desconto
		
		String produto = "" ;
		int quantidade = 0;
		double valor =0;
				
		produto = JOptionPane.showInputDialog("Digite o nome do produto");
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
		
		double total = quantidade * valor;
		double desconto = (valor * quantidade) * 0.9;
		
		System.out.println("Produto..: " + produto);
		System.out.println("Quantidade.: " + quantidade);
		System.out.println("Valor: " + valor);
		System.out.println("Total..: " + total);
		System.out.println("Desconto...: " + desconto);
}
}
