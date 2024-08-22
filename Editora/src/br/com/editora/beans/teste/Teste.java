package br.com.editora.beans.teste;

import br.com.editora.beans.Album;

public class Teste {

	public static void main(String[] args) {
		Album albumUm = new Album("Gibi", "Capa dura", 227, 30, 50, "Figura da turma da monica", 50, 5, 3);
		
		albumUm.mostrarAtributos();
		albumUm.calcularAreaFigurinha();

	}
}
