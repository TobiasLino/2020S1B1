package br.com.modelo.fatec;

import br.com.negocio.fatec.Controle;

public class Pessoa extends Controle{
	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		String info = "Nome: " + this.nome; 
		return info;
	}
}