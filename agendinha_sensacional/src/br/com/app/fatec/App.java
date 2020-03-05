package br.com.app.fatec;

import br.com.modelo.fatec.Agenda;
import br.com.modelo.fatec.Pessoa;
import br.com.negocio.fatec.AsciiArt;
import br.com.negocio.fatec.Controle;
import br.com.negocio.fatec.Menu;

public class App {
	public static void main(String[] args) {
		AsciiArt.printAsciiArt("Lulas");
		Menu menu = new Menu();
		Agenda agenda = new Agenda();
		int op = 1000;
		while(op != 0) {
			menu.imprimirMenu();
			Controle controle = new Controle();
			op = controle.opcao();
			switch (op) {
			case 1:
				Pessoa p = new Pessoa("Robson");
				agenda.clientes.add(p);
				break;
				
			case 2:
				for(Pessoa i : agenda.clientes) {
					System.out.println(i.toString());				
				}
				break;
			
			default:
				menu.imprimirMenu();
			}
		}
		
	}
}








