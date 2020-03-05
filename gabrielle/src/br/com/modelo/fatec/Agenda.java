package br.com.modelo.fatec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	public List<Pessoa> pessoas = new ArrayList<Pessoa>();
	public Scanner scanner = new Scanner(System.in);
	
	public void cadastrarPessoa() {
		System.out.println("Insira o nome do cliente: \n");
		String nome = scanner.next();
		/*System.out.println("Insira o telefone do cliente: \n");
		String tel = scanner.next();
		System.out.println("Insira a data de nascimento do clinte: \n");
		String dn = scanner.next();
		System.out.println("Insira o gênero do cliente: \n");
		String gen = scanner.next();*/
		Pessoa c  = new Pessoa(nome);
		pessoas.add(c);
		System.out.println("Novo contato adicionado!");
	}

	public void imprimirClientes() {
		for (Pessoa pessoa : pessoas) {
			System.out.println("Nome: " + pessoa.getNome() );
		}
	}

	
}

