package br.com.ecommerce.beans;

public class Cliente {
	
	private int id;
	private String nome;
	private Endereco endereco;
	
	
	
	public Cliente() {
		super();
	}

	public Cliente(int id, String nome, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		
	}
	

	public String getAll() {
		return
				"ID....:" + id + "\n" +
				"Nome........:" + nome + "\n" +
				"Endereco........:\n" + endereco.getAll();
	}
	
	public void setAll(int id, String nome, Endereco endereco) {
		this.id=id;
		this.nome=nome;
		this.endereco=endereco;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
