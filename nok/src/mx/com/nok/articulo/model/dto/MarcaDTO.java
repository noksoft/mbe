package mx.com.nok.articulo.model.dto;

import java.io.Serializable;

public class MarcaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String idMarca;
	private String marca;
	private boolean estatus;		
	private String subcategoria;
	private String idSubcategoria;
	private String filterEstatusMarca;
	
	public String toString()
	{
		return 
				"\n\t [ idMarca = " +idMarca+
				"\n\t marca = " +marca+
				"\n\t estatus = " +estatus+"]";
	}


	public String getSubcategoria() {
		return subcategoria;
	}


	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}
		
	
	public String getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(String idMarca) {
		this.idMarca = idMarca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}


	public String getIdSubcategoria() {
		return idSubcategoria;
	}


	public void setIdSubcategoria(String idSubcategoria) {
		this.idSubcategoria = idSubcategoria;
	}


	public String getFilterEstatusMarca() {
		return filterEstatusMarca;
	}


	public void setFilterEstatusMarca(String filterEstatusMarca) {
		this.filterEstatusMarca = filterEstatusMarca;
	}

	
}
