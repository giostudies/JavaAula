package br.com.empresacinco.beans;

public class Funcionario extends Condominio {
	
	private String cargo;

	public Funcionario(String cargo, String nome, String sexo, int idade) {
		super(nome, sexo, idade);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void mostrarAtributo(){
		System.out.println("Nome: " + getNome() + "\n Sexo: " + getSexo() + "\n Idade:" + getIdade() 
		+ "\n Cargo:" + getCargo());
	}
	
	

}
