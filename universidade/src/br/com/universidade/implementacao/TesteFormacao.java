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
		Magica.s("Descri��o"),
		Magica.i("Dura��o"),
		Magica.i("Tipo")					
					);
			
		}else if (resp=='2') {
			formacao=new Bacharelado(
					Magica.f("Valor"),
					Magica.s("Descri��o"),
					Magica.i("Dura��o"),
					Magica.s("Proj Conclus�o"),
					Magica.i("Carga Hor�ria Estagio")
					);
		}else if (resp=='3') {
			formacao=new Pos(
					Magica.f("Valor"),
					Magica.s("Descri��o"),
					Magica.i("Dura��o"),
					Magica.s("N�vel"),
					Boolean.parseBoolean(Magica.s("Estendido?"))
					);
		}else {
			System.out.println("Op��o inv�lisa");
		}
		System.out.println(formacao.getAll());
	}

}
