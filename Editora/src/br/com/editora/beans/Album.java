package br.com.editora.beans;

public class Album extends Revista {
	private String tipoFigurinha;
	private int quantidadeFigurinhas;
	private double alturaFigurinha;
	private double larguraFigurinha;
	public double areaFigurinha;
	
	public Album(String nome, String tipoCapa, int totalPaginas, double larguraCapa, double alturaCapa, String tipoFigurinha, int quantidadeFigurinhas, double alturaFigurinha, double larguraFigurinha) {
		super(nome, tipoCapa, totalPaginas, larguraCapa, alturaCapa);
		this.tipoFigurinha = tipoFigurinha;
		this.quantidadeFigurinhas = quantidadeFigurinhas;
		this.alturaFigurinha = alturaFigurinha;
		this.larguraFigurinha = larguraFigurinha;
	}
	public String getTipoFigurinha() {
		return tipoFigurinha;
	}
	public void setTipoFigurinha(String tipoFigurinha) {
		this.tipoFigurinha = tipoFigurinha;
	}
	public int getQuantidadeFigurinhas() {
		return quantidadeFigurinhas;
	}
	public void setQuantidadeFigurinhas(int quantidadeFigurinhas) {
		this.quantidadeFigurinhas = quantidadeFigurinhas;
	}
	public double getAlturaFigurinha() {
		return alturaFigurinha;
	}
	public void setAlturaFigurinha(double alturaFigurinha) {
		this.alturaFigurinha = alturaFigurinha;
	}
	public double getLarguraFigurinha() {
		return larguraFigurinha;
	}
	public void setLarguraFigurinha(double larguraFigurinha) {
		this.larguraFigurinha = larguraFigurinha;
	}
	
	public void mostrarAtributos() {
		System.out.println("Nome da revista: " + getNome() +  "\n Tipo de capa: " + getTipoCapa() + " \n Total de páginas: " +
		+ getTotalPaginas() + "\n Largura da capa: " + getLarguraCapa() + " \n Altura da capa: " + getAlturaCapa() +  "\n Tipo de figurinha: " + getTipoFigurinha() + 
		"\n Quantidade de figurinha:" + getQuantidadeFigurinhas() + "\n Altura da figurinha: " + getAlturaFigurinha() +  "\n Largura da figurinha: " + getLarguraFigurinha());
	}
	
	public void calcularAreaFigurinha() {
		double areaFigurinha = getAlturaFigurinha() * getLarguraFigurinha();
		
		if (this.areaFigurinha > 12) {
			System.out.println("a área da figurinha é maior que 12cm quadrados");
		}
		else {
			System.out.println("a área da figurinha é menor que 12cm quadrados");
		}
	}
	

}
