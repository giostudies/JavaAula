package br.com.empresacinco.beans.teste;

import br.com.empresacinco.beans.Funcionario;

public class Teste {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Coordenador acadêmico", "Rafael Ronqui", "Masculino", 23);

		funcionario.mostrarAtributo();
	}
}
