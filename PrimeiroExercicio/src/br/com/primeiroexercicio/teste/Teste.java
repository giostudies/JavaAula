package br.com.primeiroexercicio.teste;

import javax.swing.JOptionPane;

import br.com.primeiroexercicio.beans.Mamifero;

public class Teste {
	
	public static void main(String[] args) {
		
	Mamifero mamifero = new Mamifero();
	
	mamifero.setEspecie(JOptionPane.showInputDialog("Qual a espécie do animal?"));
	mamifero.setNome(JOptionPane.showInputDialog("Qual o nome do animal?"));
	mamifero.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do animal?")));
	mamifero.setMesesGestacao(Integer.parseInt(JOptionPane.showInputDialog("Quantos meses de gestação?")));

	System.out.println("A espécie é " + mamifero.getEspecie() + "\n O nome do animal é: " + 
	mamifero.getNome() + "\n A idade do animal é: " + mamifero.getIdade() + "\n Meses de gestação do animal: "
	+ mamifero.getMesesGestacao());
	}
}
