package mx.com.nok.falla.model.dto;

public class CartegoriaDTO {
	
	private String idCategoria;
	private String descripcion;
	private Boolean estatus;
	private String filterEstatusCategoria;
	public String getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}
	public String getFilterEstatusCategoria() {
		return filterEstatusCategoria;
	}
	public void setFilterEstatusCategoria(String filterEstatusCategoria) {
		this.filterEstatusCategoria = filterEstatusCategoria;
	}

}
