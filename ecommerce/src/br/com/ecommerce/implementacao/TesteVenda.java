package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;



public class TesteVenda {
	
	public static float f(String msg) {
	return Float.parseFloat(s(msg));
	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
		
	}
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg.toUpperCase());
	}

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
	endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
	endereco.setCep(JOptionPane.showInputDialog("CEP"));
	endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
	endereco.setComplemento(JOptionPane.showInputDialog("Complemento"));
	endereco.setEstado(JOptionPane.showInputDialog("Estado"));
	
		
		
		Produto produto = new Produto();
		produto.setDescricao(JOptionPane.showInputDialog("Descricao"));
		produto.setId(Integer.parseInt(JOptionPane.showInputDialog("ID")));
		produto.setValorVenda(Integer.parseInt(JOptionPane.showInputDialog("Valor da Venda")));
		
		Cliente cliente = new Cliente();
		cliente.setNome(JOptionPane.showInputDialog("Nome"));
		cliente.setEndereco(endereco);
		
	
		
	Venda venda = new Venda();
			
			venda.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("Nota Fiscal")), 
				JOptionPane.showInputDialog("Data"), 
				Integer.parseInt(JOptionPane.showInputDialog("Total")),
				produto,
				cliente
				);
	
		
		System.out.println(venda.getAll());
		System.out.println(produto.getAll());
		System.out.println(cliente.getAll());
		
	}

}
