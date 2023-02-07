package br.com.matrix.modelo;

public class Compras {
	private Long id;
	private String comprasRealizada;
	private String localCompras;
	private String dataComprasString;
	private String valorCompras;

	private Long usuarioId;

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "Compras [id=" + id + ", comprasRealizada=" + comprasRealizada + ", localCompras=" + localCompras
				+ ", dataComprasString=" + dataComprasString + ", valorCompras=" + valorCompras + ", usuarioId="
				+ usuarioId + "]";
	}

	

}
