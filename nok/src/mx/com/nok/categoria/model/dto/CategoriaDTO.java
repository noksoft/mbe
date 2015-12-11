package mx.com.nok.categoria.model.dto;

import java.io.Serializable;

public class CategoriaDTO implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;
	
	private String idCategoria;
	private String categoria;
	private String idtipocategoria;
	private String tipocategoria;
	private boolean estatus;
	private String filterEstatusCategoria="";
	
	public String toString(){
		
		return "\n[  idCategoria = " + idCategoria +
		"\n categoria = "+ categoria +
		"\n estatus = "+ estatus + "]";		
	}

	public String getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	public String getFilterEstatusCategoria() {
		return filterEstatusCategoria;
	}

	public void setFilterEstatusCategoria(String filterEstatusCategoria) {
		this.filterEstatusCategoria = filterEstatusCategoria;
	}

	public String getIdtipocategoria() {
		return idtipocategoria;
	}

	public void setIdtipocategoria(String idtipocategoria) {
		this.idtipocategoria = idtipocategoria;
	}

	public String getTipocategoria() {
		return tipocategoria;
	}

	public void setTipocategoria(String tipocategoria) {
		this.tipocategoria = tipocategoria;
	}
	
	
	

}
