package br.com.app.fatec;

import br.com.negocio.fatec.AsciiArt;
import br.com.negocio.fatec.Menu;

public class App {
	public static void main(String[] args) {
		AsciiArt.printAsciiArt("Serasa");
		Menu menu = new Menu();
		menu.imprimirMenu();
	}
}