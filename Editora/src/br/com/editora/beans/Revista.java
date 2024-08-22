package br.com.editora.beans;

public class Revista {
	private String nome;
	private String tipoCapa;
	private int totalPaginas;
	private double larguraCapa;
	private double alturaCapa;
	
	public Revista(String nome, String tipoCapa, int totalPaginas, double larguraCapa, double alturaCapa) {
		super();
		this.nome = nome;
		this.tipoCapa = tipoCapa;
		this.totalPaginas = totalPaginas;
		this.larguraCapa = larguraCapa;
		this.alturaCapa = alturaCapa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoCapa() {
		return tipoCapa;
	}
	public void setTipoCapa(String tipoCapa) {
		this.tipoCapa = tipoCapa;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	public double getLarguraCapa() {
		return larguraCapa;
	}
	public void setLarguraCapa(double larguraCapa) {
		this.larguraCapa = larguraCapa;
	}
	public double getAlturaCapa() {
		return alturaCapa;
	}
	public void setAlturaCapa(double alturaCapa) {
		this.alturaCapa = alturaCapa;
	}
	
	

}
