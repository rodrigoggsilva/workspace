package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Bacharelado;
import br.com.universidade.modelo.Formacao;
import br.com.universidade.modelo.Magica;
import br.com.universidade.modelo.Medio;
import br.com.universidade.modelo.Pos;

public class TesteFormacao {

	public static void main(String[] args) {
		Formacao formacao = new Medio();
		char resp = JOptionPane.showInputDialog("Digite:\n<1> Medio\n<2>Bacharelado\n<3>Pos").charAt(0);
		
		if (resp=='1') {
			formacao=new Medio(
		Magica.f("Valor"),
		Magica.s("Descrição"),
		Magica.i("Duração"),
		Magica.i("Tipo")					
					);
			
		}else if (resp=='2') {
			formacao=new Bacharelado(
					Magica.f("Valor"),
					Magica.s("Descrição"),
					Magica.i("Duração"),
					Magica.s("Proj Conclusão"),
					Magica.i("Carga Horária Estagio")
					);
		}else if (resp=='3') {
			formacao=new Pos(
					Magica.f("Valor"),
					Magica.s("Descrição"),
					Magica.i("Duração"),
					Magica.s("Nível"),
					Boolean.parseBoolean(Magica.s("Estendido?"))
					);
		}else {
			System.out.println("Opção inválisa");
		}
		System.out.println(formacao.getAll());
	}

}
