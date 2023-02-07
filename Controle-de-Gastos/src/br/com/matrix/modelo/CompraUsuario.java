package br.com.matrix.modelo;

public class CompraUsuario {
	
	private String nome;
	private String comprasRealizada;
	private String localCompras;
	private String dataComprasString;
	private String valorCompras;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComprasRealizada() {
		return comprasRealizada;
	}
	public void setComprasRealizada(String comprasRealizada) {
		this.comprasRealizada = comprasRealizada;
	}
	public String getLocalCompras() {
		return localCompras;
	}
	public void setLocalCompras(String localCompras) {
		this.localCompras = localCompras;
	}
	public String getDataComprasString() {
		return dataComprasString;
	}
	public void setDataComprasString(String dataComprasString) {
		this.dataComprasString = dataComprasString;
	}
	public String getValorCompras() {
		return valorCompras;
	}
	public void setValorCompras(String valorCompras) {
		this.valorCompras = valorCompras;
	}
	@Override
	public String toString() {
		return "CompraUsuario [nome=" + nome + ", comprasRealizada=" + comprasRealizada + ", localCompras="
				+ localCompras + ", dataComprasString=" + dataComprasString + ", valorCompras=" + valorCompras + "]";
	}
	
	

}
