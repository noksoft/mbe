package mx.com.nok.categoria.model.dto;

import java.io.Serializable;

public class SubcategoriaDTO implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String idSubcategoria;
	private String subcategoria;
	private String idCategoria;
	private String categoria;
	private boolean estatus;
	
	
	private String filterEstatusSubcategoria="";

	public String getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
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



	public String getFilterEstatusSubcategoria() {
		return filterEstatusSubcategoria;
	}



	public void setFilterEstatusSubcategoria(String filterEstatusSubcategoria) {
		this.filterEstatusSubcategoria = filterEstatusSubcategoria;
	}

	public String getIdSubcategoria() {
		return idSubcategoria;
	}

	public void setIdSubcategoria(String idSubcategoria) {
		this.idSubcategoria = idSubcategoria;
	}
	
}
