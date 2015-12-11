package mx.com.nok.categoria.model.dto;

import java.io.Serializable;

public class TipoCategoriaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id_tipocategoria;
	private String tipocategoria;
	private Boolean estatus;
	private String filterEstatusTipocategoria;
	
	public String getId_tipocategoria() {
		return id_tipocategoria;
	}
	public void setId_tipocategoria(String id_tipocategoria) {
		this.id_tipocategoria = id_tipocategoria;
	}
	public String getTipocategoria() {
		return tipocategoria;
	}
	public void setTipocategoria(String tipocategoria) {
		this.tipocategoria = tipocategoria;
	}
	public Boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}
	public String getFilterEstatusTipocategoria() {
		return filterEstatusTipocategoria;
	}
	public void setFilterEstatusTipocategoria(String filterEstatusTipocategoria) {
		this.filterEstatusTipocategoria = filterEstatusTipocategoria;
	}
	
	@Override
	public String toString() {
		return "TipoCategoriaDTO [id_tipocategoria=" + id_tipocategoria
				+ ", tipocategoria=" + tipocategoria + ", estatus=" + estatus
				+ ", filterEstatusTipocategoria=" + filterEstatusTipocategoria
				+ "]";
	}

}
