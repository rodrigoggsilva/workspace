package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Professor;

public class TesteProfessor {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setLogradouro(JOptionPane.showInputDialog("Logradouro"));
		endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
		endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
		
		Professor professor = new Professor ();
		
	//	professor.setAll(
				professor.setId(Integer.parseInt(JOptionPane.showInputDialog("ID")));
				professor.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
				professor.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Valor Hora")));
				professor.setFormacao(JOptionPane.showInputDialog("Formação"));
				professor.setEndereco(endereco)
				;
		System.out.println(professor.getAll());

	}

}
